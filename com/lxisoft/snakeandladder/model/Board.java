public class Board{
	
	private List<Cell> cellList;
   	private List<Snake> snakeList;
	private List<Ladder> ladderList; 
	
	//Getters and Setters
	public List<Cell> getCellList(){
		return cellList;
	}
	public void setCellList(List<Cell> cellList){
		this.cellList=cellList;
	}
 	public List<Snake> getSnakeList(){
		return snakeList;
	}
	public void setSnakeList(List<Snake> snakeList){
		this.snakeList=snakeList;
	}
	public List<Ladder> getLadderList(){
		return ladderList;
	}
	public void setLadderList(List<Ladder> ladderList){
		this.ladderList=ladderList;
	} 
	
}