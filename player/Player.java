package com.lxisoft.snakeandladder.player;
import java.util.Scanner;
public class Player
{
	int diceNumber;
	int noOfPlayers;
	int[] player = new player[4];
	Scanner scan = new Scanner(System.in);
	public void setNoOfPlayers(int noOfPlayers)
	{
		noOfPlayers = noOfPlayers;
	}
	//int[] playerName = new PlayerName[4];
	public void inputPlayers()
	{
		int diceValue;
		System.out.print("Number of players(Maximum 4) :");
		noOfPlayers = scan.nextInt();
		for(int i=0;i<noOfPlayers;i++)
		{
			player[i]=0;
		}
		//do
		//{
			for(int j=0;j<noOfPlayers;j++)
			{
				if(player[j] < 100)
				{
					//System.out.print("The ");
					diceValue=dice();
					if (diceValue==1 && player[j]==0)
					{
						player[j] = player[j]+1;
					}
					else if(player[j]>=1)
					{
						player[j] = player[j]+diceValue;
					}
				}
				else
				{
					
				}
			}
		//}while()
	}
	public int dice()
	{
		diceNumber = (int)((Math.random() *6)+1);
		System.out.print("Dice Number  :"+diceNumber);
		return diceNumber;
	}
}