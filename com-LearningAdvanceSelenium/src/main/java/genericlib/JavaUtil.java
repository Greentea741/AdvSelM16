package genericlib;
/**
 * @author anurag
 */

import java.util.Random;

public class JavaUtil {
	
	/**
	 * the below method is used to generate random numbers
	 * @return
	 */
		public int getRandonNumber() {
			Random random= new Random();
			int ranNum = random.nextInt(100);
			return ranNum;
		}

}