import neeraj.laddersndchutes.Game;
import neeraj.laddersndchutes.Player;

public class LaddersChutes {

	public final static void main(String[] args) {
	
		// Provide player names from main method arguments
	
		if(args == null ) {
			System.out.println("Please provide players name.");
			return;
		}
		
		 int noOfPlayers = args.length;
		
		if(noOfPlayers > 4){
			System.out.println("Maximum four players allowed.");
			return;
		}else if(noOfPlayers < 2) {
			System.out.println("Please provide at least two player name to start game.");
			return;
		}
		
		Game game = new Game();
		game.play(args);
		
	}
	

}
