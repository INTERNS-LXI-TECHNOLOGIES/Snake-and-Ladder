package com.lxi.snakeandladder.game;
import com.lxi.snakeandladder.P
public class Game
{
Board board = new Board();
Player player[] = new player[2];
int diceThrow;
int rotateDice;

(int) ((Math.random()*6)+1);
scanner scan = new Scanner(System.in);


public void playGame()
{
  	 board.getBoard();
 
    System.out.print("Enter 1 to throw the dice: \n ");
    diceThrow = scan.nextInt();
    rotateDice=((Math.random()*6)+1);

   if(rotateDice==1)
   {
	   System.out.print("Entered into the game:");
   }
   
   
}

}
