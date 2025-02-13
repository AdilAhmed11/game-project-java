package org.example;

public class Card {
    private String suit; // Field to store the card's suit (i.e. heart, diamond, club, spade)
    private String symbol; // Field store the symbol (i.e. 2,3,4,5,6,7,8,9,10,J,Q,K,A)
    private int value; // Field to store the value (i.e. 2,3,4,5,6,7,8,9,10,11,12,13,14)

    // Constructor - A special method to initialise objects.
    public Card(String suit, String symbol, int value) {
        // Initialises the card with a suit, symbol, and value
        // this. - A reference variable that refers to the current instance of the class.
        // It is used within an instance method or a constructor to access members of the current object
        // such as instance variables, methods, and constructors.
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    // Getters - methods
    public String getSuit() {
        return suit;
    }// end getSuit getter method

    public String getSymbol() {
        return symbol;
    }// end getSymbol getter method

    public int getValue() {
        return value;
    }// end getValue getter method

    // toString method to describe the class
    // Returns a string representation of a card
    public String toString() {

        return symbol + " of " + suit; // E.g. 4 of Hearts, J of Clubs, etc
    }// end toString method

}
