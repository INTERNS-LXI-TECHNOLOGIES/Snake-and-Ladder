import java.util.*;
public class Cell
{
	private int cellNumber;
	private boolean hasSnake;
	private boolean hasLadder;
	public void setCellNumber(int cellNo)
	{
		this.cellNumber=cellNo;
	}
	public int getCellNumber()
	{
		return this.cellNumber;
	}
	
	public void setHasSnake(boolean hasSn)
	{
		this.hasSnake=hasSn;
	}
	public boolean getHasSnake()
	{
		return this.hasSnake;
	}
	
	public void setHasLadder(boolean hasld)
	{
		this.hasLadder=hasld;
	}
	public boolean getHasLadder()
	{
		return this.hasLadder;
	}
}