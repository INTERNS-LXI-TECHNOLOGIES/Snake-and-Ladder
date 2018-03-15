package com.lxisoft.snakeandladder2.game;
public class Player{
	private String name;
	private int number;
	public Player(int number)
	{
		this.number=number;
	}
	public void setNumber(int number)
	{
		
		this.number=number;
	}
	public int getNumber()
	{
		
		return number;
	}
	public void setName(String name)
	{
		
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	

}