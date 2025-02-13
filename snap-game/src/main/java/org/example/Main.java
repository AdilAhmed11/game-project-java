package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creating a new CardGame object/instance called snapGame from the CardGame constructor using the new keyword.
        Snap snapGame = new Snap("Snap");

//        // Using the new object 'snapGame' calling the getDeck() method to see if i get a deck.
//        snapGame.getDeck();
//        System.out.println();

//        // Standard deck
//        System.out.println("Standard deck:");
//        snapGame.getDeck();
//        System.out.println();
//
//        // Shuffling the deck
//        System.out.println("Shuffled deck:");
//        snapGame.shuffleDeck();
//        snapGame.getDeck();
//
//        // Deal a card - testing the shuffled deck
//        System.out.println();
//        System.out.println("Dealt card: " + snapGame.dealCard());
//        System.out.println();
//
//        // Sort the deck in number order
//        System.out.println("Deck sorted in number order: ");
//        snapGame.sortDeckInNumberOrder();
//        snapGame.getDeck();
//        System.out.println();
//
//        // Sort the deck in suit order
//        System.out.println("Deck sorted in suit order: ");
//        snapGame.sortDeckIntoSuits();
//        snapGame.getDeck();

        snapGame.playGame();

    }
}