package DungeonsAndDragons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Stats {
    /*
    Determine ability scores: each character has six stats:
    Strength, Dexterity, Constitution, Intelligence, Wisdom and Charisma. Here's how the stats or generated:


    Roll four 6-sided dice and record the total of the highest three scores. Do this six times.
    These are the ability scores. The player gets to assign one of the numbers to each of the stats.

    For example, I roll four dice and score 1, 4, 3, and 2. My first score is therefore 4+3+2 = 9.
    I do the same thing 5 more times and end up with the scores 8, 14, 12, 15, 18 and 10.
    I then decide to:
    assign the 18 to strength,
    the 8 to dexterity,
    the 14 to Constitution,
    the 10 to intelligence,
    the 15 to Wisdom
    and the 12 to charisma.
     */
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    ArrayList<Integer> rolls = new ArrayList<>();
    private HashMap<String, Integer> abilities = new HashMap<>();

    public HashMap<String, Integer> abilityScores() {
        //Strength, Dexterity, Constitution, Intelligence, Wisdom and Charisma

        strength = statCreationStrength(this.strength);
        dexterity = statCreationDexterity(this.dexterity);
        constitution = statCreationConstitution(this.constitution);
        intelligence = statCreationIntelligence(this.intelligence);
        wisdom = statCreationWisdom(this.wisdom);
        charisma = statCreationCharisma(this.charisma);

        abilities.put("Strength", this.strength);
        abilities.put("Dexterity", this.dexterity);
        abilities.put("Constitution", this.constitution);
        abilities.put("Intelligence", this.intelligence);
        abilities.put("Wisdom", this.wisdom);
        abilities.put("Charisma", this.charisma);

        return abilities;

    }

    public int statCreationStrength(int stat){
        //get 4 rolls of a 6 sided dice
        for(int i = 0; i<5; i++){
            int roll = Dice.roll(6);
            rolls.add(roll);
        }

        //sum the total of the array for a stat
        for (int i = 0; i < rolls.size(); i++) {
            stat += rolls.get(i);
        }
        this.strength = stat;
        //System.out.println("Sum of your strength is: " + stat);
        //showStats();
        return this.strength; //or stat?
    }

    public int statCreationDexterity(int stat){
        for(int i = 0; i<5; i++){
            int roll = Dice.roll(6);
            rolls.add(roll);
        }

        for (int i = 0; i < rolls.size(); i++) {
            stat += rolls.get(i);
        }
        this.dexterity = stat;
        return this.dexterity;
    }

    public int statCreationConstitution(int stat){
        for(int i = 0; i<5; i++){
            int roll = Dice.roll(6);
            rolls.add(roll);
        }

        for (int i = 0; i < rolls.size(); i++) {
            stat += rolls.get(i);
        }
        this.constitution = stat;
        return this.constitution;
    }

    public int statCreationIntelligence(int stat){
        for(int i = 0; i<5; i++){
            int roll = Dice.roll(6);
            rolls.add(roll);
        }

        for (int i = 0; i < rolls.size(); i++) {
            stat += rolls.get(i);
        }
        this.intelligence = stat;
        return this.intelligence;
    }

    public int statCreationWisdom(int stat){
        for(int i = 0; i<5; i++){
            int roll = Dice.roll(6);
            rolls.add(roll);
        }

        for (int i = 0; i < rolls.size(); i++) {
            stat += rolls.get(i);
        }
        this.wisdom = stat;

        return this.wisdom;
    }

    public int statCreationCharisma(int stat){
        for(int i = 0; i<5; i++){
            int roll = Dice.roll(6);
            rolls.add(roll);
        }

        for (int i = 0; i < rolls.size(); i++) {
            stat += rolls.get(i);
        }
        this.charisma = stat;
        return this.charisma;
    }

    public void showStats(){

        //iterate over the abilities hashmap
        /*
        To iterate over the key-value pairs in a HashMap and display the contents, you can use a for loop and the entrySet method.
        The entrySet method returns a set view of the mappings contained in the HashMap.
        You can then loop over the entries in the set and use the getKey and getValue methods to access the key and value of each entry.
         */
        for(Map.Entry<String, Integer> entry : abilities.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " : " + value);
        }
    }


}
