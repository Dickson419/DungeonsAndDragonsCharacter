package DungeonsAndDragons;

public class characterCreation {
    public static void main(String[] args) {
        Character player1 = new Character();
        System.out.println("\nStats\n");

        player1.abilityScores();
        player1.abilityCreator();
        player1.assignStatsToAbilities();

    }
}
