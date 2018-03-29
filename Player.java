package com.lxisoft.snakeandladder3;
import com.lxisoft.snakeandladder3.Player;
public class Player
{
	private int position;
	String name;
	private boolean status=false;
	private Coin coin;
	
	public void setPosition(int position)
	{
		this.position=position;
	}
	public int getPosition()
	{
		return position;
	}
	public void setCoin(Coin coin)
	{
		this.coin=coin;
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
		return this.name;
	}
	public void setStatus(boolean status)
	{
		this.status=status;
	}
	public boolean getStatus()
	{
		return this.status;
	}
}
