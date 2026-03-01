/*
1. ==: Checks if the values of two operands are equal. If they are equal, it returns true; otherwise, it returns false.
2. !=: Checks if the values of two operands are not equal. If they are not
equal, it returns true; otherwise, it returns false.
3. >: Checks if the value of the left operand is greater than the value of the right
operand. If it is, it returns true; otherwise, it returns false.
4. <: Checks if the value of the left operand is less than the value of the right
operand. If it is, it returns true; otherwise, it returns false.
5. >=: Checks if the value of the left operand is greater than or equal to the
value of the right operand. If it is, it returns true; otherwise, it returns false.
6. <=: Checks if the value of the left operand is less than or equal to the
value of the right operand. If it is, it returns true; otherwise, it returns false

Relational operators gives result in boolean value (true or false) and they are used to compare two values. They are commonly used in conditional statements (like if, while, for) to control the flow of the program based on certain conditions.
They are expressions that evaluate to true or false and are often used in decision-making structures to determine which block of code should be executed based on the outcome of the comparison.
*/

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // if we do a=b => this is assigning the value of b to a and this is not a
        // relational operator but if we do a==b then this is checking the equality of a
        // and b and this is relational operator

        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true
    }
}
