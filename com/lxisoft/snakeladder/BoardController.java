import java.util.*;
public class BoardController
{
	private ArrayList<Cell> cell=new ArrayList<Cell>();
	private Board board=new Board();
	private SnakeController snakeController=new SnakeController();
	private LadderController ladderController=new LadderController();
	public void createBoard()throws Exception
	{
		for(int i=1;i<=100;i++)
		{
			Cell cel=new Cell();
			cel.setCellNumber(i);
			cell.add(cel);
		}
		board.setCell(cell);
		snakeController.createSnake(board);
		ladderController.createLadder(board);
	}
	public void displayBoard()
	{
		ArrayList<Cell> cells=new ArrayList<Cell>();
		cells=board.getCell();
		ArrayList<Snake> snakes=new ArrayList<Snake>();
		snakes=board.getSnake();
		for(Snake s:snakes)
		{
			for(Cell c:cells)
			{
				if(s.getDropStartPosition()==c.getCellNumber())
				{
					c.setHasSnake(true);
				}
			}
		}
		ArrayList<Ladder> ladders=new ArrayList<Ladder>();
		ladders=board.getLadder();
		for(Ladder l:ladders)
		{
			for(Cell c:cells)
			{
				if(l.getClimbStartPosition()==c.getCellNumber())
				{
					c.setHasLadder(true);
				}
			}
		}
		
		int index=99;
		for(int j=0;j<10;j++)
		{
			for(int i=0;i<10;i++)
			{
				System.out.print(cells.get(index).getCellNumber());
				if(cells.get(index).getHasLadder()==true)
				{
					System.out.print("L");
				}
				if(cells.get(index).getHasSnake()==true)
				{
					System.out.print("S");
				}
				System.out.print("	");
				index--;
			}
			System.out.println("\n");
		}
		
	}
}