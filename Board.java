package com.lxisoft.snakeandladder;
import java.util.*;
public class Board
{
int[][] boxes = new int[10][10];
ArrayList<Snake> snakes = new ArrayList<Snake>();




public void gameImplementation(Player player,int playerId)
{	
	 for(int i = 9;i>=0;i--)
	 {
		 if(i%2 ==1)
		 {
			 leftToRight(i,player,playerId);
		 }
		 else if(i%2==0)
		 {
			 rightToLeft(i,player,playerId);
		 }
		 System.out.print("\n");		
	 } 
}
	
			 public void rightToLeft(int i,Player player,int playerId)
			 {
				 
	
			 for(int j = 0;j<=9;j++)
			 {
				 int k=(10*i)+j+1;
				 boxes[i][j] = k;
				
				 if(i==0&&j<9)
				 {
					if(player.position==boxes[i][j])
					{
					System.out.print((playerId+1)+"["+i+boxes[i][j]+"]"+getSpace()); 
					}
					else{
						
						System.out.print("["+i+boxes[i][j]+"]"+getSpace()); 
					}
				 }
				 else{
				if(player.position==boxes[i][j])
					{
					System.out.print((playerId+1)+"["+boxes[i][j]+"]"+getSpace()); 
					}
					else
					{
			         System.out.print("["+boxes[i][j]+"]"+getSpace());
					}
		   
				 }
			 }
			 System.out.print("                                                           ");
			 }
			 
			 
			 
			 
			 public void leftToRight(int i,Player player,int playerId)
			 {
			
		   for(int j = 9;j>=0;j--)
		   {
			int k=(10*i)+j+1;
			boxes[i][j] = k;
			   
			   if(player.position==boxes[i][j])
					{
					System.out.print((playerId+1)+"["+i+boxes[i][j]+"]"+getSpace()); 
					}
					else
				  System.out.print("["+boxes[i][j]+"]"+getSpace());
			  
		   }
			   System.out.print("                                                           ");
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