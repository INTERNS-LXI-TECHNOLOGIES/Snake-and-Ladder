package com.lxisoft.snakeandladder2.game;
import com.lxisoft.snakeandladder2.board.Board;
import com.lxisoft.snakeandladder2.board.Cell;
import com.lxisoft.snakeandladder2.game.Player;
import com.lxisoft.snakeandladder2.board.component.Component;
import com.lxisoft.snakeandladder2.board.component.Ladder;
import com.lxisoft.snakeandladder2.board.component.Snake;
import com.lxisoft.clearscreen.Cls;
import java.io.IOException;
import java.util.Scanner;
public class Game{
	



	Board board=new Board();
	
	Player[] players=new Player[2];
	Scanner scan=new Scanner(System.in);
	public void initialization()
	{
		
		board.cellInitialisation();
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
		//board.setComponents(snake1);
		
		startGame();
	}
	public void setPlayer()
	{
		for(int i=0;i<2;i++)
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
		setPlayer();
		playerDetails();
		int x=0;
		int diceNumber;
		int ch;
		Cell []cells=board.cells;
		whileLoop:
		do
		{
			for(int i=0;i<2;i++)
			{
				do{
					System.out.println(players[i].getName()+" throws the dice");
					
					diceNumber=diceNumberGeneration();
					
					ch=scan.nextInt();
					displayDiceNumber(diceNumber);
					
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
							for(int f=0;f<2;f++)
							{
								if(tempPlayers[f]==null)
								{
									tempPlayers[f]=players[i];
									System.out.println(tempPlayers[f].getName()+" t111");
									break;
								}
							}
							//System.out.println(playrs[0].getName()+"haiii 222");
							cells[0].setPlayers(tempPlayers);
						}
					}
					cls();
					
					board.displayCells();
					if(board.getCells()[99].getPlayers()[0]==players[i] || board.getCells()[99].getPlayers()[1]==players[i])
					{
						System.out.println("winner is "+players[i].getName());
						break whileLoop;
					}
				}while(diceNumber==1 || diceNumber==6);
				
				
			}
			
		//}
		//while(x==1);
		}while(cells[99].getPlayers()[0]==null && cells[99].getPlayers()[1]==null);
		
				
		
	}	
	
	public void playerDetails()
	{
		for(int i=0;i<2;i++)
	
		{
			System.out.println("PLAYER "+(i+1)+"'S NAME: ");
			players[i].setName(scan.next());
		
		}
		System.out.println("THE PLAYERS ARE: ");
		for(int j=0;j<2;j++)
		{
			System.out.println((j+1)+" "+players[j].getName());
			
		}


	}

	public int diceNumberGeneration()
	{
		int diceNumber;
		
		do
		{
			diceNumber=(int)((Math.random())*6)+1;
			
		}while(diceNumber==0);
		System.out.println("Dice Number: "+diceNumber);
		return diceNumber;
		
	}
	
	
	public void enterGame()
	{
		
		System.out.println("game---");
		
	}
	
	
	public void move(int diceNumber,Player player)
	{
		Cell []cells=board.cells;
		Cell tempCell=searchPlayer(player);
		int destCellNumber=tempCell.getNumber();
		destCellNumber=destCellNumber+diceNumber;
		if(destCellNumber<=100)
		{	
			Cell currentCell=tempCell;
			for(int j=tempCell.getNumber();j<destCellNumber;j++)
			{
				Cell destCell=cells[j];
				Player [] tempPlayers=destCell.getPlayers();
				outerLoop2:
				for(int i=0;i<2;i++){
					if(tempPlayers[i]==null){
						
						tempPlayers[i]=player;
						destCell.setPlayers(tempPlayers);
						//cells[(destCellNumber-1)].setPlayers(tempPlayers);
						break outerLoop2;
					}
				}
				tempPlayers=currentCell.getPlayers();
				outerLoop3:
				for(int i=0;i<2;i++)
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
				catch(Exception e){}
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
			for(int i=0;i<2;i++){
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
				for(int i=0;i<2;i++)
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
				for(int i=0;i<2;i++)
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
	public void displayDiceNumber(int diceNumber)
	{
		System.out.println("Dice Number: "+diceNumber);
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