package Logic;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class DuplicateElements {
	
	
	
	@Test
	public void fileterDuplicateElements() {
		
		int[] a1= {1,2,2,3,4,5,5,5};
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> all=new ArrayList<Integer>();
		
		for(int i=0;i<a1.length;i++) {
			if(!al.contains(a1[i])) {
				al.add(a1[i]);
			}else {
				all.add(a1[i]);
			}
		}
		
		System.out.println("================");
		
		for(int m:al) {
			
			System.out.println("unique "+m);
		}
	
		System.out.println("================");
		
		for(int x:all) {
			
			System.out.println("Duplicates "+x);
		}
		
		
	}

}
