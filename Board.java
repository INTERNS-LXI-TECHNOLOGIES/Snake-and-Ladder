package com.lxisoft.snakeandladder2;
import com.lxisoft.snakeandladder2.Dies;
import com.lxisoft.snakeandladder2.Player;
import com.lxisoft.snakeandladder2.Cells;
public class Board
{
	private int cell=100;
	
	Cells[][] cells=new Cells[10][10]; 	
	public void setBoardCell(int cell)
	{
		this.cell=cell;
	}
	public int getBoardCell()
	{
		return cell;
	}
}