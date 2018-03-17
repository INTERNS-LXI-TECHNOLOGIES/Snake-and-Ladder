import java.util.*;
public class TDD
{
	public static void main(String[] args)throws Exception
	{
		GameController gameController=new GameController();
		gameController.createGame();
		gameController.playGame();
	}
}