/*
* In java we have jump statements that allow us to control the flow of loops and switch statements. The main jump statements in Java are:
* 1. break: The break statement is used to exit from a loop or a switch statement prematurely. When a break statement is encountered inside a loop, the loop is immediately terminated, and the program continues with the next statement after the loop. In a switch statement, the break statement is used to exit from the switch block after a case has been executed, preventing the execution of subsequent cases.
* 2. continue: The continue statement is used to skip the current iteration of a loop and move on to the next iteration. When a continue statement is encountered inside a loop, the remaining code in the current
*/
public class Demo {
    public static void main(String[] args) {

        // break statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Going to continue loop");

        // Continue statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
