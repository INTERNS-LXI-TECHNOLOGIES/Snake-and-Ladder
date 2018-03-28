package com.lxisoft.snakeandladder2;
import com.lxisoft.snakeandladder2.Player;
public class Player
{
	
	private String name;
	private int position = 0;
	private boolean status=false;
	private Coin coin=new Coin();
	
	public void setCoin(Coin coin) {
		this.coin= coin;
	}
	public Player(int player){
		this.name=name;
		
	}
	public Coin getCoin()
	{
		return coin;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setStatus(boolean status)
	{
		this.status=status;
	}
	public boolean getStatus()
	{
		return status;
	}
	
	public void setPosition(int value) {
		position = position+value;
	}
	public int getPosition()
	{
		return position;	
	}
	public void startGame()
	{
		
	}
	
	
}