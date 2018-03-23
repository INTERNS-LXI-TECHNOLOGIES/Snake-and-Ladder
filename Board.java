package com.lxisoft.snakeandladder;
import java.util.*;
public class Board
{
int[][] boxes = new int[10][10];
String[][] spaces = new String[10][10];
static int noOfPlayer; 
//ArrayList<Snake> snakes = new ArrayList<Snake>();




public void gameImplementation(Player[] players,ArrayList<Snake> snakes,ArrayList<Ladder> ladders)
{	
//System.out.print("fff");
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
		/* for(int t = 0;t<noOfPlayer;t++)
		 {
		 System.out.print("\n");
		 for(int x=70;x>0;x--)
		 {
			if(x%7==0)
			{
				
				
				System.out.print(" ");
				System.out.print(getTwo(boxes[i][Math.abs((((i+1)%2)*9)-((x/7)-1))])+" ");
				
			}
			else
			{	
				System.out.print(" ");
			}
		 }


		}*/
		 System.out.print("\n");
	} 
}
	int getTwo(int x)
	{
		int temp = x;
		if(x<10)
		{	
			System.out.print("0");	
		}
		return temp;
	}
	//Math.abs((((i+1)%2)*9)-((x/7)-1))
			 public void rightToLeft(int i,Player[] players,ArrayList<Snake> snakes,ArrayList<Ladder> ladders)
			 {
				 
			 for(int j = 0;j<=9;j++)
			 {
	         boolean flag = false;
				 int k=(10*i)+j+1;
				 boxes[i][j] = k;
				 spaces[i][j] = " ";
				 if(i == 0 && j < 9)
				 {
					
	
                     

                    for(int n = 0;n<snakes.size();n++)
					{
						if(snakes.get(n).getHeadOfSnake() == boxes[i][j] )
						{
							System.out.print("S"+(n+1));
							flag = true;
						}
						 if(snakes.get(n).getTailOfSnake() == boxes[i][j])
						{
							System.out.print("s"+(n+1));
							flag = true;
						}
						else
						{
							
						 System.out.print("");	
						}
						
					}

                    for(int s = 0;s<ladders.size();s++)
					{
						if(ladders.get(s).getTop() == boxes[i][j])
					
						{
							System.out.print("L"+(s+1));
							flag = true;
						}
						if(ladders.get(s).getBottom() == boxes[i][j])
						
						{
							System.out.print("l"+(s+1));
							flag = true;
						}
						else
						{
						 System.out.print("");	
						}
					}	
										
					
					
					for(int m = 0;m<noOfPlayer;m++)
					{
						if(players[m].position==boxes[i][j])
						{
						  System.out.print("P"+(m+1)); 
						/*String temp= ""+m+1;
						System.out.print(temp);
						spaces[i][j] = temp;*/
						flag = true;
						}
						else{
							
							System.out.print("");
							//spaces[i][j] = " ";
						}
					}	
					
				 System.out.print("[0"+boxes[i][j]+"]");
				 if(flag == true)
				 {
				 System.out.print(getSpace(2)); 
				 }
				 else
				 {
					 System.out.print(" "+getSpace(0));
				 }
				 
				 //System.out.print("  "+spaces[i][j]+getSpace());
					
				 }
		
				 else 
					{
						
						
						 for(int n = 0;n<snakes.size();n++)
					{
						if(snakes.get(n).getHeadOfSnake() == boxes[i][j] )
						{
							System.out.print("S"+(n+1));
							flag = true;
						}
						 if(snakes.get(n).getTailOfSnake() == boxes[i][j])
						{
							System.out.print("s"+(n+1));
							flag =  true;
						}
						else
						{
							System.out.print("");
						}
					}		
						
						 for(int s = 0;s<ladders.size();s++)
					{
						if(ladders.get(s).getTop() == boxes[i][j])
						{
							System.out.print("L"+(s+1));
				        flag = true;
						}
						if(ladders.get(s).getBottom() == boxes[i][j])
						
						{
							System.out.print("l"+(s+1));
							flag = true;
						}
						else
						{
						 System.out.print("");	
						}
					}		
							
						for(int m=0;m<noOfPlayer;m++)
						{
							if(players[m].position==boxes[i][j])
							{
							
							System.out.print("P"+(m+1));
							flag = true; 
							}
                          else	
						  {
							  System.out.print("");
						  }							  
						}
						
						
						
						
					    System.out.print("["+boxes[i][j]+"]");
						if(flag == true)
				 {
				 System.out.print(getSpace(2)); 
				 }
				 else
				 {
					 System.out.print(" "+getSpace(1));
				 }
						
					}
		
		   
				 }
			 System.out.print("                                                                                     \n");
			 
			 }
			 
			 
			 
			 
			 public void leftToRight(int i,Player[] players,ArrayList<Snake> snakes,ArrayList<Ladder> ladders)
			 {
			
		   for(int j = 9;j>=0;j--)
		   {
			   boolean flag = false;
			int k=(10*i)+j+1;
			boxes[i][j] = k;
			   
			    for(int n = 0;n<snakes.size();n++)
					{
						if(snakes.get(n).getHeadOfSnake() == boxes[i][j] )
						{
							System.out.print("S"+(n+1));
							flag = true;
						}
						 if(snakes.get(n).getTailOfSnake() == boxes[i][j] )
						{
							System.out.print("s"+(n+1));
							flag = true;
						}
						else
						{
						 System.out.print("");	
						}
					}
					
					 for(int s = 0;s<ladders.size();s++)
					{
						if(ladders.get(s).getTop() == boxes[i][j])
						{
							System.out.print("L"+(s+1));
							flag = true;
						}
						if(ladders.get(s).getBottom() == boxes[i][j])
						{
							System.out.print("l"+(s+1));
							flag = true;
						}
						else
						{
						 System.out.print("");	
						}
					}
					
							
			  for(int m=0;m<noOfPlayer;m++)
			   {
			   if(players[m].position==boxes[i][j])
					{
					System.out.print("P"+(m+1));
                    flag = true;					
					}
					else
					{
						System.out.print("");
					}
			   
			   }
			   
					
		
			   
			   
				  System.out.print("["+boxes[i][j]+"]");
			   if(flag == true)
				 {
				 System.out.print(getSpace(2)); 
				 }
				 else
				 {
					 System.out.print(" "+getSpace(0));
				 }
		   
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
			 
			 
			 
			 


public String getSpace(int num)
{
	int n = 4;
	String space = " ";
	for(int i=0;i<(n-num);i++)
	{
	  space+=" ";
	}
	return space;
}

}