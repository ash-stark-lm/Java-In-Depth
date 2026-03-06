// Local vs Global (Class-level) Scope Example

public class Demo {

    // Global variable (class-level variable)
    // Accessible by all methods inside this class
    static int globalNumber = 100;

    public static void main(String[] args) {

        // Local variable (scope limited to main method)
        int localNumber = 20;

        System.out.println("Local variable in main: " + localNumber);

        if (localNumber > 0) {
            int j = 3;// Scope limited to if block
            System.out.println("Local variable in if block: " + j);
        }
        int j = 4;
        System.out.println("Local variable in main after if block: " + j);

        // Accessing global variable
        System.out.println("Global variable: " + globalNumber);

        // Calling another method
        display();
    }

    static void display() {

        // Local variable inside display() method
        int localDisplay = 50;

        System.out.println("Local variable in display(): " + localDisplay);

        // Global variable can be accessed here as well
        System.out.println("Accessing global variable in display(): " + globalNumber);
    }
}