package Logic;

import org.testng.annotations.Test;

public class Swap2Numbers {
	
	@Test
	public void swapnumbers() {
		
		int numX = 10;
		int numY = 20;
		System.out.println("Pre-swapping state:");
		System.out.println("numX value: " + numX);
		System.out.println("numY value: " + numY);
		
		System.out.println("");
		
		numX = numX + numY; //10+20=30 (x=x+y)
		numY = numX - numY; //30-20=10 (y=x-y)
		numX = numX - numY; //30-10=20 (x=x-y)
		System.out.println("Post-swapping state:");
		System.out.println("numX value: " + numX);
		System.out.println("numY value: " + numY);
		
	}

}
