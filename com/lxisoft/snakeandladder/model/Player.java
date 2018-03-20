package com.lxisoft.snakeandladder.model;
import com.lxisoft.snakeandladder.model.Piece;

public class Player{
	
	private Piece piece;
	
	//Constructor
	public Player(Piece piece){
		this.piece=piece;
	}
	
	//Getters and Setters
	public Piece getPiece(){
		return piece;
	}
	public void setPiece(Piece piece){
		this.piece=piece;
	}
	
	public int toss(Dice dice){
		int number = dice.generateRandomNumber();
		return number;
	}
}