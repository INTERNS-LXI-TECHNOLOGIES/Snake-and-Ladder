
/**
Snake And Ladder
**/
package com.lxisoft.snakeandladder2.snakeandladder;
import java.util.Scanner;
public class SnakeNLadder
{
	private int winPoint=100;
	int cells[] = new int[100];
	public void setWinPoint(int winPoint)
     {
	   this.winPoint=winPoint;
     }
	public int getWinPoint()
	{
		return winPoint;
	}
	Scanner scan=new Scanner(System.in);

	public void startGame()
	{	
		int value=cells.length;
		do
		{
			for(int i=value;i>=value-9;i--)
			{
				System.out.print(i+" "+("|"));
			}
			value=value-19;
			System.out.print("\n");
			for(int j=value;j<=value+9;j++)
			{
				if(j<10)
				{
					System.out.print(" "+j+" "+("|"));
				}
				else
				{
					System.out.print(j+" "+("|"));
				}
			}
			System.out.print("\n");
			value=value-1;
		}while(value>=1);
	}

}




	/*for( int i=100;i<=10;i++)
	{
		for(int j=1;j<=10;j++)
		{
			if(i%2==1)
			{
				System.out.print(cells[i]+" ");
				cells[i]--;
			}
			else
			{
				System.out.print(cells[j]+" ");
				cells[j]++;
			}
			
		if(i%2==1)
		{
			cells[i]=cells[i]-9;
		}
		else
		{
			cells[j]=cells[j]-11;
		}
		}
	System.out.print("\n");
	}
}*/

