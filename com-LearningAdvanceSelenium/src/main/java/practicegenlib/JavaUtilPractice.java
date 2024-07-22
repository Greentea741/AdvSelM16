package practicegenlib;

import java.util.Random;

public class JavaUtilPractice {
	
	public int getRandomNumber()
	{
		Random random= new Random();
		int ranNum = random.nextInt(100);
		return ranNum;
		
	}

}
