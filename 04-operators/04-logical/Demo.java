// works on expression that results in boolean value (true or false) and are used to combine multiple conditions or to invert the result of a condition. They are commonly used in conditional statements (like if, while, for) to control the flow of the program based on complex conditions.
/*
1. && (Logical AND): Returns true if both operands are true; otherwise, it returns false. If the first operand is false, the second operand is not evaluated (short-circuit evaluation).
2. || (Logical OR): Returns true if at least one of the operands is true; otherwise, it returns false. If the first operand is true, the second operand is not evaluated (short-circuit evaluation).
3. ! (Logical NOT): Returns true if the operand is false; otherwise, it returns false. It is a unary operator that inverts the value of a boolean expression.
*/
public class Demo {
    public static void main(String[] args) {
        // Logical Operators
        int a = 25;
        int b = 10;
        int c = 15;

        boolean d = (a < b) && (b < c);

        // Short circuit
        System.out.println(d); // false

        boolean e = (a < b) || (b < c);
        System.out.println(e); // true

        // Logical NOT
        boolean f = !(a < b);
        System.out.println(f); // true
    }
}
