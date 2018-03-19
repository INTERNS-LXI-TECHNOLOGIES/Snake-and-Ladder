package com.lxi.snakeandladder.board;
import com.lxi.snakeandladder.board.Cell;
public class Board
{
  public Cell[][] cells= new Cell[10][10];
   int[][] boxes  = new int[10][10];
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
			boxes[i][j]=k;
			cells[i][j].cellNo = k;
	
			System.out.print("["+boxes[i][j]+"]"+" ");
			
		  }
		  System.out.print("                                     ");
		  
	    }
       else if(i%2==0)
		{
			for(int j=0;j<=9;j++)
			{
				int k=(10*i)+j+1;
				boxes[i][j]=k;
				cells[i][j].cellNo = k;
				
				if(i==0&&j<9)
				{
					System.out.print("["+i+boxes[i][j]+"]"+" ");

				}
				
				else
				{
					System.out.print("["+boxes[i][j]+"]"+" ");
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