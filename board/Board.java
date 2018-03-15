package com.lxi.snakeandladder.board;
public class Board
{
   Cell[][] cells= new Cell[10][10];
   //Snake snake;
   //Ladder ladder;
  //cell[0][0].setPlayer(players[0]);
  
  public void getBoard()
  {
	 
   for(int i=9;i>=0;i--)
    {
	   if(i%2==1)
	    {
		 for(int j=9;j>=0;j--)
		  {
			int k=(10*i)+j+1;
			cells[i][j]=k;
			System.out.print("["+cells[i][j]+"]"+" ");
			
		  }
		  System.out.print("                                     ");
		  
	    }
       else if(i%2==0)
		{
			for(int j=0;j<=9;j++)
			{
				int k=(10*i)+j+1;
				cells[i][j]=k;
				if(i==0&&j<9)
				{
					System.out.print("["+i+cells[i][j]+"]"+" ");

				}
				
				else
				{
					System.out.print("["+cells[i][j]+"]"+" ");
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