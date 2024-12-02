package conditionals;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        /* logical operators : used to connect two or more expressions

           && - (AND) both conditions must be true
           || - (OR) either condition must be true
           ! - (NOT) reverses boolean value of condition */

        // (AND) logical operator

        int temp = 25;

        if (temp > 30) {
            System.out.println("It is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }

        // (OR) logical operator
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! press e or E to quit: ");
        String response = scanner.next();

        // ! - (NOT) reverses the boolean value of condition
        if (response.equals("e") || response.equals("E")) {
            System.out.println("You exit the game!");
        } else {
            System.out.println("You are still playing the game!");
        }

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("You are playing a game! press q or Q to quit: ");
        String response2 = scanner2.next();

        // ! - (NOT) reverses the boolean value of condition
        if (!response2.equals("q") && !response2.equals("Q")) {
            System.out.println("You are still playing the game!");
        } else {
            System.out.println("You quit the game!");
        }

    }
}
