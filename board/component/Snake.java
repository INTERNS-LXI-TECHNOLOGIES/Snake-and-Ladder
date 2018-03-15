package com.lxisoft.snakeandladder2.board.component;
import com.lxisoft.snakeandladder2.board.Cell;
import com.lxisoft.snakeandladder2.game.Player;
public class Snake extends Component{
	
	
	public Snake(int id,Cell startCell,Cell endCell)
	{
		setId(id);
		setStart(startCell);
		setEnd(endCell);
	
	}
	
	
	public void swallow(Player player){
		
		getEnd().setPlayer(player);
		System.out.println("swallowed from "+getStart().getNumber()+" to"+getEnd().getNumber());
		try{
					
			Thread.sleep(500);
		}
		catch(Exception e){}
		
		
	}

}