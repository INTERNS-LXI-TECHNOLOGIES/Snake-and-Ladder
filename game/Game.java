
package com.lxi.snakeandladder.game;
import com.lxi.snakeandladder.board.Cell;
import com.lxi.snakeandladder.player.Player;
import java.util.Scanner;
public class Game
{
Board board = new Board();
Player player[] = new Player[2];
int diceThrow;
int rotateDice;


Scanner scan = new Scanner(System.in);


public void playGame()
{
	int playerSelection=0;
while(player[0].getCellNumber<100&&player[1].getCellNumber<100)
{
    board.getBoard();
	System.out.println("Player "+(playerSelection+1)+" chance");
    System.out.println("Enter 1 to throw the dice:  ");
    diceThrow = scan.nextInt();
    rotateDice=getDiceValue();
    System.out.print("you got "+rotateDice);

    if(rotateDice==1&&player[playerSelection].getCellNumber()==0)
     {
	   System.out.print("Entered into the Game:");
	   Cell[] cells=board.cells;
	   cells[0].setPlayer(player[0]);
     }
	 else
	 {
		 cells[rotateDice].setPlayer(player[0]);
	 }
	 playerSelection=(playerSelection+1)%2;
}
}
    public int getDiceValue()
    {
	   return (int) ((Math.random()*6)+1);
    }


}
