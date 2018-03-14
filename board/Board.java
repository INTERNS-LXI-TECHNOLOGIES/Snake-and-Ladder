package com.lxi.snakeandladder.board;
public class Board
{
   int[][] box= new int[10][10];
   //Snake snake;
   //Ladder ladder;
  
  
  public void createBoxes()
  {
	 
   for(int i=9;i>=0;i--)
    {
	   if(i%2==1)
	    {
		 for(int j=9;j>=0;j--)
		  {
			int k=(10*i)+j+1;
			box[i][j]=k;
			System.out.print("["+box[i][j]+"]"+" ");
			
		  }
		  System.out.print("                                     ");
		  
	    }
       else if(i%2==0)
		{
			for(int j=0;j<=9;j++)
			{
				int k=(10*i)+j+1;
				box[i][j]=k;
				if(i==0&&j<9)
				{
					System.out.print("["+i+box[i][j]+"]"+" ");

				}
				
				else
				{
					System.out.print("["+box[i][j]+"]"+" ");
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