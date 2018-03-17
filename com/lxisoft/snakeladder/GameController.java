import java.util.*;
public class GameController
{
	private Game game=new Game();
	private BoardController boardController=new BoardController();
	private PlayerController playerController=new PlayerController();
	public void createGame()throws Exception
	{
		boardController.createBoard();
		boardController.displayBoard();
	}
	public void playGame()throws Exception
	{
		playerController.createPlayer(game);
	}
}