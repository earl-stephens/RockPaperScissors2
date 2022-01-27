package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObject[] objects = {new Rock(), new Paper(), new Scissors()};
	private int counter = 0;
	private int winLossCounter = 0;
	
	public void run() {
	String[] results = {"Draw", "Win", "Lose"};
	Scanner scanner = new Scanner(System.in);
	
	/* This is a game loop.  It's waiting on user input
	 * and keeps running until the input is provided.
	 */
	do {
		Random random = new Random();
		GameObject randomObject1 = objects[random.nextInt(objects.length)];
		
		System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors.");
		GameObject randomObject2 = objects[scanner.nextInt() - 1];

		displayWinner(randomObject1, randomObject2);
		
		int resultsIndex = randomObject2.compareTo(randomObject1);
		updateCounter(resultsIndex);
		updateWinLossCounter(resultsIndex);

		System.out.println(results[resultsIndex]);

	} while(counter < 3);
	
	scanner.close();
	announceWinner();
	}
	
	private void announceWinner() {
		if(winLossCounter >= 2) {
			System.out.println("You Won!");
		} else {
			System.out.println("The computer won.");
		}
	}
	
	private void displayWinner(GameObject randomObject1, GameObject randomObject2) {
		System.out.println("The computer chose: " + randomObject1);
		System.out.println("You chose: " + randomObject2);
	}
	
	private void updateCounter(int resultsIndex) {
		if(resultsIndex != 0) {
			counter++;
		}
	}
	
	private void updateWinLossCounter(int resultsIndex) {
		if(resultsIndex == 1) {
			winLossCounter++;
		}
		
	}
	
}
