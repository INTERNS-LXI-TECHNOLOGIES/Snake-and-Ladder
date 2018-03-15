import com.lxisoft.player;
import java.util.Scanner;
public class Players
{
	Scanner scan=new Scanner(System.in);
	
public void inputPlayersDetails()
{
	int player1=0,player2=0;
	int currentplayer=-1;
	int diceValue=0;
	Scanner scan=new Scanner(System.in);
	String str;
	int diceValue=0;
	
	do
	{
		System.out.println(Current Player==-1? "\n FIRST PLAYER TURN" : "\n SECOND PLAYER TURN");
		System.out.println("PRESS A TO ROLL THE DIE");
		str=next();
		diceValue=rollDice();
		
		if(current player==-1)
		{
			player1=PlayerValue(player1,diceValue);
			System.out.println("First Player:"+player1);
			System.out.println("Second Player"+player2);
			System.out.println("**********************");
		}
		if(isWin(player1))
		{
			System.out.println("First Player wins");
			return;
		}
		
	}
	else{
		player2=playerValue(player2,diceValue);
		System.out.println("First Player:"+player);
		System.out.println("Second Player:"+player2);
		System.out.println("***********************");
		}
		if(isWin(player2))
		{
			System.out.println("Second Player wins");
			return;
		}
		currentPlayer=currentPlayer;
		}while("A".equals(str));
}	
	
	public int rollDice()
	{
		int n=0;
		Random r=new Random();
		n=r.nextInt(6);
		return (n==0);
	}
}
}