package neeraj.laddersndchutes;

public class LadderChuteInfo {
	
	private int bottomPos;
	private int topPos;
	
	
	public LadderChuteInfo(int bottomPos, int topPos) {
		super();
		this.bottomPos = bottomPos;
		this.topPos = topPos;
	}
	
	public int getBottomPos() {
		return bottomPos;
	}
	public void setBottomPos(int bottomPos) {
		this.bottomPos = bottomPos;
	}
	public int getTopPos() {
		return topPos;
	}
	public void setTopPos(int topPos) {
		this.topPos = topPos;
	}
	
	

}
