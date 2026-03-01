
public class Demo {
    public static void main(String[] args) {
        int i = 3;
        // Traditional switch statement
        switch (i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is not 1, 2 or 3");
        }

        /*
         * Recommeneded to use rule switch stetemtn instead of traditioonal switch
         * statement as it is more readable and easier to understand
         */
        int b = 5;
        switch (b) {
            case 1 -> System.out.println("b is 1");
            case 2 -> System.out.println("b is 2");
            case 3 -> System.out.println("b is 3");
            default -> System.out.println("b is not 1, 2 or 3");
        }
    }
}
