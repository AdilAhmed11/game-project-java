package org.example;

public class Card {
    private String suit; // Field for heart, diamond, club, spade
    private String symbol; // Field for 2,3,4,5,6,7,8,9,10,J,Q,K,A
    private int value; // Field for 2,3,4,5,6,7,8,9,10,11,12,13,14

    // Constructor
    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    // toString method to describe the class
    public String toString() {
        return symbol + suit; // E.g. 4 Hearts, J Clubs, etc
    }



}
