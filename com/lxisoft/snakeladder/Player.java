import java.util.*;
public class Player
{
	private int currentPosition=0;
	private String playerName;
	private boolean won;
	private int playerRank;
	
	public void setCurrentPosition(int currentPos)
	{
		this.currentPosition=currentPos;
	}
	public  int getCurrentPosition()
	{
		return this.currentPosition;
	}
	public void setPlayerName(String name)
	{
		this.playerName=name;
	}
	public String getPlayerName()
	{
		return this.playerName;
	}
	public void setWon(boolean pWon)
	{
		this.won=pWon;
	}
	public boolean isWon()
	{
		return this.won;
	}
	public void setPlayerRank(int pRank)
	{
		this.playerRank=pRank;
	}
	public int getPlayerRank()
	{
		return this.playerRank;
	}
	
}