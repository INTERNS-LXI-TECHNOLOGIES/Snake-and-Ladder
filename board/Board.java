package com.lxi.snakeandladder.board;
public class Board
{
   int[][] cell= new int[10][10];
   //Snake snake;
   //Ladder ladder;
  
  
  public void getBoard()
  {
	 
   for(int i=9;i>=0;i--)
    {
	   if(i%2==1)
	    {
		 for(int j=9;j>=0;j--)
		  {
			int k=(10*i)+j+1;
			cell[i][j]=k;
			System.out.print("["+cell[i][j]+"]"+" ");
			
		  }
		  System.out.print("                                     ");
		  
	    }
       else if(i%2==0)
		{
			for(int j=0;j<=9;j++)
			{
				int k=(10*i)+j+1;
				cell[i][j]=k;
				if(i==0&&j<9)
				{
					System.out.print("["+i+cell[i][j]+"]"+" ");

				}
				
				else
				{
					System.out.print("["+cell[i][j]+"]"+" ");
			    }
			}
                 		  System.out.print("                                     ");
			
		}
		else
		 {
			System.out.print(" ");
		 }
	  System.out.print("\n");
	}	
	  
		  
	}
	

  

}