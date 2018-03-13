public class LadderController
{
	ArrayList<Ladder> ladder=new ArrayList<Ladder>();
	public void createLadder()
	{
		for(int i=0;i<7;i++)
		{
			Ladder ladd=new Ladder();
			ladder.add(ladd);
		}
		ladder[0].setClimbStartPosition(3);
		ladder[0].setClimbEndPosition(13);
		ladder[1].setClimbStartPosition(9);
		ladder[1].setClimbEndPosition(33);
		ladder[2].setClimbStartPosition(35);
		ladder[2].setClimbEndPosition(46);
		ladder[3].setClimbStartPosition(47);
		ladder[3].setClimbEndPosition(70);
		ladder[4].setClimbStartPosition(51);
		ladder[4].setClimbEndPosition(76);
		ladder[5].setClimbStartPosition(68);
		ladder[5].setClimbEndPosition(86);
		ladder[6].setClimbStartPosition(73);
		ladder[6].setClimbEndPosition(95);
	}
	public void climb()
	{
		
	}
}