package com.lxisoft.snakeandladder;
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
  
  public void setLadderDetails()
  {
	  setTop((int) (Math.random()*89));
	  do
	  {
		  setBottom((int) (Math.random()*70)+2);
	  }while(this.bottom<this.top&&(this.bottom-this.top)==15);
  }
  
  
}