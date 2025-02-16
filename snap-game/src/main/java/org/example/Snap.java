package org.example;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Snap extends CardGame {
    private Card previousCard; // Stores the card that has just been played
    private Player player1;
    private Player player2;
    private boolean snapOpportunity;
    private Timer timer;

    // Constructor -
    public Snap(String name, Player player1, Player player2) {
        super(name);
        this.player1 = player1;
        this.player2 = player2;
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
        System.out.println("Welcome! Two players will take turns to deal a card and get a SNAP!");

        // For loop to deal cards one by one
        for(int i = 0; i < getDeckOfCards().size(); i++) {
            Player currentPlayer = (i % 2 == 0) ? player1 : player2; // Alternate between players
            System.out.println("\n" + currentPlayer.getName() + ", it's your turn. Press Enter to deal a card...");
            scanner.nextLine(); // Waiting for the user to press Enter

            // Deal a new card
            Card currentCard = dealCard();

            // Display the dealt card
            System.out.println("Dealt card: " + currentCard);

            if (previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                // was getting nothing in scanner when i didn't have first condition
                System.out.println("SNAP OPPORTUNITY! Type 'snap' within 2 seconds to win!");
                snapOpportunity = true;

                // Start a 2s timer
                timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (snapOpportunity) {
                            System.out.println("Time's up! " + currentPlayer.getName() + " missed the snap opportunity.");
                            snapOpportunity = false;
                        }
                    }
                }, 2000); // 2 seconds

                // Check if the player types "snap" in time
                String input = scanner.nextLine();
                if (snapOpportunity && input.equalsIgnoreCase("snap")) {
                    System.out.println(currentPlayer.getName() + " wins the round!");
                    currentPlayer.incrementScore();
                    snapOpportunity = false;
                } else if (snapOpportunity) {
                    System.out.println(currentPlayer.getName() + " typed the wrong input or was too late.");
                }

                // Reset the previous card
                previousCard = null;
            } else {
                previousCard = currentCard; // Updating the played card to match the card
            }
        }

        // End of game
        System.out.println("\nGame over! Final scores:");
        System.out.println(player1);
        System.out.println(player2);

        // Determine the winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("It's a tie!");
        }
        scanner.close(); // Close the Scanner
    }
}
