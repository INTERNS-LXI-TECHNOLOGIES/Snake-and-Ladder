package com.lxisoft.snakeandladder2.board;
import com.lxisoft.snakeandladder2.game.Player;
public class Cell{
	private int number;
	Player[] players=new Player[2];
	
	public void setPlayers(Player[] players)
	{
		
		this.players=players;
		
	}
	public Player[] getPlayers()
	{
		return players;
	}
	public void setPlayer(Player player)
	{
		outerLoop:
		for(int i=0;i<2;i++)
		{
			if(players[i]==null)
			{
				players[i]=player;
				break outerLoop;
			}
			
			
		}
	}
			
	public Cell(int number)
	{
		this.number=number;
		
	}
	public int getNumber()
	{
		return number;
	}
	
	public void displayCell()
	{
		System.out.print("[");
		if(number==100)
		{
			
			System.out.print("HM");
		}
		else if(number==1)
		{
			System.out.print("ST");
		}
		else if(number<10&&number>1)
		{
			System.out.print("0"+number);
		}
		else
		{
			System.out.print(number);
		}
		System.out.print("]");
	}
		
		public void displayPlayers()
		{
			if(players[0]!=null)
			{
				System.out.print("("+players[0].getNumber()+")");
			}
			else
			{
				System.out.print("   ");
			}			
			if(players[1]!=null)
			{
				System.out.print("("+players[1].getNumber()+")");
			}
			else
			{
				System.out.print("   ");
			}	
		}
		
	



}