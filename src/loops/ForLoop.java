package loops;

public class ForLoop {
    public static void main(String[] args) {

        /* for loop: executes a block of code a limited amount of times */

        // this loops starts from zero and counts till 10
        for(int i = 0; i<=10; i++) {
            System.out.println("Count: " + i);
        }

        // Add a line break after the first loop
        System.out.println();

        // this loop counts from 10 to 0 in reverse
        for(int i = 10; i>=0; i--) {
            System.out.println("Reverse Count: " + i);
        }

        // Add a line break after the first loop
        System.out.println();

        // this loop counts from 1 to 100
        for (int i = 0; i<=100; i+=2) {
            System.out.println("Count: " + i);
        }
    }
}
