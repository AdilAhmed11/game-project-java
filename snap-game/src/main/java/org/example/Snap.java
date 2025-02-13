package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    private Card previousCard; // Stores the card that has just been played

    // Constructor -
    public Snap(String name) {
        super(name); // Calls the super/parent class constructor
        shuffleDeck(); // Shuffle the deck at the start of the game
    } // end constructor

    // Method to play the game
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game! Press ENTER to deal a card.");

        // For loop to deal cards one by one
        for(int i = 0; i < getDeckOfCards().size(); i++) {
            System.out.println("Press ENTER to deal a card...");
            scanner.nextLine(); // Waiting for the user to press Enter


            // Deal a new card
            Card currentCard = dealCard();

            // Display the dealt card
            System.out.println("Dealt card: " + currentCard);

            // Check if currentCard matches the previous playedCard
            if (previousCard != null && currentCard.getSymbol().equals(dealCard().getSymbol())) {
                // was getting nothing in scanner when i didn't have first condition
                System.out.println("SNAP! You win!");
                scanner.close();
            }

            // Updating the played card to match the card
            previousCard = currentCard;
        }

        // If loop ends and deck is empty
        System.out.println("No more cards left to deal. Game Over!");
        scanner.close();


    }// end playGame method



}
