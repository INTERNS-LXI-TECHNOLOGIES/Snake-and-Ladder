package com.lxisoft.snakeandladder.model;

public class Piece{
	
	private int position;
	
	//Constructor 
	public Piece(int position){
		this.position=position;
	}
	
	//Getters and Setters
	public int getPosition(){
		return position;
	}
	public void setPosition(int position){
		this.position=position;
	}


	public int move(int number){ //code later
		this.position=position+number;
		return position;
	}
	
}