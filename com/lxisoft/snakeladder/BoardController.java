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
		cell=board.getCell();
		for(Cell i:cell)
		{
			System.out.println(" "+i.getCellNumber());
		}
	}
}