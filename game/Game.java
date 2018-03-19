package com.lxisoft.snakeandladderv3.game;
import com.lxisoft.snakeandladderv3.board.Board;
import com.lxisoft.snakeandladderv3.board.Cell;
import com.lxisoft.snakeandladderv3.game.Player;
import com.lxisoft.snakeandladderv3.board.components.Component;
import com.lxisoft.snakeandladderv3.board.components.Ladder;
import com.lxisoft.snakeandladderv3.board.components.Snake;
import com.lxisoft.clearscreen.Cls;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Game{
	
	Board board=new Board();
	ArrayList<Player> winners=new ArrayList<Player>();
	Player[] players;
	Scanner scan=new Scanner(System.in);
	public void initialization()
	{
		
		setPlayer();
		board.cellInitialisation(players.length);
		Cell []cells=board.cells;
		Snake snake1=new Snake(1,cells[36],cells[17]);
		Snake snake2=new Snake(2,cells[55],cells[34]);
		Snake snake3=new Snake(3,cells[65],cells[41]);
		Snake snake4=new Snake(4,cells[82],cells[66]);
		board.setComponents(snake1,snake2,snake3,snake4);
		Ladder ladder1=new Ladder(1,cells[18],cells[39]);
		Ladder ladder2=new Ladder(2,cells[43],cells[58]);
		Ladder ladder3=new Ladder(3,cells[61],cells[74]);
		Ladder ladder4=new Ladder(4,cells[76],cells[92]);
		board.setComponents(ladder1,ladder2,ladder3,ladder4);
		
		
		startGame();
	}
	public void setPlayer()
	{
		System.out.println("Enter the no of players:");
		int noOfPlayers=scan.nextInt();
		players=new Player[noOfPlayers];
		for(int i=0;i<noOfPlayers;i++)
		{
			
			players[i]=new Player((i+1));
			
		}
	}
	public void startGame()
	{
		System.out.println("=================================================================");
		System.out.println("                  ----SNAKE & LADDER----");
		System.out.println("=================================================================");
		board.displayCells();
		
		playerDetails();
		int x=0;
		int diceNumber;
		int ch;
		Cell []cells=board.cells;
		whileloop:
		do
		{
			for(int i=0;i<players.length;i++)
			{
				
				do{
					diceNumber=0;
					if(players[i]!=null){
				
						System.out.println(players[i].getName()+" throws the dice");
						ch=scan.nextInt();
						
						diceNumber=diceNumberGeneration();
						System.out.println("you got "+diceNumber);
						
						
						try{
							Thread.sleep(1000);
						}
							catch (Exception e){}
						
						Cell filledCell=searchPlayer(players[i]);
						if(filledCell!=null)
						{
							move(diceNumber,players[i]);
						}
						else
						{
							if(diceNumber==1)
							{
								Player [] tempPlayers=cells[0].getPlayers();
								for(int f=0;f<players.length;f++)
								{
									if(tempPlayers[f]==null)
									{
										tempPlayers[f]=players[i];
										System.out.println(tempPlayers[f].getName());
										break;
									}
								}
								cells[0].setPlayers(tempPlayers);
							}
						}
						cls();
						
						board.displayCells();
						if(resultCheck(players[i]))
						{
							
							winners.add(players[i]);
							players[i]=null;
							
							if(winners.size()==players.length-1){
								System.out.println("Winners are :");
								rankList();
								break whileloop;
							}
						}
					}
					
				}while(diceNumber==1 || diceNumber==6);
			}
				
			
			
		//}
		//while(x==1);
		}	while(winners.size()!=players.length-1);			
		//rankList();
		
	}	
	public boolean resultCheck(Player player)
	{
		boolean result=false;
		for(Player tempPlayer:board.cells[99].getPlayers())
		{
			if(tempPlayer==player)
			{
					result=true;
			}
		}
		return result;
	}
	public void playerDetails()
	{
		for(int i=0;i<players.length;i++)
	
		{
			System.out.println("PLAYER "+(i+1)+"'S NAME: ");
			players[i].setName(scan.next());
		
		}
		System.out.println("THE PLAYERS ARE: ");
		for(int j=0;j<players.length;j++)
		{
			System.out.println((j+1)+" "+players[j].getName());
			
		}


	}
	
	
	public void rankList(){
		for(Player player:winners){
			
			System.out.println(""+player.getName());
		}
		for(int i=0;i<players.length;i++){
			if(players[i]!=null){
				System.out.println(""+players[i].getName());
				break;
			}
			
		}
		
		
		
	}

	public int diceNumberGeneration()
	{
		int diceNumber;
		
		do
		{
				//diceNumber=scan.nextInt();
			diceNumber=(int)((Math.random())*6)+1;
			
		}while(diceNumber==0);
		
		return diceNumber;
		
	}
	
	public void move(int diceNumber,Player player)
	{
		
		Cell []cells=board.cells;
		Cell tempCell=searchPlayer(player);
		int destCellNumber=tempCell.getNumber();
		destCellNumber=destCellNumber+diceNumber;
		if(destCellNumber<=100){
			Cell currentCell=tempCell;
			for(int j=tempCell.getNumber();j<destCellNumber;j++){
				Cell destCell=cells[j];
				
				Player [] tempPlayers=destCell.getPlayers();
				outerLoop2:
				for(int i=0;i<players.length;i++){
					if(tempPlayers[i]==null){
						
						tempPlayers[i]=player;
						destCell.setPlayers(tempPlayers);
						break outerLoop2;
					}
				}
				tempPlayers=currentCell.getPlayers();
				outerLoop3: 
				for(int i=0;i<players.length;i++)
				{
					if(tempPlayers[i]==player)
					{
						tempPlayers[i]=null;
						break outerLoop3;
					}
				}
				currentCell.setPlayers(tempPlayers);
				currentCell=destCell;
				
				try{
				Thread.sleep(500);
				}
				catch (Exception e){}
				cls();
				board.displayCells();
			}
			specialMove(cells[destCellNumber-1],player);
		}	
			
	}
		
	public Cell searchPlayer(Player tempPlayer)
	{
		
		Cell playerCell=null;
		for(Cell tempCell:board.cells){
			for(int i=0;i<players.length;i++){
				if(tempCell.getPlayers()[i]==tempPlayer){
					playerCell=tempCell;
				}
			}
		}
		return playerCell;
	}
	
	
	public void specialMove(Cell specialCell,Player player)
	{
		
		for(Component tempcomponent:board.getComponents())
		{
			if(tempcomponent.getStart()==specialCell && tempcomponent instanceof Snake)
			{
				
				((Snake)tempcomponent).swallow(player);
				//System.out.println("swallowed from "+tempcomponent.getStart().getNumber()+" to"+tempcomponent.getEnd().getNumber());
				Cell tempCell=board.getCells()[(specialCell.getNumber()-1)];
				outerLoop4:
				for(int i=0;i<players.length;i++)
				{
					if(tempCell.getPlayers()[i]==player)
					{
						Player[] tempPlayers=tempCell.getPlayers();
						tempPlayers[i]=null;
						tempCell.setPlayers(tempPlayers);
						board.setCell(tempCell,tempCell.getNumber());
						break outerLoop4;
						
						
					}
						
				}
			}
			else if(tempcomponent.getStart()==specialCell && tempcomponent instanceof Ladder)
			{
				
				((Ladder)tempcomponent).climb(player);
				//System.out.println("climbed from "+tempcomponent.getStart().getNumber()+" to"+tempcomponent.getEnd().getNumber());
				Cell tempCell=board.getCells()[(specialCell.getNumber()-1)];
				outerLoop4:
				for(int i=0;i<players.length;i++)
				{
					if(tempCell.getPlayers()[i]==player)
					{
						Player[] tempPlayers=tempCell.getPlayers();
						tempPlayers[i]=null;
						tempCell.setPlayers(tempPlayers);
						board.setCell(tempCell,tempCell.getNumber());
						break outerLoop4;
						
						
					}	
					
				}
			}
			
			
			
		}
	
	}

	public void cls()
	{
		Cls clrscr=new Cls();
		try
		{
			clrscr.cls();
		}
		catch (IOException e)
		{
			
		}
		catch (InterruptedException e)
		{
			
		}
	}
} 