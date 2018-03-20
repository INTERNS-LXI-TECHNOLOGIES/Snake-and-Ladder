package com.lxisoft.snakeandladder.model;
import java.util.concurrent.ThreadLocalRandom;

public class Dice{
	
	private int number;
	
	//Getters and Setters
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number=number;
	}
	
	//Generate Random Number
	public int generateRandomNumber(){ 
		number = ThreadLocalRandom.current().nextInt(1,7); //(lower limit, upper limit + 1)
		return number;
	}
	
}