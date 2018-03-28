package com.lxisoft.snakeandladder2;
import java.util.ArrayList; 
import java.io.IOException;
import com.lxisoft.clearscreen.Clearscreen;
import java.util.*;
public class Game
{
	strng name;
	
	Scanner scan=new Scanner(System.in);
	private Board board=new Board();
	ArrayList<Player> players = new ArrayList<Player>();
	
	Coin coin=new Coin();
	Dies dies=new Dies();
	Clearscreen cls=new Clearscreen();
	
	int n;
	public void createGame()
	{
		/* System.out.println("Enter the how much players play for here ");
		n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			String name;
			players.add(new Player());
			players.setName(name);
			dies.inputDies();
			board.createBoard();	
		}
		for(Player p : players){
			System.out.println(p.getName());
		}
		for()
		board.createBoard();
		dies.inputDies();
		board.createBoard(); */
			createBoard();
			createPlayers();
	}
	public void playGame()
	{
	displayBoard();
	
	}
	public void createPlayers()
	{
	System.out.println("Enter the how much players play for here ");
		n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			//String name;
			players.add(new Player("p"+(i)));
	
		}
	}
	
	public void createBoard()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{	
				cells[i][j]=new Cells();
				cells[i][j].setCellPosition(i*10+j+1);
			}	
		}
		//displayBoard(); 
	}
	public void displayBoard()
	{
		 int pp=46;
		 String ps="*";
		
		for(int i=9;i>=0;i--)
		{
			if(i%2==1)
				{
					for(int j=9;j>=0;j--)
					{
						if(cells[i][j].getCellPosition()==pp)
						{
							System.out.println(ps);
						}
						System.out.print(cells[i][j].getCellPosition()+"	");
					}
				}
			else
			{
				for(int j=0;j<=9;j++)
				{
					if(cells[i][j].getCellPosition()<10)
					{
						System.out.print("0");
					}
					System.out.print(cells[i][j].getCellPosition()+"	");
				}
			}System.out.println("\n");
		}
	}
}