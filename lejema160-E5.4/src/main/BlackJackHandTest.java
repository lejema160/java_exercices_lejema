package main;

import java.util.Random;
import java.util.Scanner;

import blackJackUtils.BlackjackHand;
import blackJackUtils.Card;
import blackJackUtils.Deck;

public class BlackJackHandTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int) (Math.random() * 4);
		Deck deck = new Deck();
		deck.shuffle(); // Put all the used cards back into the deck (if any),
						// and shuffle the deck into a random order

		int numberOfCards = 2 + random;
		BlackjackHand hand = new BlackjackHand();
		boolean testAgain = true; // if the user wants to continue
		boolean input = true; // input is true if the user does not do any error about the syntax (answer the question with o or n and nothing else)
		boolean win = false; // win is true when the user catch a 21 hand

		while (deck.cardsLeft() >= numberOfCards && testAgain && !win) {
			if (input) {
				random = (int) (Math.random() * 4);
				numberOfCards = 2 + random;
				System.out.println("Hand : ");
				hand = new BlackjackHand();
				for (int i = 0; i < numberOfCards; i++) {
					Card card = deck.dealCard();
					hand.addCard(card);
					System.out.println("  " + card.toString());
				}
				System.out.print("Hand value : ");
				int value = hand.getBlackjackValue();
				if (value == 21) {
					System.out.println(value + "\nYou won!");
					testAgain = false;
					win = true;
				} else {
					System.out.println(value);
					System.out.println("Do you want to retry? (o/n)");
				}
			}
			if (!win) {
				String s = sc.nextLine();
				if (s.equals("o")) {
					input = true;
					testAgain = true;
				} else if (s.equals("n")) {
					input = true;
					testAgain = false;
				} else {
					input = false;
					System.out.println("Wrong input");
				}
			}
		}

		if (deck.cardsLeft() < numberOfCards) {
			System.out.println("Not enough cards in the deck");
		}
		System.out.println("End\n\n");
		sc.close();
	}

}