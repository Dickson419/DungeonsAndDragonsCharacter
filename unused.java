//package DungeonsAndDragons;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class unused {
//    package DungeonsAndDragons;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//    public class Character {
//        private String name;
//        private String characterRace;
//        private String characterClass;
//
//        private ArrayList<Integer> stats = new ArrayList<>(); //might not need... USE the hashmap instead!
//        private ArrayList<Integer> rolls = new ArrayList<>();
//        private HashMap<String, Integer> abilities = new HashMap<>();
//
//        private int strength;
//        private int dexterity;
//        private int constitution;
//        private int intelligence;
//        private int wisdom;
//        private int charisma;
//
//        //constructor method
//        public Character() {
//            name();
//            System.out.println("Welcome " + this.name + "!");
//            System.out.println("\nYou are a " + pickRace() + " " + pickClass());
//        }
//
//        public String name(){
//            System.out.println("Choose a name for your character: ");
//            Scanner keyboard = new Scanner(System.in);
//            this.name = keyboard.nextLine();
//
//            return this.name;
//        }
//
//        public String pickRace() {
//            Scanner keyboard = new Scanner(System.in);
//            System.out.println("Pick your race: \n1. Dragonborn\n2. Dwarf\n3. Elf\n4. Half-Elf\n5. Halfling\n6. Half-Orc\n7. Human");
//            int choice = keyboard.nextInt();
//            switch (choice) {
//                // Case
//                case 1:
//                    choice = 1;
//                    this.characterRace = "Dragonborn";
//                    break;
//                case 2:
//                    choice = 2;
//                    this.characterRace = "Dwarf";
//                    break;
//                case 3:
//                    choice = 3;
//                    this.characterRace = "Elf";
//                    break;
//                case 4:
//                    choice = 4;
//                    this.characterRace = "Half-Elf";
//                    break;
//                case 5:
//                    choice = 5;
//                    this.characterRace = "Halfling";
//                    break;
//                case 6:
//                    choice = 6;
//                    this.characterRace = "Half-Orc";
//                    break;
//                case 7:
//                    choice = 7;
//                    this.characterRace = "Human";
//                    break;
//            }
//            System.out.println("Your race is " + this.characterRace);
//            return this.characterRace;
//        }
//
//        public String pickClass() {
//            Scanner keyboard = new Scanner(System.in);
//            System.out.println("\n\nPick your class: ");
//            System.out.println("\n1. Warlock\n2. Wizard\n3. Cleric\n4. Druid\n5. Paladin\n6. Ranger\n7. Rogue");
//            int choiceClass = keyboard.nextInt();
//            switch (choiceClass) {
//                // Case
//                case 1:
//                    this.characterClass = "Warlock";
//                    break;
//                case 2:
//                    this.characterClass = "Wizard";
//                    break;
//                case 3:
//                    this.characterClass = "Cleric";
//                    break;
//                case 4:
//                    this.characterClass = "Druid";
//                    break;
//                case 5:
//                    this.characterClass = "Paladin";
//                    break;
//                case 6:
//                    this.characterClass = "Ranger";
//                    break;
//                case 7:
//                    this.characterClass = "Rogue";
//                    break;
//            }
//            System.out.println("Your class is " + this.characterClass);
//            return this.characterClass;
//        }
//
//        // STATS
//
//        public HashMap<String, Integer> abilityScores() {
//            //Strength, Dexterity, Constitution, Intelligence, Wisdom and Charisma
//
//            strength = statCreationStrength(this.strength);
//            dexterity = statCreationDexterity(this.dexterity);
//            constitution = statCreationConstitution(this.constitution);
//            intelligence = statCreationIntelligence(this.intelligence);
//            wisdom = statCreationWisdom(this.wisdom);
//            charisma = statCreationCharisma(this.charisma);
//
//            abilities.put("Strength", this.strength);
//            abilities.put("Dexterity", this.dexterity);
//            abilities.put("Constitution", this.constitution);
//            abilities.put("Intelligence", this.intelligence);
//            abilities.put("Wisdom", this.wisdom);
//            abilities.put("Charisma", this.charisma);
//
//            return abilities;
//
//        }
//
//        //rolls are accumulating in the array... individual array for each method
//        //ONE method for generating the stats into an array/map. User then picks which stat to assign to each ability!
//
//        public int statCreationStrength(int stat){
//            //get 4 rolls of a 6 sided dice
//            for(int i = 0; i<4; i++){
//                int roll = Dice.roll(6);
//                System.out.println(roll);
//                rolls.add(roll);
//            }
//
//            //sum the total of the array for a stat
//            for (int i = 0; i < rolls.size(); i++) {
//                stat += rolls.get(i);
//            }
//            this.strength = stat;
//            //System.out.println("Sum of your strength is: " + stat);
//            //showStats();
//            return this.strength; //or stat?
//        }
//
//        public int statCreationDexterity(int stat){
//            for(int i = 0; i<4; i++){
//                int roll = Dice.roll(6);
//                System.out.println("\n" + roll);
//                rolls.add(roll);
//            }
//
//            for (int i = 0; i < rolls.size(); i++) {
//                stat += rolls.get(i);
//            }
//            this.dexterity = stat;
//            return this.dexterity;
//        }
//
//        public int statCreationConstitution(int stat){
//            for(int i = 0; i<5; i++){
//                int roll = Dice.roll(6);
//                rolls.add(roll);
//            }
//
//            for (int i = 0; i < rolls.size(); i++) {
//                stat += rolls.get(i);
//            }
//            this.constitution = stat;
//            return this.constitution;
//        }
//
//        public int statCreationIntelligence(int stat){
//            for(int i = 0; i<5; i++){
//                int roll = Dice.roll(6);
//                rolls.add(roll);
//            }
//
//            for (int i = 0; i < rolls.size(); i++) {
//                stat += rolls.get(i);
//            }
//            this.intelligence = stat;
//            return this.intelligence;
//        }
//
//        public int statCreationWisdom(int stat){
//            for(int i = 0; i<5; i++){
//                int roll = Dice.roll(6);
//                rolls.add(roll);
//            }
//
//            for (int i = 0; i < rolls.size(); i++) {
//                stat += rolls.get(i);
//            }
//            this.wisdom = stat;
//
//            return this.wisdom;
//        }
//
//        public int statCreationCharisma(int stat){
//            for(int i = 0; i<5; i++){
//                int roll = Dice.roll(6);
//                rolls.add(roll);
//            }
//
//            for (int i = 0; i < rolls.size(); i++) {
//                stat += rolls.get(i);
//            }
//            this.charisma = stat;
//            return this.charisma;
//        }
//
//        public void showStats(){
////        System.out.println("Strength = " + this.strength);
////        System.out.println("Constitution = " + this.constitution);
////        System.out.println("Wisdom = " + this.wisdom);
////        System.out.println("Intelligence = " + this.intelligence);
////        System.out.println("Charisma = " + this.charisma);
//
//            //iterate over the abilities hashmap
//        /*
//        To iterate over the key-value pairs in a HashMap and display the contents, you can use a for loop and the entrySet method.
//        The entrySet method returns a set view of the mappings contained in the HashMap.
//        You can then loop over the entries in the set and use the getKey and getValue methods to access the key and value of each entry.
//         */
//            for(Map.Entry<String, Integer> entry : abilities.entrySet()){
//                String key = entry.getKey();
//                Integer value = entry.getValue();
//
//                System.out.println(key + " : " + value);
//            }
//        }
//rolls are accumulating in the array... individual array for each method
//ONE method for generating the stats into an array/map. User then picks which stat to assign to each ability!

//    public ArrayList<ArrayList<Integer>> statCreation() {
//        ArrayList<Integer> abilityScore = new ArrayList<>();
//        int roll = Dice.roll(6, 4);
//        abilityScore.add(roll);
//        System.out.println("Your four roll total is: " + roll + "\nthe lowest will be removed and the others will be added" +
//                " to give you a total you can assign to an ability of your choice!");
//        Collections.sort(abilityScore);
//        abilityScore.remove(0);
//
//        System.out.println("Elements of ArrayList are:");
//        for (int i = 0; i < abilityScore.size(); i++) {
//            System.out.println(abilityScore.get(i) + " ");
//        }
//
//
//        stats.add(abilityScore);
//
//        return stats;
//
//        }
//
//    }
//
//}
