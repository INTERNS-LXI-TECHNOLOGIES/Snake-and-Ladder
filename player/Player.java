package com.lxisoft.snakeandladder.player;
public class Player
{
	int dieNumber;
	public void inputPlayers()
	{
		die();
	}
	public void die()
	{
		dieNumber = (int)((Math.random() *6)+1);
		System.out.print("Dice Number  :"+dieNumber);
	}
}