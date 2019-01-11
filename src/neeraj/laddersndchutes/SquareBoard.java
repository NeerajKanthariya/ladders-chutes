package neeraj.laddersndchutes;

public class SquareBoard {
	private int id;
	private LadderChuteInfo chute;
	private LadderChuteInfo ladder;
	
	
	
	
	public SquareBoard(int id) {
		super();
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LadderChuteInfo getChute() {
		return chute;
	}
	public void setChute(LadderChuteInfo chute) {
		this.chute = chute;
	}
	public LadderChuteInfo getLadder() {
		return ladder;
	}
	public void setLadder(LadderChuteInfo ladder) {
		this.ladder = ladder;
	}
	
	
	
	
	

}
