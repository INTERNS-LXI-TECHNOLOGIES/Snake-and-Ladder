import java.util.*;
public class PlayerController
{
	private ArrayList<Player> players=new ArrayList<Player>();
	DieController dieController = new DieController();
	Scanner scan=new Scanner(System.in);
	int noOfPlayers;
	public void createPlayer(Game gm)
	{
		System.out.println("Enter Number of Palyers");
		noOfPlayers=scan.nextInt();
		for(int i=0;i<noOfPlayers;i++)
		{
			Player p=new Player();
			players.add(p);
		}
		gm.setPlayer(players);
	}
	public int throwDie()
	{
		int rand=dieController.generateRandomNumber();
		return rand;
	}
	public void moveForward()
	{
	
	}
}