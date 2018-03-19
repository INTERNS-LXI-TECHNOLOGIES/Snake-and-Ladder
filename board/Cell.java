package com.lxi.snakeandladder.board;
import com.lxi.snakeandladder.player.Player;
public class Cell
{
	
 public int cellNo=0;
  
  private Player player;

    public void setPlayer(Player player )
     {
       this.player = player;
     } 
	public Player getPlayer()
      {
	     return player;
	  }	
}