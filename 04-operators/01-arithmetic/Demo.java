/*
Arithmetic Operators in Java:
1. Addition (+): Adds two operands.
2. Subtraction (-): Subtracts the second operand from the first.
3. Multiplication (*): Multiplies two operands.
4. Division (/): Divides the first operand by the second. If both operands are integers
5. Modulus (%): Returns the remainder of the division of the first operand by the second.
6. Increment (++): Increases an integer value by one.
7. Decrement (--): Decreases an integer value by one.
8. +=: Adds the right operand to the left operand and assigns the result to the left operand.
9. -=: Subtracts the right operand from the left operand and assigns the result to
    the left operand.
10. *=: Multiplies the left operand by the right operand and assigns the result to
    the left operand.
11. /=: Divides the left operand by the right operand and assigns the result to the left operand.
12. %=: Takes the modulus using the left and right operands and assigns the result to the left operand.
 */
public class Demo {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        int c = a + b;
        System.out.println("Addition: " + c);

        int d = a - b;
        System.out.println("Subtraction: " + d);

        int e = a * b;
        System.out.println("Multiplication: " + e);

        int f = a / b;
        System.out.println("Division: " + f);

        int g = a % b;
        System.out.println("Modulus: " + g);

        // Increment and Decrement; Prefix and Postfix
        // currenlt value of a is 20
        // Post Increment and Post Decrement first assign then increase or decrease
        int num = a++;// num gets assigned the value of a (20) and then a is incremented to 21
        // num=a ; a=a+1;
        System.out.println(" After Post Increment: " + num); // 20

        num = b--; // num gets assigned the value of b (10) and then b is decremented to 9
        System.out.println("After Post Decrement: " + num); // 10

        // pre decrement and pre increment first increase or decrease then assign
        num = ++a; // a is incremented to 22 and then num gets assigned the value of a (22)
        // a=a+1; num=a;
        System.out.println("After Pre Increment: " + num); // 22
        num = --b; // b is decremented to 8 and then num gets assigned the value of b (8)
        System.out.println("After Pre Decrement: " + num); // 8

        // Compound Assignment Operators
        a += 5; // a = a + 5
        System.out.println("After a += 5: " + a); // 25
        a -= 3; // a = a - 3
        System.out.println("After a -= 3: " + a); // 22
        a *= 2; // a = a * 2
        System.out.println("After a *= 2: " + a); // 44
        a /= 4; // a = a / 4
        System.out.println("After a /= 4: " + a); // 11
        a %= 3; // a = a % 3
        System.out.println("After a %= 3: " + a); // 2

    }
}
