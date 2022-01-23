package application;

import game.Game;

public class App {

	public static void main(String[] args) {
		/* New way of doing this
		Game game = new Game();
		game.run();
		*/
		
		new Game().run();
		//creates the game object and calls run() on it
	}

}
