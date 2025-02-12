package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CardGame snapGame = new CardGame("Snap"); // Creating a new CardGame object called snapGame from the CardGame
        // constructor using the new keyword.

        snapGame.getDeck(); // Using the new object 'snapGame' calling the getDeck() method to see if i get a deck.
        System.out.println();

        System.out.println("Dealing new card"); // Printing to break the output up.
        Card dealtCard = snapGame.dealCard(); // New variable of class Card and calling dealCard method on snapGame
        System.out.println(dealtCard); // Printing out dealt card. Should be 2h


    }
}