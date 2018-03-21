package com.lxisoft.snakeandladder.test;
import com.lxisoft.snakeandladder.controller.GameController;

public class Tdd{	
	
	/*	cd notepad-workspace\LXI\Snake-and-Ladder		
									
		javac com\lxisoft\snakeandladder\test\Tdd.java

		java com.lxisoft.snakeandladder.test.Tdd	*/
	
	public static void main(String[] args){
		
		GameController gameController =  new GameController();
		
		gameController.createSnakes();
		gameController.createLadders();
		gameController.createCells();
		gameController.createBoard();
		gameController.createPieces();
		gameController.createPlayers();
		gameController.createDice();
		gameController.createGame();
		gameController.displayBoard();
		try{
			gameController.play();	
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
		
	}
	
}