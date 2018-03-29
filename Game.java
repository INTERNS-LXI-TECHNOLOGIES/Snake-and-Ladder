package com.lxisoft.snakeandladder3;
import com.lxisoft.snakeandladder3.Player;
import com.lxisoft.snakeandladder3.Snake;
import com.lxisoft.snakeandladder3.Ladder;
import com.lxisoft.snakeandladder3.Board;
import com.lxisoft.snakeandladder3.Cell;
import java.util.ArrayList;
import java.util.Scanner;

public class Game
{
	
	Board board=new Board();
	ArrayList<Player> players=new ArrayList<Player>();
	
	
	Player player1=new Player();
	Player player2=new Player();
	Dice dice=new Dice();
	Snake snake1=new Snake();
	Snake snake2=new Snake();
	Snake snake3=new Snake();
	Ladder ladder1=new Ladder();
	Ladder ladder2=new Ladder();
	Ladder ladder3=new Ladder();
 
	public void createGame()
	{
		createBoard();
		createPlayer();
		createSnake();
		createLadder();

	}
	public void createPlayer()
	{
		player1.setName("Prince");
		player2.setName("sahal");
		player1.setCoin(new Coin());
		player2.setCoin(new Coin());
		player1.getCoin().setSymbol("#");
		player2.getCoin().setSymbol("*");
		players.add(player1);
		players.add(player2);
		
	}
	public void createSnake()
	{
		snake1.headPosition=44;
		snake1.tailPosition=19;
		snake2.headPosition=65;
		snake2.tailPosition=20;
		snake3.headPosition=97;
		snake3.tailPosition=21;
		board.snakes.add(snake1);
		board.snakes.add(snake2);
		board.snakes.add(snake3);
	}
	public void createLadder()
	{
		ladder1.climbIn=18;
		ladder1.climbOut=48;
		ladder2.climbIn=23;
		ladder2.climbOut=78;
		ladder3.climbIn=30;
		ladder3.climbOut=82;
		board.ladders.add(ladder1);
		board.ladders.add(ladder2);
		board.ladders.add(ladder3);
	}
	
	public void createBoard()
	{
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				board.cells[i][j]=new Cell();
				board.cells[i][j].setCellPosition(i*10+j+1);
			}
		}				
	}
	public void displayBoard(Player player1,Player player2)
	{
		for(int i=9;i>=0;i--)
		{
			if(i%2==1)
			{
				for(int j=9;j>=0;j--)
				{
					if(board.cells[i][j].getCellPosition()==player1.getPosition())
					{
						System.out.print(player1.getCoin().getSymbol());
					}
					if(board.cells[i][j].getCellPosition()==player2.getPosition())
					{
						System.out.print(player2.getCoin().getSymbol());
					}
					System.out.print(board.cells[i][j].getCellPosition()+"\t");
				}					
				//System.out.println("\n");
			}
			else
			{
				for(int j=0;j<=9;j++)
				{
					if(board.cells[i][j].getCellPosition()==player1.getPosition())
					{
						System.out.print(player1.getCoin().getSymbol());
					}
					if(board.cells[i][j].getCellPosition()==player2.getPosition())
					{
						System.out.print(player2.getCoin().getSymbol());
					}
					System.out.print(board.cells[i][j].getCellPosition()+"\t");
				}//System.out.println("\n");
			}
			System.out.println();
		}			
	}
	public void playGame()
	{
		
		
		while(true)
		{
			displayBoard(players.get(0),players.get(1));
			Scanner scan=new Scanner(System.in);
			 
			System.out.println("Enter the choice of player 1 ");
			int n=scan.nextInt();
			if(n==1)
			{
				int s=dice.throwDice();
				if(players.get(0).getStatus()==false)
				{
					if(s==1)
					{
						players.get(0).setStatus(true);
						players.get(0).setPosition(1);
						displayBoard(players.get(0),players.get(1));
						System.out.println(" StartGame.... ");
					
					}
					else{ 
						displayBoard(players.get(0),players.get(1));
						System.out.println("try again");
					}
				}
				else{	
					players.get(0).setPosition(players.get(0).getPosition()+s);
					displayBoard(players.get(0),players.get(1));
					if(players.get(0).getPosition()==100)
					{
						
						System.out.println(players.get(0).getName()+"  win ");
					}
				}
			}
			System.out.println("Enter the choice of player 2 ");
			n=scan.nextInt();
			if(n==1){
				int s=dice.throwDice();
				if(players.get(1).getStatus()==false)
				{
					if(s==1)
					{
						players.get(1).setStatus(true);
						players.get(1).setPosition(1);
						displayBoard(players.get(0),players.get(1));
						System.out.println(" StartGame.... ");
					
					}
					else{ 
						System.out.println("try again");
					}
				}
				else{	
					players.get(1).setPosition(players.get(1).getPosition()+s);
					displayBoard(players.get(0),players.get(1));
					if(players.get(1).getPosition()==100)
					{
						System.out.println(players.get(0).getName()+" win ");
					}
				}
			}
		}			
	}

}