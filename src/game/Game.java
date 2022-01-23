package game;

import java.util.Random;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObject[] objects = {new Rock(), new Paper(), new Scissors()};
	
	public void run() {
	Random random = new Random();
	GameObject randomObject = objects[random.nextInt(objects.length)];
	

		System.out.println("Game running");
		System.out.println(randomObject);
	}
	
}
