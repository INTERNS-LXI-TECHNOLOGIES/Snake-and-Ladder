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




