import java.util.*;
public class GameController
{
	private Game game=new Game();
	private BoardController boardController=new BoardController();
	private PlayerController playerController=new PlayerController();
	private Cell cell=new Cell();
	Scanner scan = new Scanner(System.in);
	public void createGame()throws Exception
	{
		boardController.createBoard();
		boardController.displayBoard();
	}
	public void playGame()throws Exception
	{
		playerController.createPlayer(game);
		ArrayList<Player> players=new ArrayList<Player>();
		players=game.getPlayer();
		int len=players.size();
		while(true)
		{
			int p=1;
			for(int i=0;i<len;i++)
			{
				
				while(true)
				{
					System.out.println("Enter 1 to throw die Player "+p);
					int val=scan.nextInt();
					if(val==1)
					{
						int random=playerController.throwDie();
						System.out.println("-"+random+"-");
						if(players.get(i).getCurrentPosition()==0)
						{
							if(random==1)
							{
								players.get(i).setCurrentPosition((players.get(i).getCurrentPosition())+random);
								break;
							}
						}
						else
						{
							players.get(i).setCurrentPosition((players.get(i).getCurrentPosition())+random);
							if(random==6)
							{
								continue;
							}
							break;
						}
						
					}
				}
				p++;
				System.out.println(players.get(i).getCurrentPosition());
			}
		}
	}
}