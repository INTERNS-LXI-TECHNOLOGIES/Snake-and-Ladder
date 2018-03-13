package com.lxi.snakeandladder.board;
public class Board
{
   int numbers[]= new int[10];
   //Snake snake;
   //Ladder ladder;
  
  
  public void createBoxes()
  {
	c= " "; 
   for(int i=9;i>=0;i--)
    {
	   if(i%2==1)
	    {
		 for(int j=9;j>=0;j--)
		  {
			int k=(10*i)+j+1;
			System.out.print("["+k+"]"+c);
		  }
	    }
       else if(i%2==0)
		{
			for(int j=0;j<=9;j++)
			{
				int k=(10*i)+j+1;
				System.out.print("["+k+"]"+c);
			}
			
		}
		else
		 {
			System.out.print("");
		 }
	  System.out.print("\n");
	}	
	  
		  
	}
	
	public string makeSpace()
	{
		return "  ";
	}
  

}