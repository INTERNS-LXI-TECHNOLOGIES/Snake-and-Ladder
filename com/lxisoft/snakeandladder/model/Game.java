public class Game{

	private Board board;
	private List<Player> playerList;
	private Dice dice;
	
	public Board getBoard(Board board){
		return board;
	}
	public void setBoard(){
		this.board=board;
	}
	
	public List<Player> getPlayerList(){
		return playerList;
	}
	public void setPlayerList(List<Player> playerList){
		this.playerList=playerList;
	}
	
	public Dice getDice(){
		return dice;
	}
	public void setDice(Dice dice){
		this.dice=dice;
	}



}