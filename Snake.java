package com.lxisoft.snakeandladder;
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

public void setSnakeDetails()
{
	setHeadOfSnake((int) (Math.random()*79)+9);
	do{
	setTailOfSnake((int) (Math.random()*58)+2);
	}while(this.headOfSnake<this.tailOfSnake&&(this.headOfSnake-this.tailOfSnake)==15);
}


}