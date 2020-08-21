package Logic;

import org.testng.annotations.Test;

public class PrimeNumberTest {
	
	
	//Any number can be divided by itself or by 1 and denominator would be zero
	//No other number can be used to divide and get reminder as zero (8/2%==0), is not prime 
	//Exception 2 is prime 
	//Numbers <1 is not Prime
	
	
	public  static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}
	
	
	@Test
	public void primeNumberTest() {
		System.out.println(isPrimeNumber(8));
	}
	
	

}
