// Function Overloading: Multiple methods can have the same name
// if their parameter list differs (by number, type, or order of parameters).
public class Demo {

    public static void main(String[] args) {

        // Calls sum() method that accepts 3 integers
        int result1 = sum(2, 3, 4);

        // Calls sum() method that accepts 2 integers
        int result2 = sum(2, 3);

        // Print results
        System.out.println(result1);
        System.out.println(result2);

        // Calls overloaded sum() method with double parameters
        int result3 = sum(2.5, 3.5);
        System.out.println(result3);

        // Calls greet() with parameters (String, int)
        greet("John", 25);

        // Calls greet() with parameters (int, String)
        // Same name but different parameter order
        greet(25, "John");
    }

    // Method to add two integers
    static int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method: adds three integers
    // Difference: number of parameters
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method: adds two double values
    // Difference: parameter data type
    static int sum(double a, double b) {
        return (int) (a + b); // result cast to int
    }

    // Method with parameters (String name, int age)
    static void greet(String name, int age) {
        System.out.println("Hello! " + name + " You are " + age + " years old");
    }

    // Overloaded greet() method with reversed parameter order
    static void greet(int age, String name) {
        System.out.println("Your age is " + age + " and your name is " + name);
    }
    // This is NOT valid method overloading

    // Method overloading cannot be done by changing only the return type.
    // The parameter list must be different (type, number, or order).
    // Both methods below have:
    // - Same method name: fun
    // - Same parameters: none
    // Because of this, the compiler cannot decide which method to call.

    // ❌ Invalid example
    // static int fun() {
    // return 0;
    // }

    // static void fun() {
    // }
    // This will cause a compile-time error because Java does NOT consider
    // the return type when determining overloaded methods.
}