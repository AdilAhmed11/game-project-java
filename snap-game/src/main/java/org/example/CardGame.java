package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class CardGame {
    // Create the fields for the CardGame class
    private ArrayList<Card> deckOfCards; // Field to store the deck of cards
    private String name;
    private int numberOfDecks;


    // Constructor - A special method to initialise objects.
    // Initialising deckOfCards array list AND the populateDeck method below
    public CardGame(String name, int numberOfDecks) {
        this.deckOfCards = new ArrayList<>();
        this.name = name;
        this.numberOfDecks = 1;
//        populateDeck(); // Populate the deck when the game is created
    }

    // Method to populate the deck
    public void populateDeck() {
        String[] suits = {"♥", "♦", "♣", "♠"}; // Unicode values for the  suits
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        // Loop through suits and symbols to create all 52 cards
        // Using a nested loop
        // https://stackoverflow.com/questions/33455724/creating-array-of-deck-of-cards-java
        for (String suit : suits) { // Outer for-each loop that iterates over each suit in the suits array
            for (int i = 0; i < symbols.length; i++) { // Inner for loop runs from i=0, to length of symbols array.
                deckOfCards.add(new Card(suit, symbols[i], values[i]));
                // A new Card object is created and added to the deckOfCards array.
            }// end inner for loop
        }// end outer for-each loop
    }// end populateDeck method

    // Method to list out the cards in the deck
    public void getDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }// end getDeck() method
    }

    // Method to deal card from the top of the deck and return it
    public Card dealCard() { // Method of class Card call dealCard
        if (deckOfCards.isEmpty()) { // Dealing with empty deck.
            System.out.println("The deck is empty");
            return null;
        } else {
            return deckOfCards.removeFirst(); // removeFirst method removes the first element of the collections
        }
    }// end dealCard() method

    // Method to sort the deck in number order and return deck
    public ArrayList<Card> sortDeckInNumberOrder() {
        deckOfCards.sort(Comparator.comparingInt(card -> card.getValue())); // Lambda functions (parameters) ->
        // {expression or statement}
        // A Comparator is an interface in Java. It has one main method called compare.
        // Comparator explanation: https://www.notion.so/Comparators-1980f2333b6e804487cfef17a59b3e1e
        return deckOfCards;
    }

    // Method to sort the deck in to suits and return deck
    public ArrayList<Card> sortDeckIntoSuits() {
        deckOfCards.sort((card1, card2) -> { // sort by suit first
            int suitComparison = card1.getSuit().compareTo(card2.getSuit());
            if (suitComparison != 0) {
                return suitComparison; // Sort by suit first
            }
            return Integer.compare(card1.getValue(), card2.getValue()); // Then sort by value
        });
        return deckOfCards;
    }

    // Method to shuffle the deck into a random order
    // https://stackoverflow.com/questions/39557701/shuffle-a-deck-of-cards-in-java
    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

    // Getter for the deck
    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }
}





