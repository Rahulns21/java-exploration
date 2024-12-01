package conditionals;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /* If else in java */
        
        // generate a random number between 1 - 100
        Random random = new Random();
        
        // assign the random number to randomAge
        int randomAge = random.nextInt(100)+1;

        if(randomAge >= 18) {
            System.out.println("You are an adult! Your age is " + randomAge);
        } else if (randomAge > 12 && randomAge <= 17) {
            System.out.println("You are a teenager! Your age is " + randomAge);
        } else {
            System.out.println("Your age is " + randomAge + " still below 18 years of age");
        }

    }
}
