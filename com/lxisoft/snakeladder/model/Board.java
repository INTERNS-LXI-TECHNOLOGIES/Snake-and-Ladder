public class Board
{
	int cell[][]=new int[10][10];
	ArrayList<Snake> snake=new ArrayList<Snake>();
	ArrayList<Ladder> ladder=new ArrayList<Ladder>();
	
	public void setCell(int cells[][])
	{
		this.cell=cells;
	}
	public int[][] getCell()
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