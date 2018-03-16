package com.lxisoft.snakeandladder.board;
import java.util.ArrayList;
import com.lxisoft.snakeandladder.board.Snake;
import com.lxisoft.snakeandladder.board.Ladder;
import com.lxisoft.snakeandladder.player.Player;
public class Board
{
	int[] numbers = new int[100];
	int value=numbers.length; 
	Snake snake = new Snake();
	Ladder ladder = new Ladder();
	ArrayList <Player> players = new ArrayList<>();
	//Player players = new Player();
	public void inputBoard()
	{
		players = new Players();
		do
		{
			System.out.println(" -----------------------------------------------------------");
			System.out.print("|");
			for(int i=value;i>=(value-9);i--)
			{ 
				if(i==100)
				{
					System.out.print(" "+i+" |");
				}
				else if(i>=10)
				{
					System.out.print("  "+i+" |");	
				}
			}
			value =(value-19);
			System.out.print("\n");
			System.out.println(" -----------------------------------------------------------");
			System.out.print("|");
			for(int j=value;j<=(value+9);j++)
			{
				if(j>=10)
				{
					System.out.print("  "+j+" |");
				}
				else if(j<10)
				{
					System.out.print("  "+j+"  |");
				}		
			}
			value=(value-1); 
			System.out.print("\n");
		}while(value>=1);
		System.out.println(" -----------------------------------------------------------");
		players.inputPlayers();
		//players.die();
	}
}