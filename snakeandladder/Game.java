/**
Snake And Ladder
**/
package com.lxisoft.snakeandladder2.snakeandladder;
import java.util.*;
public class Game
{
String name;
int playerId=0;

Player player[]=new Player[5];
SnakeNLadder s=new SnakeNLadder();
Scanner scan=new Scanner(System.in);

public void gameImpliment()
{
	 int chance;
	 int diceValue;
	for(int i=0;i<2;i++)
	{
		player[i]=new Player();
		//player[i].setId(i+1);
	}
        s.startGame();
		boolean isToRepeate;
	
		for(int i=0;i<2;i++){
		System.out.println("ENTER THE PLAYER "+(i+1)+" NAME :");
		name=scan.next();
		player[i].setName(name);
		}
		do{
		System.out.println("player "  +(playerId+1)+  " chance");
		System.out.print("press 0 to throw the dice: ");
		chance=scan.nextInt();
	if(chance !=0)
		{
			break;
		}
	do{
		diceValue=(int)(Math.random()*6)+1;
		System.out.println("DiceValue is: "+diceValue);
		isToRepeate=updatePosition(diceValue,playerId);
		
	  }while(isToRepeate==true);
		System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.  "+player[playerId].getPosition());
		System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.  "+player[playerId].getName());
		if(player[playerId].getPosition()==100){
			System.out.println("won the match");
			break;
		}
		playerId= (playerId+1)%2;
	  }while(player[playerId].getPosition()!=100);
}
	
	public boolean isWin(int playerId)
	{
		if(player[playerId].getPosition()==100)
		{
			return false;
		}
			return true;
	}
	
	
	public boolean updatePosition(int diceValue,int playerId)
	{
		
		if(diceValue==1&&player[playerId].getPosition()==0)
		{
			player[playerId].setPosition(1);
			System.out.println("PLAYER ENTERED INTO THE GAME ");
			
		}
		else if(player[playerId].getPosition()>0&&player[playerId].getPosition()+diceValue<=100)
		{
			player[playerId].setPosition(player[playerId].getPosition()+diceValue);
		}
		if(diceValue==6||diceValue==1)
		{
			return true;
		}
		return false;
	}
}