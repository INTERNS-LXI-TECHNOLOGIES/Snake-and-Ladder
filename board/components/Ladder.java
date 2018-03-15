package com.lxisoft.snakeandladderv3.board.components;
import com.lxisoft.snakeandladderv3.board.Cell;
import com.lxisoft.snakeandladderv3.game.Player;
public class Ladder extends Component{
	
	public void climb(Player player){
		
		getEnd().setPlayer(player);
		System.out.println("climbed from "+getStart().getNumber()+" to"+getEnd().getNumber());
		try{
				Thread.sleep(1000);
				}
				catch (Exception e){}
		
	}
	
	public Ladder(int id,Cell startCell,Cell endCell)
	{
		setId(id);
		setStart(startCell);
		setEnd(endCell);
	
	}
	
	
}