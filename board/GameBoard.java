package com.lxisoft.snakeandladder.board;
import java.util.ArrayList;
import com.lxisoft.snakeandladder.board.Snake;
import com.lxisoft.snakeandladder.board.Ladder;
import com.lxisoft.snakeandladder.player.Player;
public class GameBoard
{
	int[] numbers = new int[100];

	int[] playerPosition = new int[4];
	//Snake snake = new Snake();
	//Ladder ladder = new Ladder();
	Player players = new Player();
	
	int noOfPlayers;
	
	public void startGame()
	{
		int a=0;
		System.out.println("\n		**** SNAKE AND LADDER ****\n");
		
		noOfPlayers = players.inputPlayers();
		System.out.print(noOfPlayers);
		/*do
		{
			for(int i=1;i<=noOfPlayers;i++)
			{
				if(playerPosition[i]<100)
				{
					inputBoard();
				}
				else(playerPosition[)
				{
					a=a+1;
				}
			}
		}while()*/
		movePlayers();
	}
	
	public void inputBoard()
	{
		int k=0;
		int value=numbers.length; 
		System.out.print("\n");
		do
		{
			System.out.println(" -----------------------------------------------------------");
			System.out.print("|");
			for(int i=value;i>=(value-9);i--)
			{ 
				if(i==100)
				{
					numbers[k] = i;
					System.out.print(" "+numbers[k]+" |");
					k++;
				}
				else if(i>=10)
				{
					numbers[k]=i;
					System.out.print("  "+numbers[k]+" |");	
					k++;
				}
			}
			value =(value-19);
			System.out.print("\n");
			System.out.println(" -----------------------------------------------------------");
			System.out.print("|");
			for(int j=value;j<=(value+9);j++)
			{
				if(j>=10)
				{
					numbers[k]=j;
					System.out.print("  "+numbers[k]+" |");
					k++;
				}
				else if(j<10)
				{
					numbers[k]=j;
					System.out.print("  "+numbers[k]+"  |");
					k++;
				}		
			}
			value=(value-1); 
			System.out.print("\n");
		}while(value>=1);
		System.out.println(" -----------------------------------------------------------");
	}
	

	
	public void movePlayers()
	{
		int b=noOfPlayers;;
		int diceValue;
		int a;		
		for(int i=0;i<noOfPlayers;i++)
		{
			playerPosition[i]=0;
		}
		do
		{
			a=0;
			for(int j=0;j<noOfPlayers;j++)
			{
				if(playerPosition[j] < 100)
				{		
					System.out.print("\n");
					System.out.println("\n -->Player"+(j+1));
				
					do
					{
						diceValue=players.dice();
						if (diceValue==1 && playerPosition[j]==0)
						{
							playerPosition[j] = playerPosition[j]+diceValue;
						}
						else if(playerPosition[j]>=1)
						{
							if((playerPosition[j]+diceValue)<=100)
							{
								playerPosition[j] = playerPosition[j]+diceValue;
							}
						}
						System.out.print("\nPlayer "+(j+1)+" Position = "+playerPosition[j]);	
						//inputBoard();
						if(playerPosition[j]==100)
						{
							break;
						}
					}while(diceValue==6);
				}
				if(playerPosition[j] == 100)
				{
					//b--;
					a=a+1;
					
					/*
					if(a==b)
					{
						break;
					}*/
				}
			}
		}while(a<b);
		//}while(b>1);	
	}
}