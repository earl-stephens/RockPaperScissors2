package game.objects;

public class GameObject implements Comparable<GameObject> {
	private int id;
	private String name;
	
	private int[][] comparison = {
			//				rock	paper	scissors
			/* rock */		{0,		-1,		1},
			/* paper */		{1,		0,		-1},
			/* scissors */	{-1,	1,		0}
	};
	
	//relates to the Comparable interface that is implemented
	//in the class method
	@Override
	public int compareTo(GameObject other) {
		return comparison[this.id][other.id];
	}
	
	protected void setId(int id) {
		this.id = id;
	}
	
	protected int getId() {
		return id;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected String getName() {
		return name;
	}
	
	public String toString() {
		return "GameObject ID = " + id + ", name = " + name;
	}
	
}
