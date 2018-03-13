public class BoardController
{
	ArrayList<Cell> cell=new ArrayList<Cell>();
	Board board=new Board();
	SnakeController snakeController=new SnakeController();
	LadderController ladderController=new LadderController();
	public void createBoard()
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
}