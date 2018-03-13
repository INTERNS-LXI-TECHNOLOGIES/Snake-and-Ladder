package com.lxisoft.snakeandladder.board;
import com.lxisoft.snakeandladder.board.Board;
public class Board
{
	int[] numbers = new int[100];
	Snake snake = new Snake();
	Ladder ladder = new Ladder();
	
	public void gameStarts()
	{
		for(int i=numbers.length;i>=1;i--)
		{
			System.out.print("["+i+"]");
		}
	}
}