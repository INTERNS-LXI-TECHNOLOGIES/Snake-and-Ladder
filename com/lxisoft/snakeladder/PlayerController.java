import java.util.*;
public class PlayerController
{
	private ArrayList<Player> players=new ArrayList<Player>();
	Scanner scan=new Scanner(System.in);
	public void createPlayer(Game gm)
	{
		System.out.println("Enter Number of Palyers");
		int noOfPlayers=scan.nextInt();
		for(int i=0;i<noOfPlayers;i++)
		{
			Player p=new Player();
			players.add(p);
		}
		gm.setPlayer(players);
	}
	public void throwDie()
	{
		
	}
	public void moveForward()
	{
	
	}
}