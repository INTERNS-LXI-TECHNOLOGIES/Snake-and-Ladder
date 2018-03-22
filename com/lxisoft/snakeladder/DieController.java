import java.util.*;
public class DieController
{
	int number;
	public int generateRandomNumber()
	{
		number=(int)(Math.random()*6)+1;
		return number;
	}
}