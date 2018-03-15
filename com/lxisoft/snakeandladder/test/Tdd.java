public class Test{
	
	public static void main(String[] args){
		
		GameController gameController =  new GameController();
		
		gameController.createSnakes();
		gameController.createLadders();
		gameController.createCells();
		gameController.createBoard();
		gameController.createPieces();
		gameController.createPlayers();
		gameController.createDice();
		gameController.createGame();
		gameController.displayBoard();
		gameController.play(); 
		
		
	
	}
	
}