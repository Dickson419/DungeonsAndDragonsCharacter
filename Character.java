package DungeonsAndDragons;

import java.util.*;

public class Character {
    private String name;
    private String characterRace;
    private String characterClass;

    private ArrayList<Integer> stats = new ArrayList<>(); //might not need... USE the hashmap instead!
    private ArrayList<Integer> rolls = new ArrayList<>();
    private HashMap<String, Integer> abilities = new HashMap<>();

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;


    //constructor method
    public Character() {
        name();
        System.out.println("Welcome " + this.name + "!");
        System.out.println("\nYou are a " + pickRace() + " " + pickClass());
    }

    public String name() {
        System.out.println("Choose a name for your character: ");
        Scanner keyboard = new Scanner(System.in);
        this.name = keyboard.nextLine();

        return this.name;
    }

    public String pickRace() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pick your race: \n1. Dragonborn\n2. Dwarf\n3. Elf\n4. Half-Elf\n5. Halfling\n6. Half-Orc\n7. Human");
        int choice = keyboard.nextInt();
        switch (choice) {
            // Case
            case 1:
                choice = 1;
                this.characterRace = "Dragonborn";
                break;
            case 2:
                choice = 2;
                this.characterRace = "Dwarf";
                break;
            case 3:
                choice = 3;
                this.characterRace = "Elf";
                break;
            case 4:
                choice = 4;
                this.characterRace = "Half-Elf";
                break;
            case 5:
                choice = 5;
                this.characterRace = "Halfling";
                break;
            case 6:
                choice = 6;
                this.characterRace = "Half-Orc";
                break;
            case 7:
                choice = 7;
                this.characterRace = "Human";
                break;
        }
        System.out.println("Your race is " + this.characterRace);
        return this.characterRace;
    }

    public String pickClass() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n\nPick your class: ");
        System.out.println("\n1. Warlock\n2. Wizard\n3. Cleric\n4. Druid\n5. Paladin\n6. Ranger\n7. Rogue");
        int choiceClass = keyboard.nextInt();
        switch (choiceClass) {
            // Case
            case 1:
                this.characterClass = "Warlock";
                break;
            case 2:
                this.characterClass = "Wizard";
                break;
            case 3:
                this.characterClass = "Cleric";
                break;
            case 4:
                this.characterClass = "Druid";
                break;
            case 5:
                this.characterClass = "Paladin";
                break;
            case 6:
                this.characterClass = "Ranger";
                break;
            case 7:
                this.characterClass = "Rogue";
                break;
        }
        System.out.println("Your class is " + this.characterClass);
        return this.characterClass;
    }

    // STATS

    public HashMap<String, Integer> abilityScores() {
        //Strength, Dexterity, Constitution, Intelligence, Wisdom and Charisma
        //display abilities

        for (Map.Entry<String, Integer> entry : abilities.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " : " + value);
        }

        return abilities;

    }

    public int abilityCreator(){
        int abilityNumber = 0;
        for(int i =0; i<6; i++){
            abilityNumber = Dice.roll(6, 4);
            stats.add(abilityNumber);
        }
        return abilityNumber;
    }

    public void displayPoints(){
        int count = 1;
        System.out.println("\n\n----- Your ability points -----");
        System.out.println(" Number  |  Ability Points");
        for(int i = 0; i<stats.size(); i++){
            System.out.println("   " + count + "     |    " + stats.get(i));
            count +=1;
        }
    }

    // WORK on this part next. Allow the user to assign an ability a point using the index number from stat
    public void assignStatsToAbilities(){
        displayPoints();
        String done = "n";
        System.out.println();

        while(done != "y"){
            System.out.println("\n\t\tYou will now assign your ability points to an ability. \n" +
                    "select a number (1-6 ONLY) when prompted to assign it. \n" +
                    "There will be an option at the end to redo your ability scores or you can confirm them!\n\n");
            //.remove an index once selected
            //confirm at the end

            Scanner keyboard = new Scanner(System.in);
            System.out.println("STRENGTH\nSelect a number to assign your points...");
//            int numDextrity = keyboard.nextInt();
//            this.strength = stats.get(numDextrity);
//            abilities.put("Strength", this.strength); //add to hashmap
//            stats.remove(numDextrity -1);
//            displayPoints();


            int numStrength = keyboard.nextInt();
            // Make sure that the user has entered a valid index
            if (numStrength > 0 && numStrength <= stats.size()) {
                this.strength = stats.get(numStrength - 1); // Subtract 1 from the user's input to get the correct index
                abilities.put("Strength", this.strength); //add to hashmap
                stats.remove(numStrength - 1); // Remove the element at the correct index
            }
            else {
                System.out.println("Invalid input! Please enter a number between 1 and " + stats.size());
                continue; // Go back to the beginning of the loop

                //want this to just give them the option to redo
            }
            displayPoints();
            abilityScores();

            System.out.println("\nDEXTERITY\nSelect a number to assign your points...");
            int numDexterity = keyboard.nextInt();
            // Make sure that the user has entered a valid index
            if (numDexterity > 0 && numDexterity <= stats.size()) {
                this.dexterity = stats.get(numDexterity - 1); // Subtract 1 from the user's input to get the correct index
                abilities.put("Dexterity", this.dexterity); //add to hashmap
                stats.remove(numDexterity - 1); // Remove the element at the correct index
            }
            else {
                System.out.println("Invalid input! Please enter a number between 1 and " + stats.size());
                continue; // Go back to the beginning of the loop
            }
            displayPoints();
            abilityScores();
            System.out.println("Happy with this setup? Enter 'y' for YES and 'n' for NO. 'n' will allow you to reassign" );
            done = keyboard.next();
            if(done == "n"){
                continue; //go back to beginning
            }
            else{
                break;
            }






//            System.out.println("DEXTERITY\nSelect a number to assign your points...");
//            int numDexterity = keyboard.nextInt();
//            this.dexterity = stats.get(numDexterity);
//            abilities.put("Dexterity", this.dexterity); //add to hashmap
//            stats.remove(numDexterity -1);
//            displayPoints();
//
//            System.out.println("CONSTITUTION\nSelect a number to assign your points...");
//            int numConstitution = keyboard.nextInt();
//            this.constitution = stats.get(numConstitution);
//            abilities.put("Constitution", this.constitution); //add to hashmap
//            stats.remove(numConstitution -1);
//            displayPoints();
//
//            System.out.println("INTELLIGENCE\nSelect a number to assign your points...");
//            int numIntelligence = keyboard.nextInt();
//            this.intelligence = stats.get(numIntelligence);
//            abilities.put("Intelligence", this.intelligence); //add to hashmap
//            stats.remove(numIntelligence -1);
//            displayPoints();
//
//            System.out.println("WISDOM\nSelect a number to assign your points...");
//            int numWisdom = keyboard.nextInt();
//            this.wisdom = stats.get(numWisdom);
//            abilities.put("Wisdom", this.wisdom); //add to hashmap
//            stats.remove(numWisdom -1);
//            displayPoints();
//            abilityScores();
//
//            System.out.println("CHARISMA\nSelect a number to assign your points...");
//            int numCharisma = keyboard.nextInt();
//            this.charisma = stats.get(numCharisma);
//            abilities.put("Charisma", this.charisma); //add to hashmap
//            stats.remove(numCharisma -1);
            //displayPoints();

            //append all to hashmap and display to user
            //are they happy? Yes --> continue. No reassign stats.



        }
        System.out.println("Out of loop");
        abilityScores();

    }




    public void showStats() {
        System.out.println("SHOW STATS");

            //iterate over the abilities hashmap
        /*
        To iterate over the key-value pairs in a HashMap and display the contents, you can use a for loop and the entrySet method.
        The entrySet method returns a set view of the mappings contained in the HashMap.
        You can then loop over the entries in the set and use the getKey and getValue methods to access the key and value of each entry.
         */
            for (Map.Entry<String, Integer> entry : abilities.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();

                System.out.println(key + " : " + value);
            }

        }

    }

