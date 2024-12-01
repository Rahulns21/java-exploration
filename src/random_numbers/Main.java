package random_numbers;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // generates random number between 1 - 6
        int x = random.nextInt(6)+1;

        // generates random double
        double y = random.nextDouble();

        // generates random boolean: true or false
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
