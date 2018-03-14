import java.util.*;
public class Board
{
	private ArrayList<Cell> cell=new ArrayList<Cell>();
	private ArrayList<Snake> snake=new ArrayList<Snake>();
	private ArrayList<Ladder> ladder=new ArrayList<Ladder>();
	
	public void setCell(ArrayList<Cell> cells)
	{
		this.cell=cells;
	}
	public ArrayList<Cell> getCell()
	{
		return this.cell;
	}
	public void setSnake(ArrayList<Snake> sn)
	{
		this.snake=sn;
	}
	public ArrayList<Snake> getSnake()
	{
		return this.snake;
	}
	public void setLadder(ArrayList<Ladder> ld)
	{
		this.ladder=ld;
	}
	public ArrayList<Ladder> getLadder()
	{
		return this.ladder;
	}
	public Board()
	{
		
	}
}