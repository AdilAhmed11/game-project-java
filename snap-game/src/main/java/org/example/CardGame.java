package org.example;

import java.util.ArrayList;

public class CardGame {
    // Create the fields for the CardGame class
    private ArrayList<Card> deckOfCards; // Field to store the deck of cards

    // Constructor - A special method to initialise objects.
    // Initialising deckOfCards array list AND the populateDeck method below
    public CardGame(String name) {
        this.deckOfCards = new ArrayList<>();
        populateDeck(); // Populate the deck when the game is created
    }

    // Method to populate the deck
    private void populateDeck() {
        String[] suits = {"♥", "♦", "♣", "♠"}; // Unicode for suits
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};


    }
}
