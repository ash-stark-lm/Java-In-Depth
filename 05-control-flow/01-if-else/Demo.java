
public class Demo {
    public static void main(String[] args) {
        // Basic if-else statement
        int a = 10;
        int b = 20;

        if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is not equal to b");
        }
        // Nested if-else statement--> Not recommedned to use too many if-else
        // statements as hard to read and understand

        int c = 15;
        if (a > b) {
            if (a > c) {
                System.out.println("a is the greatest");
            } else {
                System.out.println("c is the greatest");
            }
        } else {
            if (b > c) {
                System.out.println("b is the greatest");
            } else {
                System.out.println("c is the greatest");
            }
        }

        // if-else-if ladder--> recommnended to use if-else-if ladder instead of nested
        // if-else as it is more readable and easier to understand
        if (a > b && a > c) {
            System.out.println("a is the greatest");
        } else if (b > a && b > c) {
            System.out.println("b is the greatest");
        } else {
            System.out.println("c is the greatest");
        }

    }
}
