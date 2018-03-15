public class Snake extends SnakeOrLadder{
		
	private String name;
	private int start;
	private int end;		
		
	Snake(String name, int start, int end){
		this.name=name;
		this.start=start;
		this.end=end;
	}
	
	//Getters and Setters
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getStart(){
		return start;
	}
	public void setStart(int start){
		this.start=start;
	}
	public int getEnd(){
		return end;
	}
	public void setEnd(int end){
		this.end=end;
	}	

		
}