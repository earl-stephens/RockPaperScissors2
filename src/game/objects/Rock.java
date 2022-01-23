package game.objects;

public class Rock extends GameObject {

	public Rock() {
		setId(0);
		setName("Rock");
		System.out.printf("Object ID is %d and name is %s", getId(), getName());
	}
}
