package com.lxisoft.snakeandladder2;
import java.util.*;
public class Dies
{
	Scanner scan=new Scanner(System.in);
	private int value;
	private Player players=new Player();
	
	public void setDiesValue(int value)
	{
		this.value=value;
	}
	public int getDiesValue()
	{
		return value;
	}
	 public void throwDies()
	{
		int a;
		a=0;
		do
		{
			value=(int)(Math.random()*6)+1;
			System.out.println("throw dies "+value);
			if(players.getStatus()==false)
			{
			if(value==1)
			{
				System.out.println("game started..!!");
				players.setPosition(value);
				players.setStatus(true);
			}
			}
			else
			{
				players.setPosition(players.getPosition()+value);
				System.out.println(players.getPosition()+value);
				
				if(players.getPosition()+value==100)
				{
					System.out.println("WiN");
				}
			}
			//System.out.println("Again throw dies 1.Yes 0.No ");
			//a=scan.nextInt();
		}while(a==1);
	}
}
