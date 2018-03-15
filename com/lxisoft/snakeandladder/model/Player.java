public class Player{
	
	private Piece piece;
	
	public Player(Piece piece){
		this.piece=piece;
	}
	
	//Getters and Setters
	public int getPiece(){
		return piece;
	}
	public void setPiece(Piece piece){
		this.piece=piece;
	}
	
	public int throw(Dice dice){
		int number = dice.generateRandomNumber();
	}
}