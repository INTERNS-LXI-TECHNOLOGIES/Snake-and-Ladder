package com.lxisoft.snakeandladder3.game ;
import com.lxisoft.test.ScreenCleaner;
import java.io.IOException;
import com.lxisoft.snakeandladder3.board.Cell;
import com.lxisoft.snakeandladder3.board.Board;
import com.lxisoft.snakeandladder3.board.component.*;
import java.util.Scanner;
import java.util.ArrayList;
import  com.lxisoft.snakeandladder3.game.Player;
public class Game{
Scanner scan=new Scanner(System.in);
private Player []players;
Board board=new Board();
private ArrayList<Player>winners=new ArrayList<Player>();
public void initialization()
	{
		System.out.print("[] Enter Number of players:");
		int noOfPlayers=scan.nextInt();
		players=new Player[noOfPlayers];
		for(int x=0;x<noOfPlayers;x++)
		{
			System.out.print("Enter the player "+(x+1)+" name:");
			String name=scan.next();
			players[x]=new Player((x+1),name);
		}
		Cell []cells=new Cell[100];
		for(int i=0;i<100;i++)
		{
			cells[i]=new Cell(i+1,noOfPlayers);
		}
		board.setCells(cells);
		
		Snake snake1=new Snake(1,cells[97],cells[60]);
		Snake snake2=new Snake(2,cells[50],cells[25]);
		Snake snake3=new Snake(3,cells[35],cells[18]);
		Snake snake4=new Snake(4,cells[75],cells[11]);
		Ladder ladder1=new Ladder(1,cells[3],cells[20]);
		Ladder ladder2=new Ladder(2,cells[10],cells[27]);
		Ladder ladder3=new Ladder(3,cells[66],cells[89]);
		Ladder ladder4=new Ladder(4,cells[33],cells[56]);
		board.setComponents(snake1,snake2,snake3,snake4,ladder1,ladder2,ladder3,ladder4);
		gameLaunch();
	}
public void gameLaunch()
	{
		board.displayCells();
 		Cell[] cells=board.getCells();
		int noOfPlayers=players.length;
		whileLoop:
			do
			{
				for(int i=0;i<noOfPlayers;i++)
				{
					if(players[i]!=null)
					{
						int diceNumber;
						do
						{ 
						
						
						
							System.out.println("player "+players[i].getID()+" "+players[i].getName()+"s  chance"+"\n"+"=============================");
							//diceNumber=rollDice();
							//System.out.println("you got "+diceNumber);
							System.out.print("[] 1 to continuen :");
							diceNumber=scan.nextInt();
							if(searchPlayerCell(players[i])!=null)
							{
									
								movePlayer(players[i],diceNumber);
							}
							else
							{ 
								if(diceNumber==1)
								{
									
									Player []tempPlayers=cells[0].getPlayers();
									outerLoop3:
									for(int y=0;y<players.length;y++)
									{
										if(tempPlayers[y]==null)
										{
											tempPlayers[y]=players[i];
											break;
										}
									}
									cells[0].setPlayers(tempPlayers);
		
								}
							} 
							if(diceNumber==1 || diceNumber==6)
							{
								System.out.println("[] you have another chance []");
							}
							cls();
							board.displayCells();
							if(resultCheck(players[i],noOfPlayers)==true)
							{
								break whileLoop;
							}
						}while(diceNumber==1 || diceNumber==6);	
					}
				}
				
			}while(winners.size()!=noOfPlayers-1);

	}
public boolean resultCheck(Player player,int noOfPlayers)
	{
		boolean result=false;
		int count=0;
		Cell [] cells=board.getCells();
		Player []tempPlayers=cells[99].getPlayers();
		for(int y=0;y<players.length;y++)
		{
			if(tempPlayers[y]==player)
			{
				winners.add(player);
				tempPlayers[y]=null;
				for(int j=0;j<players.length;j++)
				{
					if(players[j]==player)
					{
						players[j]=null;
					}
				}
			}
		}
		cells[99].setPlayers(tempPlayers);
		
		if(winners.size()==noOfPlayers)
		{
			 displayResult(noOfPlayers);
			 result=true;
		}
	return result;
	}
public void displayResult(int noOfPlayers)
	{ 
		int count=0;
		for(Player winner:winners)
		{
			count++;
			System.out.println("====================");
			System.out.println("  ["+count+"]"+winner.getName());
			System.out.println("====================");
		}
		Cell [] cells=board.getCells();
		for(int x=99;x>=0;x--)
		{
			for(int i=0;i<noOfPlayers;i++)
			{
				if(cells[x].getPlayers()[i]!=null)
				{	
					count++;
					System.out.println("====================");
					System.out.println("  ["+count+"]"+cells[x].getPlayers()[i].getName());
					System.out.println("====================");
					Player []tempPlayers=cells[x].getPlayers();
					tempPlayers[i]=null;
					cells[x].setPlayers(tempPlayers);
				}
			}
		}
		
	}
public void movePlayer(Player player,int diceNumber)
	{
		Cell[] cells=board.getCells();
		Cell cell=searchPlayerCell(player);   
		int destinationCellNumber=cell.getNumber();
		destinationCellNumber=destinationCellNumber+diceNumber;
		if(destinationCellNumber<=100)
		{
			Cell destinationCell=null;
			for(int y=cell.getNumber();y<destinationCellNumber;y++)
			{
				destinationCell=cells[(cell.getNumber())];
				outerLoop1:
				for(int i=0;i<players.length;i++)
				{
					Player []tempPlayer=destinationCell.getPlayers();
					if(tempPlayer[i]==null)
					{
						tempPlayer[i]=player;
						break outerLoop1; 
					}
				}
				outerLoop2:
				for(int i=0;i<players.length;i++)
				{
					if(cells[(cell.getNumber()-1)].getPlayers()[i]==player)
					{
						Player []tempPlayers=cells[(cell.getNumber()-1)].getPlayers();
						tempPlayers[i]=null;
						cells[(cell.getNumber()-1)].setPlayers(tempPlayers);
						board.setCells(cells);
						cell=cells[(destinationCell.getNumber()-1)];
						break outerLoop2;
					}
				}
				try
				{
					Thread.sleep(500);
				}catch(Exception e){}
				cls();
				board.displayCells();
				
			}
		specialMoves(destinationCell,player);
		}
		
	}
public void specialMoves(Cell startCell,Player player)
	{  
		for(Component tempComponent:board.getComponents())
		{
			if(tempComponent.getStart()==startCell && tempComponent instanceof Snake)
			{
				((Snake)tempComponent).swallow(player);
				Cell tempCell=board.getCell(startCell.getNumber());
				outerLoop3:
				for(int i=0;i<players.length;i++)
				{
					if(tempCell.getPlayers()[i]==player)
					{
						Player []tempPlayers=tempCell.getPlayers();
						tempPlayers[i]=null;
						tempCell.setPlayers(tempPlayers);
						board.setCell(tempCell,tempCell.getNumber());
						break outerLoop3;
					}
				}
			}
			else if(tempComponent.getStart()==startCell && tempComponent instanceof Ladder)
			{
				((Ladder)tempComponent).climp(player);
				Cell tempCell=board.getCell(startCell.getNumber());
				outerLoop3:
				for(int i=0;i<players.length;i++)
				{
					if(tempCell.getPlayers()[i]==player)
					{
						Player []tempPlayers=tempCell.getPlayers();
						tempPlayers[i]=null;
						tempCell.setPlayers(tempPlayers);
						board.setCell(tempCell,tempCell.getNumber());
						break outerLoop3;
					}
				}
				
			}
		}
	}
public  Cell searchPlayerCell(Player player)
	{
		Cell playerCell=null;
		outerLoop:
		for(Cell tempCell:board.getCells())
		{
			for(int i=0;i<players.length;i++)
			{
				if(tempCell.getPlayers()[i]!=null)
				{	
					if(tempCell.getPlayers()[i].getID()==player.getID())
					{
						playerCell =tempCell;
						break outerLoop;
					}
				}
			}
		}
		return playerCell;
			
	}
public int rollDice()
	{
	
		return ((int)(Math.random()*6)+1);
	}
public void cls()
	{
		ScreenCleaner cls=new ScreenCleaner();
		try
		{
			cls.cls();
		}
		catch(IOException e)
		{
			
		}
		catch(InterruptedException e)
		{
			
		}
		 System.out.println("                                                                                                      ");
	}
}