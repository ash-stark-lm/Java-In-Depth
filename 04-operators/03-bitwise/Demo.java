/*
1. &: Bitwise AND: Performs a bitwise AND operation on two integers. Each bit of the result is 1 if the corresponding bits of both operands are 1; otherwise, it is 0.
2. |: Bitwise OR: Performs a bitwise OR operation on two integers. Each
bit of the result is 1 if at least one of the corresponding bits of the operands is 1; otherwise, it is 0.
3. ^: Bitwise XOR (exclusive OR): Performs a bitwise exclusive OR operation on
two integers. Each bit of the result is 1 if the corresponding bits of the operands are different; otherwise, it is 0.
4. ~: Bitwise NOT: Performs a bitwise NOT operation on a single integer. Unary
5. <<: Left Shift: Shifts the bits of the first operand to the left by the number of positions specified by the second operand. The vacated bits on the right are filled with zeros.
6. >>: Right Shift: Shifts the bits of the first operand to the right by
the number of positions specified by the second operand. The vacated bits on the left are filled with the sign bit (the most significant bit) for signed types, and with zeros for unsigned types.
7. >>>: Unsigned Right Shift: Shifts the bits of the first operand to the
right by the number of positions specified by the second operand. The vacated bits on the left are filled with zeros.

Bitwise operators are used for performing bit-level operations on integer types (byte, short, int, long). They are commonly used in low-level programming, such as system programming, embedded systems, and performance-critical applications where direct manipulation of bits is necessary.
We also combine like >>=, <<=, &=, |=, ^= for compound assignment with bitwise operators.
*/

/*
A B A&B A|B A^B ~A ~B
0 0 0 0 0 1 1
0 1 0 1 1 1 0
1 0 0 1 1 0 1
*/
public class Demo {
    public static void main(String[] args) {

    }

}
