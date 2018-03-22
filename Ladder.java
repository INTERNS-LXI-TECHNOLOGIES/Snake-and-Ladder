package com.lxisoft.snakeandladder;
import java.util.ArrayList;
public class Ladder
{
	
  private int bottom;
  private int top;
  
  
  public void setBottom(int bottom)
  {
	  this.bottom = bottom;
  }  
  public int getBottom()
  {
	  return bottom;
  }
  public void setTop(int top)
  {
	  this.top = top;
  }
  public int getTop()
  {
	  return top;
  }
  
  public boolean availableValue(int x,ArrayList<Integer> totalValues)
	{
	try{
		Thread.sleep(500);
	}catch(Exception e){e.printStackTrace();}
	
	for(int i = 0;i<totalValues.size();i++)
	{
	if(x ==totalValues.get(i))
	{
			//if(ladders[i].getBottom()-ladders[i].getTop()>=15)
			//{
		      return false;
			//}
		}
	}
	return true;
}
  
  
  
  
  public void setLadderDetails(ArrayList<Integer> totalValues)
  {
	  boolean isTrue;
	  int temp1,temp2;
	do{
	temp1=(int) (Math.random()*53)+28;
	System.out.println("test "+temp1);
	}while(!availableValue(temp1,totalValues));
	
	setTop(temp1);
	totalValues.add(temp1);
	System.out.println(temp1+" Top Set Successful");
	
	
	do{
	temp2=(int) (Math.random()*47)+2;
	System.out.println("test2 "+temp2);
	}while(!availableValue(temp2,totalValues));
	
	setBottom(temp2);
	totalValues.add(temp2);
	System.out.println(temp2+" Bottom Set Successful");
	  
	  
	  
	  
	  
	  
	  //setTop((int) (Math.random()*53)+28);
	 // do
	  //{
		  //setBottom((int) (Math.random()*47)+2);
	  //}while(this.bottom<this.top&&(this.bottom-this.top)==15);
  }
  
  
}