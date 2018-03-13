package com.lxisoft.snakeandladder.game;
public class SnakeNLadder
{
private int noOfBox=100;


//Snake snake=new Snake();

//Ladder ladder=new Ladder();


public void StartGame()
{
	for( int i=9;i>=0;i--)
	{
		
		if(i%2==1)
		{
			for(int j=9;j>=0;j--)
			{
			int k=(10*i)+j+1;	
			
		System.out.println("["+k+"]"+"   ");
			}
			System.out.println("  ");
		}
		else if(i%2==0||i==0)
		{
			for(int j=9;j<9;j++)
			{
				int k=(10*i)+j+1;
				if(i==0&&j<9)
				{
							System.out.println("["+k+"]"+ "   ");
				}
				System.out.println("  ");
			}
		}
		System.out.print("\n");
	}
}


/*public void inputPlayersDetails()
{
	int player1=0,player2=0;
	int currentplayer=-1;
	int diceValue=0;
	Scanner scan=new Scanner(System.in);
	String str;
	
	do
	{
		System.out.println(Current Player==-1? "\n FIRST PLAYER TURN" : "\n SECOND PLAYER TURN");
		System.out.println("PRESS A TO ROLL THE DIE");
		str=next();
		
	}*/
}


