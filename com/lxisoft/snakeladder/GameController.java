import java.util.*;
public class GameController
{
	private Game game=new Game();
	private BoardController boardController=new BoardController();
	private PlayerController playerController=new PlayerController();
	private Cell cell=new Cell();
	ArrayList<Player> players=new ArrayList<Player>();
	private ArrayList<Player> winners=new ArrayList<Player>();
	Scanner scan = new Scanner(System.in);
	public void createGame()throws Exception
	{
		boardController.createBoard();
		boardController.displayBoard(game);
	}
	public void playGame()throws Exception
	{
		playerController.createPlayer(game);
		
		int rank=1;
		int winnerCount=0;
		players=game.getPlayer();
		
		while(true)
		{
			int len=players.size();
			for(int i=0;i<len;i++)
			{
				if(players.get(i).isWon()==false)
				{
				while(true)
				{
					System.out.println("Enter 1 to throw die Player "+(i+1));
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
							}
							break;
						}
						else
						{
							int current=players.get(i).getCurrentPosition();
							current+=random;
							if(current<=100)
							{
								players.get(i).setCurrentPosition((players.get(i).getCurrentPosition())+random);
							}
							if(random==6)
							{
								continue;
							}
							break;
						}					
					}
				}
				//System.out.println(players.get(i).getCurrentPosition());
				boardController.displayBoard(game);
				}
				for(Player p:players)
				{
					if(p.getCurrentPosition()==100)
					{
						p.setWon(true);
						if(p.getPlayerRank()==0)
						{
							p.setPlayerRank(rank);
							rank++;
							winnerCount++;
						}
					}
				}
			}
			if(players.size()==winnerCount)
			{
				break;
			}
			
		}
	}
	public void displayWinner()
	{
		players=game.getPlayer();
		for(Player p:players)
		{
			System.out.println(p.getPlayerName()+" finished as Rank "+p.getPlayerRank());
		}
	}
}