package com.lxisoft.snakeandladderv3.board.components;
import com.lxisoft.snakeandladderv3.board.Cell;
import com.lxisoft.snakeandladderv3.game.Player;
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
				Thread.sleep(1000);
				}
				catch (Exception e){}
		
	}

}