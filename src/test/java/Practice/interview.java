package Practice;

import java.util.ArrayList;

public class interview {
	
	public static void main(String[] args) {
		
		
		int a[]= {4,5,5};
		

		
		System.out.println("==============");
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i=0;i<a.length;i++) {
		
			int k=0;
			if(!al.contains(a[i])) {
				al.add(a[i]);  //Adding unique number to the arraylist
				k++;
				
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					k++;
				}
			}		
			System.out.println(a[i]+""+k);
			}
			
		}
		
	
		
	}

}
