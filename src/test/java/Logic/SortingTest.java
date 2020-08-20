package Logic;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class SortingTest {
	
	
	public void readArray(String[] data) {
		for(String x:data) {
			System.out.println(">>"+x);
		}
		System.out.println();
	}
	
	@Test
	public void sortList() {
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","aug", "Sep", "Oct", "nov", "Dec" };
	
		readArray(inputList);
		System.out.println("Sorted");
		Arrays.sort(inputList);
		
		readArray(inputList);
		
		
		System.out.println("case sensitive");
		
		
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
		
		readArray(inputList);
		
		
	
	}

}
