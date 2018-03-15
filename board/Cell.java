package com.lxisoft.snakeandladder3.board;
import com.lxisoft.snakeandladder3.game.Player;
public class Cell{
public final int number;
private Player[]players;
public int getNumber() 
	{
		return number;
	}
public Cell(int number,int noOfplayers)
	{
		this.number=number;
		players=new Player[noOfplayers];
	}
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
		loop:
		for(int i=0;i<2;i++)
		{
			if(players[i]==null)
			{
				players[i]=player;
				break loop;
			}
		}
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
		else if(number<10)
		{
			System.out.print("0"+number);
		}    
		else
		{
			System.out.print(number);			
		}
		System.out.print("] ");
	}
	
//#########################################################################3
	
public void displayPlayers()
	{
		for(Player tempPlayer:players)
		{
			if(tempPlayer!=null)
			{
				System.out.print("("+tempPlayer.getID()+")");
			}
			else
			{
				System.out.print("   ");
			}
		}
	}
}
