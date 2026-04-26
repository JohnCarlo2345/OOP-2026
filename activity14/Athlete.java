package activity14;

import java.util.ArrayList;

public class Athlete implements Competitor, Comparable<Athlete>, Cloneable {
    private String name;
    private int score;
    private ArrayList<String> trophies;

    public Athlete(String name, int score) {
        this.name = name;
        // Validate score using the static method
        this.score = Competitor.isValidScore(score) ? score : 0;
        this.trophies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addTrophy(String trophy) {
        trophies.add(trophy);
    }

    public ArrayList<String> getTrophies() {
        // Return a copy to prevent external modification
        return new ArrayList<>(trophies);
    }

    // From Competitor interface
    @Override
    public void playMatch() {
        System.out.println(name + " is playing the match.");
    }

    // From Comparable interface
    @Override
    public int compareTo(Athlete other) {
        // Sort by score descending, then name ascending
        if (this.score != other.score) {
            return Integer.compare(other.score, this.score);
        } else {
            return this.name.compareTo(other.name);
        }
    }

    // From Cloneable interface - Deep Copy
    @Override
    public Athlete clone() {
        try {
            Athlete copy = (Athlete) super.clone();
            // Create new list for trophies so changes don't affect original
            copy.trophies = new ArrayList<>(this.trophies);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Score: " + score + ", Trophies: " + trophies;
    }
}

