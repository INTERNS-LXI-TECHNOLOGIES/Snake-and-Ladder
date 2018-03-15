package com.lxisoft.snakeandladder3.board.component;
import com.lxisoft.snakeandladder3.game.Player; 
import com.lxisoft.snakeandladder3.board.Cell; 
public class Ladder extends Component{
public Ladder(int id,Cell start,Cell end)
	{
		
		
		setID(id);
		setStart(start);
		setEnd(end); 
	}
public void climp(Player player)
	{
		
		
		getEnd().setPlayer(player);
		System.out.print("///  player "+player.getID()+" climbing to cell "+getEnd().getNumber()+" through  ladder "+getID()+"     //");
		try
		{
			Thread.sleep(3000); 
		}catch(Exception e){}
	}
}