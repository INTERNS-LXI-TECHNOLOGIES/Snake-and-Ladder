package com.lxisoft.snakeandladder;
import java.util.ArrayList;
public class Snake
{
private int headOfSnake;
private int tailOfSnake;

public void setHeadOfSnake(int headOfSnake)
{
	this.headOfSnake = headOfSnake;
}
public int getHeadOfSnake()
{
	return headOfSnake;
}
public void setTailOfSnake(int tailOfSnake)
{
	this.tailOfSnake = tailOfSnake;
}
public int getTailOfSnake()
{
	return tailOfSnake;
}

public boolean availableValue(int x,ArrayList<Integer> totalValues)
{
	try{
		Thread.sleep(500);
	}catch(Exception e){e.printStackTrace();}
	for(int i=0;i<totalValues.size();i++)
	{
	
		if(x ==totalValues.get(i))
		{
			//if(snakes[i].getHeadOfSnake()-snakes[i].getTailOfSnake()>=15)
			//{
		    return false;
			//}
		}
	}
	return true;
}

//public void setSnakeDetails(Snake[] snakes,Ladder[] ladders,int no)
public void setSnakeDetails(ArrayList<Integer> totalValues)
{
	//System.out.print("ddd");
	boolean isTrue;
	int temp1,temp2;
	do{
	temp1=(int) (Math.random()*65)+31;
	System.out.println("test "+temp1);	
	}while(!availableValue(temp1,totalValues));
	this.setHeadOfSnake(temp1);
	totalValues.add(temp1);
	
	do{
	temp2=(int) (Math.random()*45)+2;
	System.out.println("test2 "+temp2);	
	}while(!availableValue(temp2,totalValues));
	this.setTailOfSnake(temp2);
	totalValues.add(temp2);
	//System.out.println(temp1+" <<>> "+temp2);
	//setHeadOfSnake((int) (Math.random()*75)+23);
	
	//do{
	//setTailOfSnake((int) (Math.random()*58)+2);
	
	//}while(this.headOfSnake<this.tailOfSnake&&(this.headOfSnake-this.tailOfSnake)==15);
}


}