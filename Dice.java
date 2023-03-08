package DungeonsAndDragons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Dice {

    private static Random random = new Random();


    // Returns a random integer from 1 to the number of sides
    public static int roll(int numberOfSides) {
        return random.nextInt(numberOfSides) + 1;
    }

    public static int roll(int numberOfSides, int numberOfRolls) {
        ArrayList<Integer> abilityArr = new ArrayList<>();

        // Create a variable to store the total sum of the rolls
        int total = 0;
        // Use a loop to roll the dice the specified number of times
        for (int i = 1; i <= numberOfRolls; i++) {
            // Generate a random number between 1 and the number of sides on the dice
            int roll = random.nextInt(numberOfSides) + 1;
            // display each di roll to the player
            System.out.println("Roll "+ i + " = " + roll);
            // Add the roll to the total sum
            abilityArr.add(roll);
            total += roll;
            //System.out.println("Dice total =  " + total);
        }
        System.out.println("DICE TOTAL = " + total);
        Collections.sort(abilityArr);
        abilityArr.remove(0);
        System.out.println("Lowest roll will be removed and the remaining total will be used by you\n" +
                "to assign to an ability of your choice!");

        int sum = 0;
        for (int i = 0; i < abilityArr.size(); i++) {
            sum += abilityArr.get(i);
        }
        System.out.println("You have" + sum);

        return sum;
    }
}
