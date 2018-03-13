package com.lxisoft.snakeandladder;
public class Snake
{
private int headOfSnake;
private int tailOfSnake;

public void setHeadOfSnake(int headOfSnake)
{
	headOfSnake = headOfSnake;
}
public int getHeadOfSnake()
{
	return headOfSnake;
}
public void setTailOfSnake(int tailOfSnake)
{
	tailOfSnake = tailOfSnake;
}
public int getTailOfSnake()
{
	return tailOfSnake;
}

public void setSnakeDetails()
{
	setHeadOfSnake((int) (Math.random()*100)+10);
	setTailOfSnake((int) (Math.random()*90)+2);
}


}