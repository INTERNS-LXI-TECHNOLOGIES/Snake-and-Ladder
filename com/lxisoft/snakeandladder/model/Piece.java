public class Piece{
	
	private char name;
	private int position;
	
	//Getters and Setters
	public int getPosition(){
		return position;
	}
	public void setPosition(int position){
		this.position=position;
	}


	public void move(){
		System.out.print(name);
	}
	
}