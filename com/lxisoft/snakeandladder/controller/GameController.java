public class GameController(){ //make changes in sync with Game class
	
	private Board board;
	private List<Cell> cellList;
	private List<Ladder> ladderList = new List<Ladder>;
	private List<Snake> snakeList = new List<Snake>;
	private Player player1, player2;
	private Piece piece1, piece2;
	private Dice dice;
	private Game game;
	
	//Create Snakes
	public void createSnakes(){
 		Snake snake1 = new Snake("S1",17,7);
		Snake snake2 = new Snake("S2",54,34);
		Snake snake3 = new Snake("S3",62,19);
		Snake snake4 = new Snake("S4",64,60);
		Snake snake5 = new Snake("S5",87,24);
		snakeList.add(snake1);
		snakeList.add(snake2);
		snakeList.add(snake3);
		snakeList.add(snake4);
		snakeList.add(snake5);

		
	}
	
	//Create Ladders
	public void createLadders(){
		Ladder ladder1 = new Ladder();
		Ladder ladder2 = new Ladder();
		Ladder ladder3 = new Ladder();
		Ladder ladder4 = new Ladder();
		Ladder ladder5 = new Ladder();
		ladderList.add(ladder1);
		ladderList.add(ladder2);
		ladderList.add(ladder3);
		ladderList.add(ladder4);
		ladderList.add(ladder5);
		

	}
	
	//Create Cells
	public void createCells(){
		cellList = new ArrayList<Cell>();
		for(int i=0;i<100;i++){
			Cell cell = new Cell();
			cell.setNumber(i+1);
			if(i==16 || i==53 || i==61 || i==63 || i==86){		//Snake Positions
				cellsetHasSnake(true);  
			}
			if(i==3 || i==8 || i==20 || i==27 || i==39){		//Ladder Positions
				cellsetHasLadder(true);
			}
			cellList.add(cell);
		}
	}
	
	
	//Create Board
	public void createBoard(){
		board = new Board();	
		board.setCellList(cellList);
		board.setSnakeList(snakeList);
		board.setLadderList(ladderList);
	}
	
	//Create Pieces
	public void createPieces(){
		piece1 = new Piece(0);
		piece2 = new Piece(0);
	}
	
	//Create Players
	public void createPlayers(){
		player1 = new Player(piece1);
		player2 = new Player(piece2);	
	}
	
	//Create Dice
	public void createDice(){
		dice = new Dice();
	}
	
	//Create Game
	public void createGame(){
		game = new Game(board, player1, player2, dice);
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
	
	//Play 
	public void play(){
		int  diceNumber=0, totalDiceNumber=0;
		Player player1 = game.getPlayer1();
		Player player2 = game.getPlayer1();
		Piece piece1 = player1.getPiece();
		Piece piece2 = player2.getPiece();
		Board board = game.getBoard();
		Dice dice = game.getDice();
		Cell cell;
		List<Cell> cellList = board.getCellList();
		int piecePosition;
		boolean player1EnteredCell1 = false, player2Enteredcell1 = false;
		
		
		while(piece1.getPosition()==100 || piece2.getPosition()==100){		//Plays Till Anyone Wins
			
			//Condition: Check If Players Got 1 In Dice
			while(true){
				if(!player1EnteredCell1){									
					diceNumber = player1.throw(dice);
					if(diceNumber==1){
						player1EnteredCell1 = true;
					}
				}
			
				if(!player2EnteredCell1){
					diceNumber = player2.throw(dice);
					if(diceNumber==1){
						player2EnteredCell1 = true;
					}
				}
				
				if(player1EnteredCell1==true || player2EnteredCell1==true){
					break();
				}
			}
			
			//Player1 Plays
			if(player1EnteredCell1){
				while(true){							//Roll Dice Again If A 6 Is Got
					diceNumber = player1.throw(dice);
					totalDiceNumber = totalDiceNumber + diceNumber;
					if(diceNumber!=6){
						break();
					}
				}	
				piecePosition = piece1.move(totalDiceNumber);
				cell = cellList.get(piecePosition-1);
				if(cell.getHasSnake()){					//Check if Cell has Snake
					for(Snake snake : snakeList){
						if(snake.getStart()==piecePosition){
							piecePosition = snake.getEnd();
							piece1.move(piecePosition);
						}
					}
				} else if(cell.getHasLadder()){			//Check if Cell has Ladder    
					for(Ladder ladder : ladderList){
						if(ladder.getStart()==piecePosition){
							piecePosition = snake.getEnd();
							piece1.move(piecePosition);
						}
					}
				}
			}
			
			
			//Reset dice
			diceNumber =0 ;		
			totalDiceNumber = 0; 
			
			//Player2 Plays
			if(player2EnteredCell1){
				while(true){							//Roll Dice Again If A 6 Is Got
					diceNumber = player2.throw(dice);
					totalDiceNumber = totalDiceNumber + diceNumber;
					if(diceNumber!=6){
						break();
					}
				}	
				piecePosition = piece2.move(totalDiceNumber);
				cell = cellList.get(piecePosition-1);
				if(cell.getHasSnake()){					//Check if Cell has Snake
					for(Snake snake : snakeList){
						if(snake.getStart()==piecePosition){
							piecePosition = snake.getEnd();
							piece2.move(piecePosition);
						}
					}
				} else if(cell.getHasLadder()){			//Check if Cell has Ladder
					for(Ladder ladder : ladderList){
						if(ladder.getStart()==piecePosition){
							piecePosition = snake.getEnd();
							piece2.move(piecePosition);
						}
					}
				}
			}	
		}	
	}
	
	
}