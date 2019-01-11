package neeraj.laddersndchutes;

public class Player {


	private String name;
	private int currentPos = 0;
	
	
	
	public Player(String name) {
		super();
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentPos() {
		return currentPos;
	}
	public void setCurrentPos(int currentPos) {
		this.currentPos = currentPos;
	}
	
	
}
