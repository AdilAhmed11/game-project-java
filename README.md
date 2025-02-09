# 🃏 Snap Game

## 📌 Introduction

The Snap card game is a popular and fast-paced game where players compete to win cards by calling "Snap" when two consecutive cards match. Players take turns placing down cards on a pile and when two consecutive cards match, a player will call "Snap" and collect the pile. The player with the most cards at the end is the winner.

This project focuses on creating a two-player version of the Snap game using the Java programming language.

The following are links to the repo and game:

-   _Repo Link_
-   _Game Link_

## 🎮 Game Description

### Game Rules

Rules created by Hasbro: https://www.hasbro.com/common/instruct/Snap.PDF

1.  Setup: The game uses a standard deck of 52 cards. The deck is shuffled and the players receive an equal amount of cards.
2.  Taking Turns: The players take turns placing cards on a centre pile, one card at a time.
3.  Snap: If two consecutive cards match in **Suit** (Clubs, Hearts, Spades, Diamonds) or **Rank**, then a player can call snap and collect the pile of cards.
4.  Winning: The game is played until one player runs out of cards.
5.  Losing: If a player calls snap incorrectly, then a penalty is incurred - **TO BE DECIDED**.

### Main Components

-   Standard deck of 52 cards
-   Two players

## 💻 Game Implementation

...

## 🔍 Game Breakdown

The game will be broken down in to the following sections:

1.  Initialisation

-   Have a short intro block of text for the rules and how to win
-   Create a deck of 52 cards
-   Shuffle the deck
-   Initialise player1's deck as empty
-   Initialise player2's deck as empty
-   Deal the deck to both players, splitting it equally
-   Initialise the centre pile as empty
-   Set gameOver to false

2.  Main Game Loop

-   If it's player1's turn:
    -   player1 places a card from their deck on the centre pile
    -   If the card matches the top card of the centre pile:
        -   player1 checks for snap
        -   If player1 writes "snap" within 2 seconds:
            -   player1 wins the round
            -   player1 adds the centre pile to their deck
        -   Else:
            -   player2's (computer's) turn
-   If it's player2's (computer's) turn:
    -   player2 (computer) places a card from their deck on the centre pile
    -   If the card matches the top card of the centre pile:
        -   player2 (computer) checks for snap
        -   If player2 (computer) **will** write "snap" after 2 seconds:
            -   player2 (computer) wins the round
            -   player2 (computer) adds the centre pile to their deck
        -   Else:
            player1's turn

3.  Snap Check

-   If the top two cards of the center pile are the same:
    -   player1 has 2 seconds to write "snap" into the command line
    -   If player1 writes "snap", they win the centre pile
    -   player2 (computer) will write "snap" after 2 seconds and add the centre pile to their deck

4.  Winning Condition

-   If player1 runs out of cards/ deck is empty:
    -   Set gameOver to true
-   If player2 (computer) runs out of cards/ deck is empty:

    -   Set gameOver to true

-   When a player has run out of cards, a message will pop up and say "player1/player2 has run out of cards"

5.  End Game

-   If player1 has more cards:
    -   Print "Player 1 wins!"
-   If player2 (computer) has more cards:
    -   Print "Player 2 wins!"
-   If both players have the same number of cards:
    -   Print "It's a tie!"

## ⚠️ Challenges Encountered

## 🚀 Future Improvements

## MVP

-   Code Quality
-   Commit Frequency
