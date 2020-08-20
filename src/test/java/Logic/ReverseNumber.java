package Logic;

import org.testng.annotations.Test;

public class ReverseNumber {
	
	@Test
	public void reversenumber() {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
				
		System.out.println("==================Reverse============");
		
		
		for(int x=arr.length-1;x>=0;x--) {
			System.out.println(arr[x]);
		}
	
	
	
	
	}

}
