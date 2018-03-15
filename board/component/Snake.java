package com.lxisoft.snakeandladder3.board.component;
import com.lxisoft.snakeandladder3.game.Player; 
import com.lxisoft.snakeandladder3.board.Cell; 
public class Snake extends Component{
public Snake(int id,Cell start,Cell end)
	{
		setID(id);
		setStart(start);
		setEnd(end); 
	}
public void swallow(Player player)
	{
		getEnd().setPlayer(player);
		System.out.print("//     snake "+getID()+" swallowing player "+player.getID()+" to cell "+getEnd().getNumber()+"     //");
		try
		{
			Thread.sleep(3000);
		}catch(Exception e){}
		
 	}
}


