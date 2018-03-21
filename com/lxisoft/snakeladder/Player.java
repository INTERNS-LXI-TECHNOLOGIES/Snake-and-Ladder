import java.util.*;
public class Player
{
	private int currentPosition=0;
	private String playerName;
	
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
	
}