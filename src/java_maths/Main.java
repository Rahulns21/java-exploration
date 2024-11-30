package java_maths;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double a;
        double b;
        double c;

        // compares and prints the larger number
        System.out.println(Math.max(x, y));

        // compares and prints the smaller number
        System.out.println(Math.min(x, y));

        // rounds it of to the nearest whole number
        System.out.println(Math.round(x));

        // finds the square root of a number
        System.out.println(Math.sqrt(x));

        // gives the absolute version of a number
        System.out.println(Math.abs(y));

        /* Program to find the hypotenuse of a triangle */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("The hypotenuse is : " + c);

        scanner.close();
    }
}
