package com.lxisoft.snakeandladder3.board;
import com.lxisoft.snakeandladder3.board.component.*;
import java.util.ArrayList;
public class Board{
ArrayList<Component>components=new ArrayList<Component>();
private Cell[] cells=new Cell[100];
public void setComponents(Component... newComponents)
	{
		for(Component newComponent:newComponents)
		{
			components.add(newComponent);
		}
	}
public ArrayList<Component> getComponents()
	{
		return components;
	}
public void setCells(Cell [] cells)
	{
		this.cells=cells;
	}
public Cell [] getCells()
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
public Cell getCell(int number)
	{
		return cells[(number-1)];
	}
public void displayCells()
	{
		System.out.println("                          #======================================#");
		System.out.println("                          #           SNAKE & LADDER             #");
		System.out.println("                          #======================================#"+"\n");
		int number=100;
		 for(int i=0;i<10;i++) 
		 {
			 int leftValue=number;
			 if(number%2==0 )
			 {
				 outerLoop1:
				 for(number=leftValue;number>=leftValue-9;number--)
				 {
					 if(specilaCellDisplay(cells[(number-1)]))
					 {
						 cells[(number-1)].displayCell();
						
					 }
					 cells[(number-1)].displayPlayers();
					 if(number==(leftValue-9))
					 {
						break outerLoop1;
					 }
				 }
				 number=number-10;
				  System.out.println("                                                                                                      ");
			 }
			 else
			 {
				 outerLoop2:
				 for(number=leftValue;number<=leftValue+9;number++)
				 {
					 if(specilaCellDisplay(cells[(number-1)]))
					 {
						cells[(number-1)].displayCell();
					 }
					  cells[(number-1)].displayPlayers();
					 if(number==(leftValue+9))
					 {
						 break outerLoop2;
					 }
					  
				 }
				 number=number-10;
				 System.out.println("                                                                                                      ");
			 }
		 }
	}
	public boolean specilaCellDisplay(Cell cell)
		{
			boolean result=true;
			for(Component tempComponent:components)
				{
					if(tempComponent.getStart()==cell)
					{
						result=false;
						if(tempComponent instanceof Snake)
						{
						System.out.print(">S"+tempComponent.getID()+"> ");
						}
						else
						{
							System.out.print("#L"+tempComponent.getID()+"# ");
						}
					}
					else if(tempComponent.getEnd()==cell)
					{
						result=false;
						if(tempComponent instanceof Snake)
						{
					System.out.print(">s"+tempComponent.getID()+"> ");
						}
						else
						{
							System.out.print("#l"+tempComponent.getID()+"# ");
						}
					}
				}	
			return result;
		}
} 