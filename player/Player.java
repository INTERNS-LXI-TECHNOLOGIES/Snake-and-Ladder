package com.lxisoft.snakeandladder.player;

public class Player
{
	int diceNumber;
	int noOfPlayers;
	int[] player = new player[4];
	public void setNoOfPlayers(int noOfPlayers)
	{
		noOfPlayers = noOfPlayers;
	}
	//int[] playerName = new PlayerName[4];
	public void inputPlayers()
	{
		System.out.print("Number of players(Maximum 4) :");
		noOfPlayers = scan.nextInt();
		for(i=0;<noOfPlayers;i++)
		{
			player[i]=0;
		}
		do
		{
			for(int i=0;i<noOfPlayers;i++)
			{
				if(player[i] < 100)
				{
					System.out.print("The ")
					int diceValue=dice();
					if (diceValue==1 && player[i]==0)
					{
						player[i] = player[i]+1;
					}
					else if(player[i]>=1)
					{
						player[i] = player[i]+diceValue;
					}
				}
				else
				{
					
				}
			}
		}while()
	}
	public void dice()
	{
		diceNumber = (int)((Math.random() *6)+1);
		System.out.print("Dice Number  :"+diceNumber);
	}
}