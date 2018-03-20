package com.lxisoft.snakeandladder;
import java.util.*;
public class Board
{
int[][] boxes = new int[10][10];
ArrayList<Snake> snakes = new ArrayList<Snake>();




public void gameImplementation(Player[] players,Snake[] snakes,Ladder[] ladders)
{	
	 for(int i = 9;i>=0;i--)
	 {
		 if(i%2 ==1)
		 {
			 leftToRight(i,players,snakes,ladders);
		 }
		 else if(i%2==0)
		 {
			 rightToLeft(i,players,snakes,ladders);
		 }
		 System.out.print("\n");		
	 } 
}
	
			 public void rightToLeft(int i,Player[] players,Snake[] snakes,Ladder[] ladders)
			 {
				 
	
			 for(int j = 0;j<=9;j++)
			 {
				 int k=(10*i)+j+1;
				 boxes[i][j] = k;
				
				 if(i == 0 && j < 9)
				 {
					for(int m = 0;m<players.length;m++)
					{
						if(players[m].position==boxes[i][j])
						{
						System.out.print((m+1)); 
						}
						else{
							
							System.out.print(" ");
						}
						
					}
	
                     

                    for(int n = 0;n<snakes.length;n++)
					{
						if(snakes[n].getHeadOfSnake() == boxes[i][j] )
						{
							System.out.print("S"+(n+1));
						}
						 if(snakes[n].getTailOfSnake() == boxes[i][j])
						{
							System.out.print("s"+(n+1));
						}
					}	


                    for(int s = 0;s<ladders.length;s++)
					{
						if(ladders[s].getTop() == boxes[i][j])
						{
							System.out.print("L"+(s+1));
						}
						if(ladders[s].getBottom() == boxes[i][j])
						{
							System.out.print("l"+(s+1));
						}
					}						
					
					
					
				 System.out.print("[0"+boxes[i][j]+"]"+getSpace()); 
					
				 }
		
				 else 
					{
						
						for(int m=0;m<players.length;m++)
						{
							if(players[m].position==boxes[i][j])
							{
							
							System.out.print((m+1));
							}
                          else	
						  {
							  System.out.print(" ");
						  }							  
						}
						
						
						 for(int n = 0;n<snakes.length;n++)
					{
						if(snakes[n].getHeadOfSnake() == boxes[i][j] )
						{
							System.out.print("S"+(n+1));
						}
						 if(snakes[n].getTailOfSnake() == boxes[i][j])
						{
							System.out.print("s"+(n+1));
						}
					}		
						
						 for(int s = 0;s<ladders.length;s++)
					{
						if(ladders[s].getTop() == boxes[i][j])
						{
							System.out.print("L"+(s+1));
						}
						if(ladders[s].getBottom() == boxes[i][j])
						{
							System.out.print("l"+(s+1));
						}
					}		
						
						
						
						
					    System.out.print("["+boxes[i][j]+"]"+getSpace()); 
						
					}
		
		   
				 }
			 System.out.print("                                                                                     \n");
			 
			 }
			 
			 
			 
			 
			 public void leftToRight(int i,Player[] players,Snake[] snakes,Ladder[] ladders)
			 {
			
		   for(int j = 9;j>=0;j--)
		   {
			int k=(10*i)+j+1;
			boxes[i][j] = k;
			  for(int m=0;m<players.length;m++)
			   {
			   if(players[m].position==boxes[i][j])
					{
					System.out.print((m+1)); 
					}
					else
					{
						System.out.print(" ");
					}
			   
			   }
			   
			   
			    for(int n = 0;n<snakes.length;n++)
					{
						if(snakes[n].getHeadOfSnake() == boxes[i][j] )
						{
							System.out.print("S"+(n+1));
						}
						 if(snakes[n].getTailOfSnake() == boxes[i][j])
						{
							System.out.print("s"+(n+1));
						}
					}	
					
					 for(int s = 0;s<ladders.length;s++)
					{
						if(ladders[s].getTop() == boxes[i][j])
						{
							System.out.print("L"+(s+1));
						}
						if(ladders[s].getBottom() == boxes[i][j])
						{
							System.out.print("l"+(s+1));
						}
					}		
			   
			   
			   
			   
				  System.out.print("["+boxes[i][j]+"]"+getSpace());
			   
		   
			 }
			   System.out.print("                                                                                                \n");
			 }
			 
		/*public void setSnake(int i,int j)
		{
			do
			{
			snakes.add(new Snake());
			}while(snakes.get(snakes.size()-1<=0))
			if(snakes.get(snakes.size()-1))
			
		}*/			
			 
			 
			 
			 


public String getSpace()
{
	return "   ";
}

}