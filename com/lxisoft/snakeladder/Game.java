import java.util.*;
public class Game
{
	private Board board;
	private ArrayList<Player> player=new ArrayList<Player>();
	private Die die;
	
	public void setBoard(Board br)
	{
		this.board=br;
	}
	public Board getBoard()
	{
		return this.board;
	}
	public void setPlayer(ArrayList<Player> plr)
	{
		this.player=plr;
	}
	public ArrayList<Player> getPlayer()
	{
		return this.player;
	}
	public void setDie(Die di)
	{
		this.die=di;
	}
	public Die getDie()
	{
		return this.die;
	}
	
	
}