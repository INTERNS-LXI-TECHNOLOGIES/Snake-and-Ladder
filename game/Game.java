
package com.lxi.snakeandladder.game;
import com.lxi.snakeandladder.board.Cell;
import com.lxi.snakeandladder.board.Board;
import com.lxi.snakeandladder.player.Player;
import java.util.Scanner;
public class Game
{
Board board = new Board();
Player player[] = new Player[2];
int diceThrow;
int diceNumber;


Scanner scan = new Scanner(System.in);


public void playGame()
{
	
	for(int i=0;i<2;i++)
	{
		player[i] = new Player();
	}
	
	
	int playerSelection=0;
while(player[0].getCellNumber()<100&&player[1].getCellNumber()<100)
{
    board.getBoard();
	System.out.println("Player "+(playerSelection+1)+" chance");
    System.out.println("Enter 1 to throw the dice:  ");
    diceThrow = scan.nextInt();
	diceNumber=getDiceValue();
    System.out.print("you got "+diceNumber);

    if(diceNumber==1&&player[playerSelection].getCellNumber()==0)
     {
	   System.out.print("Entered into the Game:");
	   
	   Cell[][] cells=board.cells;
	   
	  cells[0][0].setPlayer(player[0]);
	  
     }
	 else
	 {
		 board.cells[0][0].setPlayer(player[0]);
	 }
	 playerSelection=(playerSelection+1)%2;
}
}
    public int getDiceValue()
    {
	   return (int) ((Math.random()*6)+1);
    }


}
