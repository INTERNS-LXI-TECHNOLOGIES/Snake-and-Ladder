public class SnakeController
{
	ArrayList<Snake> snake=new ArrayList<Snake>();
	public void createSnake(Board board)
	{
		for(int i=0;i<7;i++)
		{
			Snake snak=new Snake();
			snake.add(snak);
		}
		snake[0].setDropStartPosition(19);
		snake[0].setDropEndPosition(4);
		snake[1].setDropStartPosition(31);
		snake[1].setDropEndPosition(8);
		snake[2].setDropStartPosition(55);
		snake[2].setDropEndPosition(15);
		snake[3].setDropStartPosition(68);
		snake[3].setDropEndPosition(11);
		snake[4].setDropStartPosition(81);
		snake[4].setDropEndPosition(67);
		snake[5].setDropStartPosition(93);
		snake[5].setDropEndPosition(71);
		snake[6].setDropStartPosition(99);
		snake[6].setDropEndPosition(58);
	}
	public void swallow()
	{
		
	}
}