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


	public int move(int number){ 
		if(position+number>100){ //check if player crossed 100
			return 0;
		} else{
			this.position=position+number;
			return position;
		}	
	}
	
}