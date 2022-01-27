package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObject[] objects = {new Rock(), new Paper(), new Scissors()};
	
	public void run() {
	String[] results = {"Draw", "Win", "Lose"};
	
	System.out.println("Game running");
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	GameObject randomObject1 = objects[random.nextInt(objects.length)];
	
	System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors.");
	GameObject randomObject2 = objects[scanner.nextInt() - 1];
	//GameObject randomObject2 = objects[random.nextInt(objects.length)];


	System.out.println("The computer chose: " + randomObject1);
	System.out.println("You chose: " + randomObject2);
	
	//System.out.println(randomObject1.compareTo(randomObject2));
	int resultsIndex = randomObject2.compareTo(randomObject1);
	System.out.println(results[resultsIndex]);
	
	scanner.close();
	}
	
}
