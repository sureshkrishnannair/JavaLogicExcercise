package Logic;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class MaxValues {
	
	@Test
	public void maxValues() {
		
		int[] num= {10,20,30,40,5};
				
		Arrays.sort(num);
		
		for(int x=0;x<num.length;x++) {
			System.out.println(num[x]);
		}
		
		System.out.println("======================");
		for(int y=num.length-1;y>=num.length-2;y--) {
			
			System.out.println(num[y]);
		}
		
		
	}

}
