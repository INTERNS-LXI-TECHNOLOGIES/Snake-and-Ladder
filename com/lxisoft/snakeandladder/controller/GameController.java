package com.lxisoft.snakeandladder.controller;
import com.lxisoft.snakeandladder.model.*;
import java.util.ArrayList;
import java.util.List;

public class GameController{  	
	
	private Board board;
	private List<Cell> cellList;
	private List<Ladder> ladderList = new ArrayList<Ladder>();
	private List<Snake> snakeList = new ArrayList<Snake>();
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
		Ladder ladder1 = new Ladder("L1",4,14);
		Ladder ladder2 = new Ladder("L2",9,31);
		Ladder ladder3 = new Ladder("L3",20,38);
		Ladder ladder4 = new Ladder("L4",28,84);
		Ladder ladder5 = new Ladder("L5",40,59);
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
				cell.setHasSnake(true);  
			}
			if(i==3 || i==8 || i==19 || i==27 || i==39){		//Ladder Positions
				cell.setHasLadder(true);
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
		int n = 99;
		Board board = game.getBoard();
		List<Cell> cellList = board.getCellList();
		Cell cell = cellList.get(n);
		for(int i=1; i<=10; i++){
			System.out.println("\n");
 			for(int j=1; j<=10; j++){
				System.out.print("	"+ /* n */ cell.getNumber());
				if(i%2==1) {
					//--n
					cell = cellList.get(--n);}
				else {
					//++n
					cell = cellList.get(++n);}
			}
			if(i%2==1){
				n-=9;
				cell = cellList.get(n);
			} else{
				n-=11;
				if(n>=0){cell = cellList.get(n);}
			}
		}
	}
	
	//Play 
	public void play(){
		
		int  diceNumber=0, totalDiceNumber=0, piecePosition;
		Player player1 = game.getPlayer1();
		Player player2 = game.getPlayer2();
		Piece piece1 = player1.getPiece();
		Piece piece2 = player2.getPiece();
		Board board = game.getBoard();
		Dice dice = game.getDice();
		Cell cell;
		List<Cell> cellList = board.getCellList();
		boolean player1EnteredCell1 = false, player2EnteredCell1 = false;
		
		System.out.println("\n ==== GAME BEGINS ====");
		
		while(true){		//Play Till Any One Wins
				
			if(!player1EnteredCell1){					//Check if Player 1 got 1							
				System.out.println("\n Player 1 throws dice");
				diceNumber = player1.toss(dice);
				System.out.println("\n Player 1 got "+diceNumber);
				if(diceNumber==1){
					player1EnteredCell1 = true;
					piece1.move(diceNumber);
					System.out.println("\n Player 1 enters cell 1 ");
				}
			} else{
				
				while(true){							//Roll Dice Again If A 6 Is Got
					if(diceNumber==6){
						System.out.println("\n Player 1 throws again");
					}else{
						System.out.println("\n Player 1 throws dice");
					}			
					diceNumber = player1.toss(dice);
					System.out.println("\n Player 1 got "+diceNumber);
					totalDiceNumber = totalDiceNumber + diceNumber;
					if(diceNumber!=6){
						break;
					}		
				}
			
				piecePosition = piece1.move(totalDiceNumber);
				System.out.println("\n Player 1 moves "+totalDiceNumber+"cells ahead...to cell no. "+piecePosition);
				cell = cellList.get(piecePosition-1);
				
				if(cell.getHasSnake()){					//Check if Cell has Snake
					System.out.println("\n Oops.. The cell has snake");
					for(Snake snake : snakeList){
						if(snake.getStart()==piecePosition){
							piecePosition = snake.getEnd();
							System.out.println("\n Player 1 goes down to "+piecePosition);
							piece1.setPosition(piecePosition);
						}
					}
				} else if(cell.getHasLadder()){			//Check if Cell has Ladder  
					System.out.println("\n Wow.. The cell has ladder");
					for(Ladder ladder : ladderList){
						if(ladder.getStart()==piecePosition){
							piecePosition = ladder.getEnd();
							System.out.println("\n Player 1 climbs up to "+piecePosition);
							piece1.setPosition(piecePosition);
						}
					}
				}
			}
			
			//Reset dice
			diceNumber = 0;		
			totalDiceNumber = 0; 
		
			if(!player2EnteredCell1){					//Check if Player 1 got 1
				System.out.println("\n Player 2 throws dice");
				diceNumber = player2.toss(dice);
				System.out.println("\n Player 2 got "+diceNumber);
				if(diceNumber==1){
					player2EnteredCell1 = true;
					piece2.move(diceNumber);
					System.out.println("\n Player 2 enters cell 1 ");
				}
			} else{	
				while(true){							//Roll Dice Again If A 6 Is Got
					if(diceNumber==6){
						System.out.println("\n Player 2 throws again");
					}else{
						System.out.println("\n Player 2 throws dice");
					}
					diceNumber = player2.toss(dice);
					System.out.println("\n Player 2 got "+diceNumber);
					totalDiceNumber = totalDiceNumber + diceNumber;
					if(diceNumber!=6){
						break;
					}
				}
			
				piecePosition = piece2.move(totalDiceNumber);
				System.out.println("\n Player 2 moves "+totalDiceNumber+"cells ahead...to cell no. "+piecePosition);
				cell = cellList.get(piecePosition-1);

				if(cell.getHasSnake()){					//Check if Cell has Snake
					System.out.println("\n Oops.. The cell has snake");
					for(Snake snake : snakeList){
						if(snake.getStart()==piecePosition){
							piecePosition = snake.getEnd();
							System.out.println("\n Player 2 goes down to "+piecePosition);
							piece2.setPosition(piecePosition);
						}
					}
				} else if(cell.getHasLadder()){			//Check if Cell has Ladder
					System.out.println("\n Wow.. The cell has ladder");
					for(Ladder ladder : ladderList){
						if(ladder.getStart()==piecePosition){
							piecePosition = ladder.getEnd();
							System.out.println("\n Player 2 climbs up to "+piecePosition);
							piece2.setPosition(piecePosition);
						}
					}
				}
			}

			if(piece1.getPosition()>=100 || piece2.getPosition()>=100){
				//
				break;
			}
		}	
	}
	

	
}