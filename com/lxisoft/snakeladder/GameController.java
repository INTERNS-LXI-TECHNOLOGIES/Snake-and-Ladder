import java.util.*;
public class GameController
{
	public void createGame()throws Exception
	{
		BoardController boardController=new BoardController();
		boardController.createBoard();
	}
}