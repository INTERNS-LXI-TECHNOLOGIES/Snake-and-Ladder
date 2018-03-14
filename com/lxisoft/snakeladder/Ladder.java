import java.util.*;
public class Ladder
{
	private int climbStartPosition;
	private int climbEndPosition;
	
	public void setClimbStartPosition(int climbStart)
	{
		this.climbStartPosition=climbStart;
	}
	public int getDropStartPosition()
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
}