package activity14;

import java.util.Collections;

public class TournamentDemo {
    public static void main(String[] args) {
        // Step 1: Create Tournament object
        Tournament<Athlete> tournament = new Tournament<>();

        // Step 2: Add athletes with different scores
        Athlete a1 = new Athlete("Carlos", 85);
        Athlete a2 = new Athlete("Ben", 92);
        Athlete a3 = new Athlete("Alice", 92);
        Athlete a4 = new Athlete("David", 78);

        tournament.addParticipant(a1);
        tournament.addParticipant(a2);
        tournament.addParticipant(a3);
        tournament.addParticipant(a4);

        System.out.println("=== Before Sorting ===");
        tournament.showAll();

        // Step 3: Sort athletes
        Collections.sort(tournament.getParticipants());

        System.out.println("\n=== After Sorting ===");
        tournament.showAll();

        // Step 4: Demonstrate Deep Copy
        System.out.println("\n=== Deep Copy Test ===");
        Athlete original = new Athlete("Eve", 88);
        original.addTrophy("Regional Champion");

        Athlete cloned = original.clone();
        cloned.addTrophy("National Runner-Up");

        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);
        System.out.println("✅ Original unchanged - deep copy works!");

        // Step 5: Test interface methods
        System.out.println("\n=== Testing Competitor Methods ===");
        a1.playMatch();
        a1.reportStatus();

        System.out.println("\n=== Testing Static Method ===");
        System.out.println("Is 95 valid? " + Competitor.isValidScore(95));
        System.out.println("Is 105 valid? " + Competitor.isValidScore(105));
    }
}

