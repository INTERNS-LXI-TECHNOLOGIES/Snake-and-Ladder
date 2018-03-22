package com.lxisoft.snakeandladder;
import com.lxisoft.clearscreen.Clearscreen;
import java.io.*;
import java.util.*;
public class SnakeAndLadder
{
   Board board = new Board();
   Player[] players = new Player[10];
   //Snake [] snakes = new Snake[3];
   //Ladder[] ladders = new Ladder[3];
   ArrayList<Snake> snakes = new ArrayList<Snake>();
   ArrayList<Ladder> ladders = new ArrayList<Ladder>();
   
   Clearscreen cls = new Clearscreen();
  
   int playerId=0;
   int choice;
   int noOfPlayer;
   boolean isCorrect;
   
	public void game()
	{
       ArrayList<Integer> totalValues = new ArrayList<Integer>();
       Scanner scan = new Scanner(System.in);
	   System.out.print("Enter the no.of players:");
	   noOfPlayer = scan.nextInt();
	   Board.noOfPlayer=noOfPlayer;
		int diceValue;
		int i;
		boolean isToRepeat=false;
		for(i=0;i<noOfPlayer;i++)
		{
			players[i] = new Player();
		}
		
		int r = 0;	
		do
		{
			snakes.add(new Snake());
			ladders.add(new Ladder());
			snakes.get(snakes.size()-1).setSnakeDetails(totalValues);
			ladders.get(ladders.size()-1).setLadderDetails(totalValues);
			/*snakes[r] = new Snake();	
			ladders[r] = new Ladder();
		
			snakes[r].setSnakeDetails(snakes,ladders,r);
			System.out.println("Snake "+(r+1)+" Set SuccessFully");
			
			ladders[r].setLadderDetails(snakes,ladders,r);
			System.out.println("Ladder "+(r+1)+" Set Successfully");*/
		r++;
			
		}while(snakes.size()<=2);
	
		System.out.println("Snakes & Ladders Done..");
		
		board.gameImplementation(players,snakes,ladders);
		do
		{
			
			
			/*try {
					   cls.clear();
			           board.gameImplementation(players[playerId],playerId);
	                   
					   
				   }
				   catch(IOException error){
					   System.out.print("Error.....");
				   }
				   catch(InterruptedException error){
					   System.out.print("Error.....");
				   }*/
		
			System.out.println("Player "+(playerId+1)+"'s Chance :");
			System.out.println("Enter 1 to throw Dice :");
			choice = scan.nextInt();
			if(choice != 1)
			{
				break;
			}
			
			
			try{
		         do{
			diceValue=(int) (Math.random()*6)+1;
			System.out.println("Dice Value"+diceValue);
			Thread.sleep(2000);
			isToRepeat = updatePosition(diceValue,playerId,snakes,ladders);
			Thread.sleep(2000);
			cls.clear();
			System.out.print("                                                                  \n");
			board.gameImplementation(players,snakes,ladders);
			Thread.sleep(2000);
		  }while(isToRepeat==true);
			
			playerId = (playerId+1)%noOfPlayer;
			}catch(Exception e)
			{
				System.out.print(".....");
			}
			
			
		}while(checkWin(playerId)==false);	  
			
	  
	}
	
	
	
	
	public boolean updatePosition(int diceValue,int playerId,ArrayList<Snake> snakes,ArrayList<Ladder> ladders)
	{
		
		//System.out.print(players[0].position+" "+players[1].position);
	   if(diceValue==1&&players[playerId].position ==0)
	   {
		   System.out.println("Player"+(playerId+1)+" is entered into game...");
		   players[playerId].position = 1;
	   }
	   else if(players[playerId].position+diceValue<=100&&players[playerId].position>0)
		{
		   players[playerId].position +=diceValue ;
		   System.out.println("current position of player"+(playerId+1)+" is "+players[playerId].position);
		   
		   for(int m  =snakes.size()-1;m<snakes.size();m++)
		   {
		   if(players[playerId].position == snakes.get(m).getHeadOfSnake()) 
		   {
			   System.out.print("Snakes Swallowing...............");
			   players[playerId].position = snakes.get(m).getTailOfSnake();
			   System.out.print("Current position of player"+(playerId+1)+"  is "+players[playerId].position);
		   }
		   }
		   for(int n = ladders.size()-1;n<ladders.size();n++)
		   {
		   if(players[playerId].position == ladders.get(n).getBottom())
		   {
			   System.out.print("Moving..........");
			   players[playerId].position = ladders.get(n).getTop();
			    System.out.print("Current position of player"+(playerId+1)+" is "+players[playerId].position);
		   }
		   }
	    }
		
			
		
		if(diceValue==6||diceValue==1)
		{
			return true;
		}
		return false;
	
	}
	
	
	
	
	public boolean checkWin(int playerId)
	{
		
			if(players[playerId].position==100)
			{
				System.out.println("Player "+playerId+"  won........");
				return true;
			}
		
		return false;
	}
	
	public boolean checkCorrect(int head,int tail,int bottom,int top)
	
	
	{
		int flag=3;
		if(head == bottom && head == top)
		{
		
		flag =1;
		}
		if(tail == bottom && tail == top)
		{
			flag =2;
		}
		
		if(flag<=2)
		{
			return true;
		}
		
		return false;
	}
	
	
}
 


/*public void setSnake()
{
	for(int i=0;i<4;i++)
	{
		snake[i] = new Snake();
		snake[i].getHeadOfSnake();
		snake[i].getTailOfSnake();
		if(snake[i].getHeadOfSnake()%2==1)
		{
			
		}
	}
}*/	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*int i,j;
	for( i= 0;i<9;i++)
	{
       for(j = 0;j<9;j++)
		{
		 
			
		}while(i%2==0);
	   }
		if(i%2==1)
		{
			for(j = 9;j>0;j--)
			{
				boxes[i][j] = k;
				System.out.print(getSpace()+"["+k+"]");
			}
		}
	}
	}
				
				
}

public int leftToRight()
{
	for(int k = noOfBoxes;k>0;k--)
			{
			  boxes[i][j] = k;
			  System.out.print("["+k+"]"+getSpace());
		}
		
}

}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			/*	if(k%10==1)
				{
					System.out.print("\n");
	            }
				else
				{
					System.out.print("["+k+"]"+getSpace());
				}
			}
		}
	}
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*if()
				{
					boxes[i][j] = k;
					System.out.print("["+boxes[i][j]+"]"+getSpace());
				}
				else
				{
					System.out.print("\n");
		        }
				System.out.print(getSpace()+"["+k+"]");
				
			}
		}
	}*/
	  /* if(i<10)
	   {
		   System.out.print("[0"+i+"]"+getSpace());
		   
	   }
	   else
	   {
	   System.out.print("["+i+"]"+getSpace());
	   }
	   if(i%10==1)
	   {
		   System.out.print("\n");
	   }
	   
	   
	}*/