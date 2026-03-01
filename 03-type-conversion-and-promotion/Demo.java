
public class Demo {
    public static void main(String[] args) {
        byte b = 100;
        int i = b; // Implicit type conversion (widening)
        System.out.println("Byte value: " + b);
        System.out.println("Integer value after implicit conversion: " + i);

        int x = 300;
        byte z = (byte) x; // Explicit type conversion (narrowing). 300%(range of byte=256)=44
        System.out.println("Integer value: " + x);
        System.out.println("Byte value after explicit conversion: " + z);

        char c = 'a';
        int asciiValue = c; // Implicit type conversion (widening)
        System.out.println("Character value: " + c);
        System.out.println("ASCII value of character: " + asciiValue);

        double d = 3.14;
        int j = (int) d; // Explicit type conversion (narrowing). --> Truncating conversion
        System.out.println("Double value: " + d);
        System.out.println("Integer value after explicit conversion: " + j);

        // Boolean to any data type --> Not possible in Java, we cannot convert boolean
        // to any other data type or vice versa.
        /*
         * boolean boolValue = false;
         * int a = (int) boolValue; // This will cause a compile-time error
         */

        /// Type Promotion --> automatic conversion of smaller data type to larger data
        /// type during arithmetic
        byte num = 10;
        // num = num * 2; this gives error--> incompatible types: possible lossy
        // conversion from int to byte
        num = (byte) (num * 2); // Explicitly cast the result back to byte
        System.out.println("Result after type promotion: " + num);

        byte number = 42;
        char ch = 'a';
        short st = 1024;
        int k = 50000;
        float f = 5.67f;
        double ds = 0.1234;

        double result = (f * number) + (k / ch) - (ds * st);

        // f * b --> float
        // i / c --> integer
        // d * s --> doubl

        // float + integer --> float - double --> double

        System.out.println((f * number) + " + " + (k / ch) + " - " + (ds * st));
        System.out.println("result = " + result);

    }
}
