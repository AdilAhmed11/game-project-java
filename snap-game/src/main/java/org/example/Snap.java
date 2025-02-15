package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    private Card previousCard; // Stores the card that has just been played

    // Constructor -
    public Snap(String name) {
        super(name);
         // Calls the super/parent class constructor
    } // end constructor

    public void initialiseGame() {
        System.out.println("You have started a new SNAP game");
        System.out.println("Shuffling the deck of card");
        populateDeck();
        shuffleDeck();
    }

    // Method to play the game
    public void playGame() {
        this.initialiseGame();
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

            if (previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                // was getting nothing in scanner when I didn't have first condition
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
