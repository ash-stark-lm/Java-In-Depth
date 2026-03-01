
public class PrimitiveDataType {
    public static void main(String[] args) {
        // Integers. -> byte, short, int, long
        // declaring and defining variables at same time
        byte smallNumber = 100;
        short year = 2024;
        int age = 25;
        long population = 8000000000L;// not readbale so we can use underscore for better readability
        long distanceToSun = 149_600_000_000L;

        System.out.println(
                "Small Number: " + smallNumber + ", Year: " + year + ", Age: " + age + ", Population: " + population);
        System.out.println("Distance to Sun: " + distanceToSun + " meters");
        // By default it is decimal represnetation but we can also represent in octal,
        // hexadecimal and binary
        int octalNumber = 012; // Octal representation (10 in decimal)
        int hexNumber = 0x1A; // Hexadecimal representation (26 in decimal
        int binaryNumber = 0b1010; // Binary representation (10 in decimal)
        System.out.println("Octal Number: " + octalNumber + ", Hexadecimal Number: " + hexNumber + ", Binary Number: "
                + binaryNumber);

        // Real numbers. -> float, double
        float pi = 3.14f;// 'f' suffix indicates a float literal
        double e = 2.71828;// double precision is the default for floating-point literals
        double d = 6.022e23; // Scientific notation (6.022 x 10^23)
        System.out.println("Pi: " + pi);
        System.out.println("Euler's Number: " + e);
        System.out.println("Avogadro's Number: " + d);
        // Characters
        char grade = 'A';
        System.out.println("Grade: " + grade);

        boolean isJavaFun = true;
        System.out.println("Is Java fun? " + isJavaFun);
    }
}
