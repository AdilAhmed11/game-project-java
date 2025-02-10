package org.example;

import java.util.ArrayList;

public class CardGame {
    // Create the fields for the CardGame class
    private ArrayList<Card> deckOfCards; // Field to store the deck of cards

    // Constructor - A special method to initialise objects.
    // Initialising deckOfCards array list AND the populateDeck method below
    public CardGame() {
        this.deckOfCards = new ArrayList<>();
        populateDeck(); // Populate the deck when the game is created
    }

    // Method to populate the deck
    private void populateDeck() {
        String[] suits = {"♥", "♦", "♣", "♠"}; // Unicode for suits
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        // Loop through suits and symbols to create all 52 cards
        // Using a nested loop
        // https://stackoverflow.com/questions/33455724/creating-array-of-deck-of-cards-java
        for(String suit: suits) { // Outer for-each loop that iterates over each suit in the suits array
            for(int i = 0; i < symbols.length; i++) { // Inner for loop runs from i=0, to length of symbols array.
                deckOfCards.add(new Card(suit, symbols[i], values[i]));
                // A new Card object is created and added to the deckOfCards array.
            }// end inner for loop
        }// end outer for-each loop
    }// end populateDeck method

    // Method to list out the cards in the deck
    public void getDeck() {
        for(Card card : deckOfCards) {
            System.out.println(card);
        }// end getDeck() method
    }
}
