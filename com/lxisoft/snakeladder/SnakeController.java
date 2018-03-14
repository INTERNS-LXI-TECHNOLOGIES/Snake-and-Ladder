import java.util.*;
public class SnakeController
{
	private AraayList<Snake> snake=new ArrayList<Snake>();
	public void createSnake(Board bd)throws Exception
	{
		for(int i=0;i<7;i++)
		{
			Snake snak=new Snake();
			snake.add(snak);
		}
		snake.get(0).setDropStartPosition(19);
		snake.get(0).setDropEndPosition(4);
		snake.get(1).setDropStartPosition(31);
		snake.get(1).setDropEndPosition(8);
		snake.get(2).setDropStartPosition(55);
		snake.get(2).setDropEndPosition(15);
		snake.get(3).setDropStartPosition(68);
		snake.get(3).setDropEndPosition(11);
		snake.get(4).setDropStartPosition(81);
		snake.get(4).setDropEndPosition(67);
		snake.get(5).setDropStartPosition(93);
		snake.get(5).setDropEndPosition(71);
		snake.get(6).setDropStartPosition(99);
		snake.get(6).setDropEndPosition(58);
		bd.setSnake(snake);
	}
	public void swallow()
	{
		
	}
}