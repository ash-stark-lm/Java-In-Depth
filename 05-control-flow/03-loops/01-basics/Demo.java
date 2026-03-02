/*
While loop: A while loop is a control flow statement that allows code to be executed repeatedly based on a given boolean condition. The syntax of a while loop is as follows:
*   while (condition) {
    * code to be executed
* }
The condition is evaluated before the execution of the loop body. If the condition is true, then the code inside the loop is executed. After the code is executed, the condition is evaluated again. This process continues until the condition becomes false. If the condition is false at the beginning, the code inside the loop will not be executed at all.
 Do-While loop: A do-while loop is similar to a while loop, but it guarantees
that the code inside the loop will be executed at least once, even if the condition is false. The syntax of a do-while loop is as follows:
*   do {
    * code to be executed
* } while (condition);
In a do-while loop, the code inside the loop is executed first, and then
 the condition is evaluated. If the condition is true, the loop continues to execute; if it is false, the loop terminates.
 For loop: A for loop is a control flow statement that allows code to be executed repeatedly   based on a given boolean condition, and it also provides a way to initialize and update a loop control variable. The syntax of a for loop is as follows:
*   for (initialization; condition; update) {
    * code to be executed
* }
 In a for loop, the initialization is executed once at the beginning of the loop. The condition is evaluated before each iteration of the loop, and if it is true, the code inside the loop is executed. After the code is executed, the update statement is executed, and then the condition
is evaluated again. This process continues until the condition becomes false.
 For-each loop: A for-each loop, also known as an enhanced for loop, is a control flow statement that allows you to iterate over elements in an array or a collection without needing to manage an index variable. The syntax of a for-each loop is as follows:  
*   for (type variable : arrayOrCollection) {
    * code to be executed
* }
 In a for-each loop, the variable is assigned the value of each element in the array or collection, one at a time, and the code inside the loop is executed for each element. This loop is particularly useful for iterating over arrays and collections in a more concise and readable way, without the need for an index variable or manual incrementing.
*/

public class Demo {
    public static void main(String[] args) {

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println("While loop iteration: " + i);
            i++;
        }

        // do-while loop
        int j = 0;
        do {
            System.out.println("Do-while loop iteration: " + j);
            j++;
        } while (j < 5);

        // for loop
        for (int k = 0; k < 5; k++) {
            System.out.println("For loop iteration: " + k);
        }

        // for-each loop
        int[] numbers = { 1, 2, 3, 4, 5 }; // for-each loop is used to iterate over elements in an array or a collection
                                           // without needing to manage an index variable.
        for (int number : numbers) {
            System.out.println("For-each loop iteration: " + number);
        }
    }
}
