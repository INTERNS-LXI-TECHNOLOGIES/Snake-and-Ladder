package com.lxisoft.snakeandladder;
import com.lxisoft.snakeandladder.Snake;
public class SnakeAndLadder
{
 int noOfBoxes=100;
 
 Snake snake[] = new Snake[4];
 int[][] boxes = new int[10][10];

public void gameImplementation()
{
 int l=0;
		 
	 for(int i = 9;i>=0;i--)
	 {
		 do
		 {
			 snake[l] = new Snake();
		 if(i%2 ==1||snake[l].getHeadOfSnake()%2==1||snake[l].getTailOfSnake()%2==1)
		 {
		   for(int j = 9;j>=0;j--)
		   {
			   int k=(10*i)+j+1;
			   
			   boxes[i][j] = k;
		   
			   
			   System.out.print("["+boxes[i][j]+"]"+getSpace());
		   }
			   System.out.print("                                                           ");
		 }
		 else if(i%2==0||i==0||snake[l].getHeadOfSnake()%2==0||snake[l].getTailOfSnake()%2==0)
		 {
			 for(int j = 0;j<=9;j++)
			 {
				 int k=(10*i)+j+1;
				 boxes[i][j] = k;
			
				 if(i==0&&j<9)
				 {
					System.out.print("[0"+boxes[i][j]+"]"+getSpace()); 
				 }
				 else
				 {
				System.out.print("["+boxes[i][j]+"]"+getSpace()); 
				 }
			 }
			 System.out.print("                                                           ");
		 }
		 System.out.print("\n");
	 }while(l>4);
	 }
	 
}
	
public void setSnake()
{
	for(int i=0;i<4;i++)
	{
		snake[i] = new Snake();
		snake[i].getHeadOfSnake();
		snake[i].getTailOfSnake();
	}
}	
	
	
public String getSpace()
{
	return "   ";
}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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