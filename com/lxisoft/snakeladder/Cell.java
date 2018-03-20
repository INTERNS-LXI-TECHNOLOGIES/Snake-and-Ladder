import java.util.*;
public class Cell
{
	private int cellNumber;
	private boolean hasSnakeHead;
	private boolean hasSnakeTale;
	private boolean hasLadderStart;
	private boolean hasLadderEnd;
	private ArrayList<Player> players=new ArrayList<Player>();
	public void setCellNumber(int cellNo)
	{
		this.cellNumber=cellNo;
	}
	public int getCellNumber()
	{
		return this.cellNumber;
	}
	
	public void setHasSnakeHead(boolean hasSnH)
	{
		this.hasSnakeHead=hasSnH;
	}
	public boolean getHasSnakeHead()
	{
		return this.hasSnakeHead;
	}
	
	public void setHasSnakeTale(boolean hasSnT)
	{
		this.hasSnakeTale=hasSnT;
	}
	public boolean getHasSnakeTale()
	{
		return this.hasSnakeTale;
	}
	
	public void setHasLadderStart(boolean hasLdS)
	{
		this.hasLadderStart=hasLdS;
	}
	public boolean getHasLadderStart()
	{
		return this.hasLadderStart;
	}
	
	public void setHasLadderEnd(boolean hasLdE)
	{
		this.hasLadderEnd=hasLdE;
	}
	public boolean getHasLadderEnd()
	{
		return this.hasLadderEnd;
	}
}