package org.example;

public class Player {
    private String name;
    private int score;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }// end Constructor

    // Getter for name
    public String getName() {
        return name;
    }// end Getter method for name

    // Getter for score
    public int getScore() {
        return score;
    }// end Getter method for score

    // Method to increment the score
    public void incrementScore() {
        score ++;
    }

    // Method to describe player and score
    public String toString() {
        return name + "(Score: " + score + ")";
    }
}
