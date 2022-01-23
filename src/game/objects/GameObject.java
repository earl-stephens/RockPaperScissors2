package game.objects;

public class GameObject {
	private int id;
	private String name;
	
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
