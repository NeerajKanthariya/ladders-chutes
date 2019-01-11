package neeraj.laddersndchutes;

import java.util.Random;

public class Game {
	
	
	private Player [] players;
	private SquareBoard[] gameBoard = new SquareBoard[(100)];
	
	
	public void play(String [] players) {
		
		initializePlayers(players);
		initializeGameBoard();
		StartGame();
		
	}
	
	
	
	//Create players 
	private void initializePlayers(String[] playerList) {
		
		players = new Player[playerList.length];
		
		for(int i = 0; i < playerList.length; i++) {
			players[i] = new Player(playerList[i]);			
		}
	}
	
	// Initialize game board by setting ladders and chutes
	private void initializeGameBoard() {
		
		for(int i = 0; i < 100; i++) {
			gameBoard[i] = new SquareBoard(i + 1); 
		}
		
		//Add Ladders
		
		gameBoard[1].setLadder(new LadderChuteInfo(1, 38));
		gameBoard[4].setLadder(new LadderChuteInfo(4, 14));
		gameBoard[9].setLadder(new LadderChuteInfo(9, 31));
		gameBoard[21].setLadder(new LadderChuteInfo(21, 42));
		gameBoard[28].setLadder(new LadderChuteInfo(28, 84));
		gameBoard[36].setLadder(new LadderChuteInfo(36, 43));
		gameBoard[51].setLadder(new LadderChuteInfo(51, 68));
		gameBoard[71].setLadder(new LadderChuteInfo(71, 91));
		gameBoard[80].setLadder(new LadderChuteInfo(80, 100));	
		
		// Add Chutes
		
		gameBoard[16].setChute(new LadderChuteInfo(6, 16));	
		gameBoard[47].setChute(new LadderChuteInfo(11,49));	
		gameBoard[49].setChute(new LadderChuteInfo(19,62));
		gameBoard[56].setChute(new LadderChuteInfo(26,47));
		gameBoard[62].setChute(new LadderChuteInfo(24,87));
		gameBoard[64].setChute(new LadderChuteInfo(53,56));
		gameBoard[87].setChute(new LadderChuteInfo(60,64));
		gameBoard[93].setChute(new LadderChuteInfo(73,93));
		gameBoard[95].setChute(new LadderChuteInfo(78,98));
		gameBoard[98].setChute(new LadderChuteInfo(75,95));
	}
	
	// Spinner to generate random number
	private int spin(){
		Random random = new Random();
		int r = random.nextInt(7); 
		
		return (r == 0 ? 1: r);		// Return 1 if random number is zero
		
	}
	
	
	private void  StartGame() {
	
		boolean ToBeContinue = true;
		int count = 0;
		
		while (ToBeContinue) {
			
			for (Player player : players) {
				
				int spinValue =   spin();
				int playerPosWillBe = player.getCurrentPos() + spinValue;
				int newPosAfterLadderOrChute;
				
				if(playerPosWillBe > 100) {  // check if new position is greater than 100
					
					System.out.println("" + ++count + ": "+ player.getName() + ": "+ playerPosWillBe + "  is greater than 100.");
					continue;
					
				} 
				else if(playerPosWillBe  < 100 && gameBoard[playerPosWillBe].getLadder() != null ){ // check if new position has ladder
					
					newPosAfterLadderOrChute = gameBoard[playerPosWillBe].getLadder().getTopPos();
					
					System.out.println("" + ++count + ": "+ player.getName() + " : " + player.getCurrentPos() + " --> " 
															+ playerPosWillBe + " -- LADDER --> " + newPosAfterLadderOrChute );
					
					playerPosWillBe = newPosAfterLadderOrChute;
					
				}
				else if(playerPosWillBe  < 100 && gameBoard[playerPosWillBe].getChute() != null) { // check if new position has chute
					
					newPosAfterLadderOrChute = gameBoard[playerPosWillBe].getChute().getBottomPos();
					
					System.out.println("" + ++count + ": "+ player.getName() + " : " + player.getCurrentPos() + " --> " 
								+ playerPosWillBe  + " -- CHUTE --> " + newPosAfterLadderOrChute );
					
					playerPosWillBe = newPosAfterLadderOrChute;
					
				}
				else {
					
					System.out.println("" + ++count + ": "+ player.getName() + " : " + player.getCurrentPos() + " --> " + playerPosWillBe );
					
				}
				
				player.setCurrentPos(playerPosWillBe);
				
				if(playerPosWillBe == 100) { // check if new position is 100.
					
					System.out.print("The Winner is " + player.getName() + "!");
					ToBeContinue = false; // Terminate loop if we found winner
					break;
				}						
		
			} 
			
		}
		
		
	}
	


}




