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
	
	GameObject randomObject1 = objects[random.nextInt(objects.length)];
	GameObject randomObject2 = objects[random.nextInt(objects.length)];

	System.out.println("Game running");
	System.out.println(randomObject1);
	System.out.println(randomObject2);
	
	System.out.println(randomObject1.compareTo(randomObject2));
	System.out.println(randomObject2.compareTo(randomObject1));
	}
	
}
