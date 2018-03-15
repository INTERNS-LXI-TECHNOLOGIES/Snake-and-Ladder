import java.util.concurrent.ThreadLocalRandom;
public class Dice{
	
	private int number;
	
	//Getters and Setters
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number=number;
	}

	public int generateRandomNumber(){ 
		number = ThreadLocalRandom.current().nextInt(1,7);
		return number;
	}
	
}