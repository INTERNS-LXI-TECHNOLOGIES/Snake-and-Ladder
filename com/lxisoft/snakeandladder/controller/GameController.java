public class GameController(){ //make changes in sync with Game class
	
	private Board board;
	List<Cell> cellList;
	List<Ladder> ladderList;
	private List<Snake> snakeList;
	
	//Create Snakes
	public void createSnakes(){
/* 		Snake snake1 = new Snake("S1",17,7);
		Snake snake2 = new Snake("S2",54,34);
		Snake snake3 = new Snake("S3",62,19);
		Snake snake4 = new Snake("S4",64,60);
		Snake snake5 = new Snake("S5",87,24); */
		
		for(int i=100;1<=6;i++){
			Snake snake = new Snake();
			
			
		}
		

	}
	
	//Create Ladders
	public void createLadders(){
		Ladder ladder = new Ladder();
		Ladder ladder = new Ladder();
		

	}
	
	//Create Cells
	public void createCells(){
		cellList = new List<Cell>();
		for(int i=0;i<100;i++){
			Cell cell = new Cell();
			cell.setNumber(i+1);
			cellList.add(cell);
		}
	}
	
	//Create Board
	public void createBoard(){
		board = new Board();	
		board.setCellList(cellList);
	}
	
	//Display Board
	public void displayBoard(){
		int n = 100;
		for(int i=1; i<=10; i++){
			System.out.println("\n");
			for(int j=1; j<=10; j++){
				System.out.print("	"+n);
				if(i%2==1) --n;
				else ++n;
			}
			if(i%2==1){
				n-=9;
			} else{
				n-=11;
			}
		}
	}
	
	//Create Players
	public void createPlayers(){
		
	}
	
	//Play 
	public void play(){
		
	}
	
	
	
}