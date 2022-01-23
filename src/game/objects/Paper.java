package game.objects;

public class Paper extends GameObject {
	
	public Paper() {
		setId(1);
		setName("Paper");
		System.out.printf("Object ID is %d and name is %s", getId(), getName());
	}

}
