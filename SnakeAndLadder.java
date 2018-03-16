package com.lxisoft.snakeandladder;
import java.util.*;
public class SnakeAndLadder
{
   Board board = new Board();
   Player[] players = new Player[3];
   /*Player player1 = new Player();
   Player player2 = new Player();*/
  // ArrayList<Player> players = new ArrayList<Player>();
   
   Scanner scan = new Scanner(System.in);
   int playerId=0;
   int choice;
   
	public void game()
	{
		int diceValue;
		int i;
		boolean isToRepeat=false;
		for(i=0;i<3;i++)
		{
			players[i] = new Player();
		}
			board.gameImplementation();
		do
		{
		
		
			System.out.println("Player "+(playerId+1)+"'s Chance :");
			System.out.println("Enter 1 to throw Dice :");
			choice = scan.nextInt();
			if(choice != 1)
			{
				break;
			}
			
			
			
		do{
			diceValue=(int) (Math.random()*6)+1;
			System.out.print("Dice Value"+diceValue);
			isToRepeat = updatePosition(diceValue,playerId);
		  }while(isToRepeat==true);
	        
			playerId = (playerId+1)%3;
			
		}while(checkWin(playerId)==false);	  
	  
	}
	
	
	
	
	public boolean updatePosition(int diceValue,int playerId)
	{
		
		System.out.print(players[0].position+" "+players[1].position);
	   if(diceValue==1&&players[playerId].position ==0)
	   {
		   System.out.print("Player"+1+" is entered into game...");
		   players[playerId].position = 1;
	   }
	   else if(players[playerId].position+diceValue<=100&&players[playerId].position>0)
		{
		   players[playerId].position +=diceValue ;
		   System.out.println("current position of player  "+players[playerId].position);
	    }
		
		
		if(diceValue==6&&diceValue==1)
		{
			return true;
		}
		return false;
	}
	
	
	
	
	public boolean checkWin(int playerId)
	{
		
			if(players[playerId].position==100)
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