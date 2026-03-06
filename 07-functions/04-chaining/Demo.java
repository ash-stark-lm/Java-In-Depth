// Function Chaining with deeper nesting
// Each method calls another method, creating a chain of executions.

public class Demo {

    public static void main(String[] args) {

        // Start the chain from calculate()
        int result = calculate(10, 5);

        System.out.println("Final Result: " + result);
    }

    // First method in the chain
    static int calculate(int a, int b) {

        // Calls process()
        int value = process(a, b);

        return value + 10;
    }

    // Second method in the chain
    static int process(int a, int b) {

        // Calls multiply() and subtract()
        int m = multiply(a, b);
        int s = subtract(a, b);

        return m + s;
    }

    // Third method in the chain
    static int multiply(int a, int b) {

        // Calls helper method
        int extra = helper(a);

        return (a * b) + extra;
    }

    // Fourth method in the chain
    static int subtract(int a, int b) {
        return a - b;
    }

    // Fifth method in the chain
    static int helper(int x) {
        return x / 2;
    }
}