import java.util.*;
public class Snake
{
	private int dropStartPosition;
	private int dropEndPosition;
	private String snakeName;
	
	public void setDropStartPosition(int dropStart)
	{
		this.dropStartPosition=dropStart;
	}
	public int getDropStartPosition()
	{
		return this.dropStartPosition;
	}
	
	public void setDropEndPosition(int dropEnd)
	{
		this.dropEndPosition=dropEnd;
	}
	public int getDropEndPosition()
	{
		return this.dropEndPosition;
	}
	
	public void setSnakeName(String nam)
	{
		this.snakeName=nam;
	}
	public String getSnakeName()
	{
		return this.snakeName;
	}
}