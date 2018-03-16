import java.util.*;
public class LadderController
{
	private ArrayList<Ladder> ladder=new ArrayList<Ladder>();
	public void createLadder(Board brd)throws Exception
	{
		for(int i=0;i<7;i++)
		{
			Ladder ladd=new Ladder();
			ladder.add(ladd);
		}
		ladder.get(0).setClimbStartPosition(3);
		ladder.get(0).setClimbEndPosition(13);
		ladder.get(1).setClimbStartPosition(9);
		ladder.get(1).setClimbEndPosition(33);
		ladder.get(2).setClimbStartPosition(35);
		ladder.get(2).setClimbEndPosition(46);
		ladder.get(3).setClimbStartPosition(47);
		ladder.get(3).setClimbEndPosition(70);
		ladder.get(4).setClimbStartPosition(51);
		ladder.get(4).setClimbEndPosition(76);
		ladder.get(5).setClimbStartPosition(68);
		ladder.get(5).setClimbEndPosition(86);
		ladder.get(6).setClimbStartPosition(73);
		ladder.get(6).setClimbEndPosition(95);
		ladder.get(0).setLadderName("L0");
		ladder.get(1).setLadderName("L1");
		ladder.get(2).setLadderName("L2");
		ladder.get(3).setLadderName("L3");
		ladder.get(4).setLadderName("L4");
		ladder.get(5).setLadderName("L5");
		ladder.get(6).setLadderName("L6");
		
		brd.setLadder(ladder);
	}
	public void climb()
	{
		
	}
}