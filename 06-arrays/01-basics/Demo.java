public class Demo {

    public static void main(String[] args) {

        // Method 1: Declaration + Initialization (Array Literal)
        int[] rollNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Roll Numbers (Using Array Literal):");
        printRollNumbers(rollNumbers);

        // Method 2: Declaration + Memory Allocation, then Initialization
        int[] rollNumbers2 = new int[10]; // Allocates memory for 10 integers

        for (int i = 0; i < rollNumbers2.length; i++) {
            rollNumbers2[i] = i + 1; // Assign values dynamically
        }

        System.out.println("\nRoll Numbers (Using new keyword):");
        printRollNumbers(rollNumbers2);

        // Display array lengths
        System.out.println("\nArray Lengths:");
        System.out.println("rollNumbers length: " + rollNumbers.length);
        System.out.println("rollNumbers2 length: " + rollNumbers2.length);
    }

    // Reusable method to print roll numbers
    public static void printRollNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Roll number of student " + (i + 1) + " is: " + arr[i]);
        }
    }
}