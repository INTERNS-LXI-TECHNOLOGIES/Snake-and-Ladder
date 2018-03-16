package com.lxisoft.snakeandladderv3.board;
import com.lxisoft.snakeandladderv3.game.Player;
public class Cell{
	private int number;
	Player[] players;
	
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
		for(int i=0;i<players.length;i++)
		{
			if(players[i]==null)
			{
				players[i]=player;
				break outerLoop;
			}
			
			
		}    
	}
			
	public Cell(int number,int noOfPLayers)
	{
		players=new Player[noOfPLayers];
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
			for(Player tempPlayer:players)
			{
				if(tempPlayer!=null)
				{
					System.out.print("("+tempPlayer.getNumber()+")");
				}
				else
				{
					System.out.print("   ");
				}
			}
		}
		
	



}