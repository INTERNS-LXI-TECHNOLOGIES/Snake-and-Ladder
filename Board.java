package com.lxisoft.snakeandladder3;
import com.lxisoft.snakeandladder3.Snake;
import com.lxisoft.snakeandladder3.Ladder;
import com.lxisoft.snakeandladder3.Cell;
import java.util.ArrayList;
public class Board
{
	private int cell=100;
	Cell[][] cells=new Cell[10][10];
	ArrayList<Snake> snakes=new ArrayList<Snake>();
	ArrayList<Ladder> ladders=new ArrayList<Ladder>();
	
	public void setCell(int cell)
	{
		this.cell=cell;
	}
	public int getCell()
	{
		return cell;
	}
	
}