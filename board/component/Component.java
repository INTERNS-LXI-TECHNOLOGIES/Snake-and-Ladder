 package com.lxisoft.snakeandladder3.board.component;
 import com.lxisoft.snakeandladder3.board.Cell;
 import java.io.IOException;
public abstract class Component{
private int ID;
private Cell start;
private Cell end;
public void setID(int ID)
	{
		this.ID=ID;
	} 
public int getID()
	{
		return ID;
	}
public void setStart(Cell start)
	{
		this.start=start;
	}
public Cell getStart()
	{
		return start;
	}
public void setEnd(Cell end)
	{
		this.end=end;
	}
public Cell  getEnd()
	{
		return end;
	}
}