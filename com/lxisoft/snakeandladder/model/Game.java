package com.lxisoft.snakeandladder.model;
import com.lxisoft.snakeandladder.model.*;

public class Game{

	private Board board;
	// private List<Player> playerList;
	private Player player1, player2;
	private Dice dice;
	
	//Constructor
	public Game(Board board, Player player1, Player player2, Dice dice){
		this.board=board;
		this.player1=player1;
		this.player2=player2;
		this.dice=dice;
	}
	
	//Getters and Setters
	public Board getBoard(){
		return board;
	}
	public void setBoard(Board board){
		this.board=board;
	}	
/* 	public List<Player> getPlayerList(){
		return playerList;
	}
	public void setPlayerList(List<Player> playerList){
		this.playerList=playerList;
	} */
	public Player getPlayer1(){
		return player1;
	}
	public void setPlayer1(Player player1){
		this.player1=player1;
	}
	public Player getPlayer2(){
		return player2;
	}
	public void setPlayer2(Player player2){
		this.player2=player2;
	}	
	public Dice getDice(){
		return dice;
	}
	public void setDice(Dice dice){
		this.dice=dice;
	}
}
