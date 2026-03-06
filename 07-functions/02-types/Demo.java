public class Demo {

    public static void main(String[] args) {

        // Calling a function that takes no input and returns nothing
        sayHello();

        // Calling a function that takes input but returns nothing
        sayHelloWithName("Ashish");

        // Calling a function that returns a value but takes no input
        // The returned value is printed
        System.out.println("Random Addition: " + randomAdd());

        // Calling a function that takes input parameters and returns a value
        System.out.println("Sum: " + sum(3, 4));

    }

    /*
     * Functions with no return type -> void functions
     * "void" means the function performs some action but does not return any value
     */

    // 1. Function with NO input and NO return value
    // It simply prints "Hello"
    static void sayHello() {
        System.out.println("Hello");
        // return;// we can use return keyword to exit the function but it is
        // unnecessary
    }

    // 2. Function with INPUT but NO return value
    // It accepts a name as a parameter and prints a greeting message
    static void sayHelloWithName(String name) {
        System.out.println("Hello " + name);
    }

    /*
     * Functions with return type
     * These functions perform some operation and return a value
     * The returned value can then be used by the caller
     */

    // 3. Function with NO input but RETURNS a value
    // It generates two random numbers between 0 and 99 and returns their sum
    static int randomAdd() {
        int a = (int) (Math.random() * 100); // generate random number 0-99
        int b = (int) (Math.random() * 100); // generate random number 0-99
        return a + b; // return the sum of both numbers
    }

    // 4. Function with INPUT and RETURN value
    // It takes two integers and returns their sum
    static int sum(int a, int b) {
        return a + b;
    }

}