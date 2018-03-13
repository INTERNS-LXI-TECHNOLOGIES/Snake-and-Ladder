public class Test{
	
	public static void main(String[] args){
		
		GameController gameController =  new GameController();
		
		gameController.createSnakes();
		gameController.createLadders();
		gameController.createCells();
		gameController.createBoard();
		gameController.createPlayers();
		gameController.displayBoard();
		gameController.play(); 
		
		
	
	}
	
}