package com.lxisoft.snakeandladder.player;
import java.util.Scanner;
public class Player
{
	
	int noOfPlayers;
	Scanner scan = new Scanner(System.in);
	public void setNoOfPlayers(int noOfPlayers)
	{
		noOfPlayers = noOfPlayers;
	}
	//int[] playerName = new PlayerName[4];
	public int inputPlayers()
	{	
		System.out.print("Number of players(Maximum 4) :");
		noOfPlayers = scan.nextInt();
		return noOfPlayers;
	}
	public int dice() 
	{
		int diceNumber;
		diceNumber = (int)((Math.random() *6)+1);
		System.out.print("\nDice Number  :"+diceNumber);
		return diceNumber;
	}
	
}