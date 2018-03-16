package com.lxisoft.snakeandladder2.board;
import com.lxisoft.snakeandladder2.board.Cell;
import com.lxisoft.snakeandladder2.game.Player;
import com.lxisoft.snakeandladder2.board.component.Component;
import com.lxisoft.snakeandladder2.board.component.Ladder;
import com.lxisoft.snakeandladder2.board.component.Snake;
import java.util.Scanner;
import java.util.ArrayList;
public class Board{
	public Cell[] cells=new Cell[100];
	ArrayList<Component> components=new ArrayList<Component>();
	
	public void cellInitialisation(int noOfPlayers){
		for(int i=0;i<100;i++)
		{
			cells[i]=new Cell((i+1),noOfPlayers);
			 
		}
	}
	public void setComponents(Component... addComponents) {  //varArg
		for(Component addComponent:addComponents)
		{
		
			components.add(addComponent);
		}
	}
	public ArrayList<Component> getComponents()
	{
		
		return components;
		
		
	}
	
	public void setCells(Cell[] cells)
	{
		this.cells=cells;
	}
	public Cell[] getCells()
	{
		
		return cells;
	}
	public void setCell(Cell cell,int cellNumber)
	{
		for(Cell tempCell:cells)
		{
			if(cell.getNumber()==cellNumber)
			{
				tempCell=cell;
			}
		}
	}
	public Cell getCell(int cellNumber)//
	{
		return cells[cellNumber-1];
	}
	
	
	public void displayCells()
	{
		int number=100;
		for(int i=0;i<10;i++)
		{
			int value=number;
			if(number%2==0)
			{
				outerLoop:
				for(number=value;number>=(value-9);number--)
				{
					if(displaySpecialCells(cells[number-1])==true)
					{
						cells[(number-1)].displayCell();
					}
					cells[(number-1)].displayPlayers();
					if(number==(value-9))
					{
						break outerLoop;
					}
					
				}
				number=number-10;
				System.out.println("\n");
				
				
			}
			else
			{
				outerLoop1:
				for(number=value;number<=(value+9);number++)
				{
					if(displaySpecialCells(cells[number-1])==true)
					{
						cells[(number-1)].displayCell();
					}
					cells[(number-1)].displayPlayers();
					if(number==(value+9))
					{
						break outerLoop1;
					}
					
				}
				number=number-10;
				System.out.println("\n");
				
			}
		}
	}
	
	public boolean displaySpecialCells(Cell cell){
		
		boolean result=true;
		for(Component tempComponent:components)
		{
			if(tempComponent.getStart()==cell)
			{
				result=false;
				if(tempComponent instanceof Snake)
				{
					System.out.print("{S"+tempComponent.getId()+"}");
					
				}
				else
				{
					System.out.print("<l"+tempComponent.getId()+">");
				}
			}
			else if(tempComponent.getEnd()==cell)
			{
				result=false;
				if(tempComponent instanceof Snake)
				{
					System.out.print("{s"+tempComponent.getId()+"}");
					
				}
				else
				{
					System.out.print("<L"+tempComponent.getId()+">");
				}
				
			}
		
		}
		return result;
		
		
	}
	

	
}



































































































































































