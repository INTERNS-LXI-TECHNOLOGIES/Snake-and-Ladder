import java.util.*;
public class Ladder
{
	private int climbStartPosition;
	private int climbEndPosition;
	private String ladderName;
	
	public void setClimbStartPosition(int climbStart)
	{
		this.climbStartPosition=climbStart;
	}
	public int getClimbStartPosition()
	{
		return this.climbStartPosition;
	}
	
	public void setClimbEndPosition(int climbEnd)
	{
		this.climbEndPosition=climbEnd;
	}
	public int getClimbEndPosition()
	{
		return this.climbEndPosition;
	}
	
	public void setLadderName(String nam)
	{
		this.ladderName=nam;
	}
	public String getLadderName()
	{
		return this.ladderName;
	}
}