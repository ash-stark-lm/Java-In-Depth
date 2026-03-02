/* Java also supports labels, which are identifiers followed by a colon (:) that can be used to mark a specific block of code. Labels are primarily used in conjunction with break and continue statements to control the flow of loops. 
They allow you to specify which loop to break out of or continue when you have nested loops.

*/

public class Demo {
    public static void main(String[] args) {

        // Using labels with break statement
        outerLoop: // This is a label for the outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);

            for (int j = 1; j <= 3; j++) {

                if (j == 2) {
                    break outerLoop; // This will break out of the outer loop when j is 2
                }
                System.out.println("Inner loop iteration: " + j);
            }
        }

        System.out.println("Exited the outer loop");

        // Using labels with continue statement
        anotherOuterLoop: // This is a label for another outer loop
        for (int x = 1; x <= 3; x++) {
            System.out.println("Another outer loop iteration: " + x);
            for (int y = 1; y <= 3; y++) {
                if (y == 2) {
                    continue anotherOuterLoop; // This will skip to the next iteration of the outer loop when y is 2
                }
                System.out.println("Inner loop iteration: " + y);
            }
        }

    }
}
