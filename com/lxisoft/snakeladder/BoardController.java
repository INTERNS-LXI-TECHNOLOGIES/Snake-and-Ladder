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
	public void displayBoard(Game gm)
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
					c.setHasSnakeHead(true);
				}
				if(s.getDropEndPosition()==c.getCellNumber())
				{
					c.setHasSnakeTale(true);
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
					c.setHasLadderStart(true);
				}
				if(l.getClimbEndPosition()==c.getCellNumber())
				{
					c.setHasLadderEnd(true);
				}
			}
		}
		int lad=6;
		int sna=6;
		ArrayList<Player> players=new ArrayList<Player>();
		players=gm.getPlayer();
		int index=99;
		for(int j=0;j<10;j++)
		{
			for(int i=0;i<10;i++)
			{
				System.out.print(cells.get(index).getCellNumber());
				
				if(cells.get(index).getHasLadderStart()==true)
				{
					System.out.print("LD");
					lad--;
					for(Player p:players)
					{
						if(p.getCurrentPosition()==cells.get(index).getCellNumber())
						{
							for(Ladder l:ladders)
							{
								if(p.getCurrentPosition()==l.getClimbStartPosition())
								{
									p.setCurrentPosition(l.getClimbEndPosition());
								}
							}
							
						}
						
					}
					
				}
				if(cells.get(index).getHasLadderEnd()==true)
				{
					System.out.print("ld");
				}
				if(cells.get(index).getHasSnakeHead()==true)
				{
					System.out.print("SN");
					sna--;
					for(Player p:players)
					{
						if(p.getCurrentPosition()==cells.get(index).getCellNumber())
						{
							for(Snake s:snakes)
							{
								if(p.getCurrentPosition()==s.getDropStartPosition())
								{
									p.setCurrentPosition(s.getDropEndPosition());
								}
							}
							
						}
						
					}
				}
				if(cells.get(index).getHasSnakeTale()==true)
				{
					System.out.print("sn");
				}
				for(Player p:players)
				{
					if(p.getCurrentPosition()==cells.get(index).getCellNumber())
					{
						System.out.print(p.getPlayerName());
					}
				}
				System.out.print("	");
				index--;
			}
			System.out.println("\n");
		}
		
	}
}