package com.lxisoft.snakeandladder;
public class Board
{
int[][] boxes = new int[10][10];

 Snake snake2 = new Snake();
 Snake snake3 = new Snake();
Snake snake1 = new Snake();

public void gameImplementation()
{	


	 for(int i = 9;i>=0;i--)
	 {
		 
		 if(i%2 ==1)
		 {
			 leftToRight(i,snake1.getHeadOfSnake(),snake1.getTailOfSnake());
		 }
		 else if(i%2==0)
		 {
			 rightToLeft(i,snake1);
		 }
		 System.out.print("\n");
		
	 }
	 

	 
}
	
			 public void rightToLeft(int i,int head,int tail)
			 {
				 
	
			 for(int j = 0;j<=9;j++)
			 {
				 int k=(10*i)+j+1;
				 boxes[i][j] = k;
				  if(head||tail==k)
				  {
					  boxes[i-1][j-1] = "S";
				  }
				 if(i==0&&j<9)
				 {
		   
					System.out.print("["+i+boxes[i][j]+"]"+getSpace()); 
				 }
				 else{
				
			   System.out.print("["+boxes[i][j]+"]"+getSpace());
		   
				 }
			 }
			 System.out.print("                                                           ");
			 }
			 
			 
			 
			 
			 public void leftToRight(int i,int head,int tail)
			 {
			
		   for(int j = 9;j>=0;j--)
		   {
			   int k=(10*i)+j+1;
			   
			   boxes[i][j] = k;
			   if(head||tail==k)
			   {
				   boxes[i-1][j-1] = "s";
			   }
			  
				  System.out.print("["+boxes[i][j]+"]"+getSpace());
			  
		   }
			   System.out.print("                                                           ");
			 }


public String getSpace()
{
	return "   ";
}

}