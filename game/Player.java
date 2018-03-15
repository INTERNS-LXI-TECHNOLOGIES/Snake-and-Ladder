package com.lxisoft.snakeandladder3.game;
public class Player{
private String name;
private int ID;
public Player(int ID,String name)
	{
		this.name=name;
		this.ID=ID;
	}
public String getName()
	{
		return name;
 	}
public int getID()
	{
		return ID;
	}
}