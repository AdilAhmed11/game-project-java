# 🃏 Snap Game

## 📌 Introduction

The Snap card game is a popular and fast-paced game where players compete to win cards by calling "Snap" when two consecutive cards match. Players take turns placing down cards on a pile and when two consecutive cards match, a player will call "Snap" and collect the pile. The player with the most cards at the end is the winner.

This project focuses on creating a two-player version of the Snap game using the Java programming language.

The following are links to the repo and game:

-   _Repo Link_
-   _Game Link_

## 💾 Download it to play locally - Instructions

...

## 🎮 Game Description

### Game Rules

1.  Setup: The game uses a standard deck of 52 cards. The deck is shuffled.
2.  Taking Turns: The players take turns picking a card and placing it in a centre pile.
3.  Snap: If two consecutive cards match in **Rank** (2, 3, 4, ..., Q, K, A), then the first player to call 'SNAP' wins.
4.  Losing: If a player calls snap incorrectly, then a penalty is incurred - **TO BE DECIDED**.

### Main Components

-   Standard deck of 52 cards
-   Two players

## 🔍 Game Breakdown - Pseudocode

The game will be broken down in to the following sections:

1.  Stage 1 - Create the deck of cards

-   Create a CardGame CLASS

    -   Fields / Variables in the CLASS
        -   ArrayList<Card> deckOfCards
        -   String name
    -   CONSTRUCTOR of name CardGame with one parameter of String name
        -   Initialise the name attribute.
        -   Call a method to create and populate the deckOfCards with 52 cards.
    -   METHOD createDeck()
        -   Loop through all 4 suits (hearts, clubs, diamonds, spades).
        -   For each suit, loop through all 13 symbols (2, 3, ..., K, A).
        -   Create a new Card object with the current suit, symbol, and corresponding value.
        -   Add the Card object to the deckOfCards ArrayList.
    -   METHOD getDeck():
        -   Loop through the deckOfCards ArrayList.
        -   Print each card using its toString method.

-   Create a Card CLASS

    -   Fields / Variables in the CLASS
        -   String suit - use Unicode characters to get the symbols
        -   String symbol (2, 3, ..., 10, J, Q, K, A)
        -   int value (2, 3, ..., 13, 14)
    -   CONSTRUCTOR of name CardGame with one parameter of String name
        -   Initialise the suit, symbol, and value attributes.
    -   METHOD toString():
        -   Return a string describing the card (4 Hearts, 9 Clubs).

2.  Stage 2 - Core Functionality

-   In the CardGame CLASS
    -   METHOD dealCard():
        -   Check if the deckOfCards is not empty - Print a message and return null.
        -   Remove the first card from the deckOfCards arrayList.
    -   METHOD sortDeckInNumberOrder():
        -   Sort the deckOfCards ArrayList by the card's value.
        -   Return the sorted deck.
    -   METHOD sortDeckIntoSuits():
        -   Sort the deckOfCards ArrayList first by suit, then by value.
        -   Return the sorted deck.
    -   METHOD shuffleDeck():
        -   Randomly shuffle the deckOfCards ArrayList.
        -   Return the shuffled deck.

3.  Implement the Snap Game

-   Create a Snap CLASS that extends CardGame

    -   Fields/Variables
        -   Card Variable to store the previously played card
    -   CONSTRUCTOR Snap(String name):

        -   Call the superclass constructor to initialise the name and deck.
        -   Shuffle the deck at initialisation.
        
    -   METHOD playGame():
        -   For Loop until the game ends:
            -   Wait for the user to press Enter (simulate a turn).
            -   Deal a card using the dealCard method.
            -   Add the dealt card to the playedCards ArrayList.
            -   Display the dealt card to the user.
            -   Check if the last two cards in playedCards have the same symbol:
                -   If yes, print "Snap! You win!" and end the game.
                -   If no, continue the loop.
        - If cards finish without matching, then end the game.

4.  Two-player game with a Timer
-   Create a Player CLASS 
    -   Fields/Variables
        -   String type to store name
        -   int type to store the score. Score starts at 0.
    -   CONSTRUCTOR Snap(String name):
        -   this.name = name to refer to the object
        -   this.score = score to refer to the object
    -   Getters / Setters
        -   getter for the name
        -   getter for the score
    -   Method to increment the score
        -   doesn't return, so void
    -   Method to display score for the player???
        -   returns name and score

-   In the Snap CLASS
    -   Fields/Variables
        -   Add a player1 and player 2 variable
        -   Add a boolean to for the snapOpportunity
        -   Add a timer variable for the 2-second limit
    -   CONSTRUCTOR Snap(String name): 
        - Add this.player = player (for player1 and 2)
    -   playGame() method:
        -   Alternate between player1 and player2
            -   player1's turn: 
                -   Same as previous method (deal card, check card to match)
                - THEN if snap opportunity, change it to true and have condition for 2 second timer.
            -   player2's turn...
    -   Scanner. write "snap"
    -   Update the card.
        - If snap, then reset previous card, if not current card is previous crad.
    -   Print out final score

      

5. Extras
- Multiple rounds with a score counter. (Best of 5 or 7 or x games)

## ⚠️ Challenges Encountered

## 🚀 Future Improvements

## MVP

-   Code Quality
-   Commit Frequency
