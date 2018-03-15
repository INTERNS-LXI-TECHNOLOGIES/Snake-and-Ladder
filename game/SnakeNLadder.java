package com.lxisoft.snakeandladder.game;
public class SnakeNLadder
{
private int noOfBox=100;
Snake snake=new Snake();

//Ladder ladder=new Ladder();

public void startGame()
{
		for( int i=9;i>=0;i--)
		//for( int i=100;i>0;i--)
		{
		if(i%2==1)
		{
			//for(int j=0;j<=9;j++)		
			System.out.print("  ");		
		for(int x=9*9;x>0;x--)
		{
			 System.out.print("_");		
		}
		System.out.println("");		
		System.out.print("  |");		
		for(int x=9*9;x>2;x--)
		{
			if(x%9==2)
			{
				System.out.print("|");		
			}
			else
			{
				System.out.print(" ");		
			}
		}
		System.out.println("|");
		
		
			System.out.print("  |");
			for(int j=9;j>=0;j--)
			{
				int k=(10*i)+j+1;	
				
				System.out.print("["+get2DigitNum(k)+"]"+"   |");
			}
			System.out.println("");
		}
		else if(i%2==0)
		{
			
				System.out.print("  ");		
		for(int x=9*9;x>0;x--)
		{
			System.out.print("_");		
		}
		System.out.println("");		
	
			
			System.out.print("  |");		
		for(int x=9*9;x>2;x--)
		{
			if(x%9==2)
			{
				System.out.print("|");		
			}
			else
			{
				System.out.print(" ");		
			}
		}
		System.out.println("|");
			
			
			System.out.print("  |");
			for(int  l=1,j=i;j<i+10;l++,j++)
			{
				int k=(10*i)+l;
				System.out.print("["+get2DigitNum(k)+"]"+"   |");
				
			}	
			System.out.println("");
		}
		
	}
	System.out.print("  ");		
	for( int i=9*9;i>0;i--)
	{
			System.out.print("_");		
	}		

	System.out.print("\n");
}

public String get2DigitNum(int k)
{
	if(k<10)
	{
		return "0"+k;
	}
	else if(k==100)
	{
		return "HM";
	}
	else
	{
		return k+"";
	}
}

public void inputPlayersDetails()
{
	int player1=0,player2=0;
	int currentplayer=-1;
	int diceValue=0;
	Scanner scan=new Scanner(System.in);
	String str;
	int diceValue=0;
	
	do
	{
		System.out.println(Current Player==-1? "\n FIRST PLAYER TURN" : "\n SECOND PLAYER TURN");
		System.out.println("PRESS A TO ROLL THE DIE");
		str=next();
		diceValue=rollDice();
		
		if(current player==-1)
		{
			player1=PlayerValue(player1,diceValue);
			System.out.println("First Player:"+player1);
			System.out.println("Second Player"+player2);
			System.out.println("**********************");
		}
		if(isWin(player1))
		{
			System.out.println("First Player wins");
			return;
		}
		
	}
	else{
		player2=playerValue(player2,diceValue);
		System.out.println("First Player:"+player);
		System.out.println("Second Player:"+player2);
		System.out.println("***********************");
		}
		if(isWin(player2))
		{
			System.out.println("Second Player wins");
			return;
		}
		currentPlayer=currentPlayer;
		}while("A".equals(str));
}	
	
	public int rollDice()
	{
		int n=0;
		Random r=new Random();
		n=r.nextInt(6);
		return (n==0);
	}
}


