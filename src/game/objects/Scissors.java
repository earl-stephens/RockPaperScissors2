package game.objects;

public class Scissors extends GameObject {

	public Scissors() {
		setId(2);
		setName("Scissors");
		System.out.printf("Object ID is %d and name is %s", getId(), getName());
	}
}
