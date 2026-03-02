/*
* Multidimesional array is an array of arrays. It is a collection of data items that are organized in a grid-like structure. Each element in a multidimensional array can be accessed using multiple indices, which represent the position of the element in the array.
* The most common type of multidimensional array is the 2D array, which is an array of arrays. It can be visualized as a table with rows and columns. Each element in
*/
public class Demo {
    public static void main(String[] args) {

        // declaration and initialization of a 2D array
        int[][] students = { { 50, 30, 90 }, { 60, 70, 80 }, { 40, 50, 60 } }; // 2D Array

        for (int i = 0; i < students.length; i++) {
            System.out.println("Marks of student " + (i + 1) + ":");
            for (int j = 0; j < students[i].length; j++) {
                System.out.println("Subject " + (j + 1) + ": " + students[i][j]);
            }
        }

        // declaration of a 2D array with memory allocation
        int[][] students2 = new int[3][3]; // Allocates memory for
        for (int i = 0; i < students2.length; i++) {
            for (int j = 0; j < students2[i].length; j++) {
                students2[i][j] = (i + 1) * (j + 1) * 10; // Assigning values dynamically
            }
        }
        System.out.println("\nMarks of students in students2 array:");
        for (int i = 0; i < students2.length; i++) {
            System.out.println("Marks of student " + (i + 1) + ":");
            for (int j = 0; j < students2[i].length; j++) {
                System.out.println("Subject " + (j + 1) + ": " + students2[i][j]);
            }
        }
    }

}
