package Logic;

public class StringExampleTest {

	public static void main(String[] args) {

		System.out.println("=====================String Basics===================================");

		String x="Sureshekrish ";
		System.out.println(x.charAt(2));
		System.out.println(x.indexOf("e"));
		System.out.println(x.substring(1, 4));
		System.out.println(x.substring(2));
		System.out.println(x.concat("krishnan"));
		System.out.println(x.equalsIgnoreCase("Sureshe"));
		System.out.println(x.toUpperCase());
		System.out.println(x.isEmpty());
		System.out.println("length"+x.length());

		System.out.println(x.trim());
		String[] r=x.split("e");
		for(String num:r) {
			System.out.println("=="+num);
			System.out.println(r[2].trim());
		}

		System.out.println("=====================Palindrome===================================");

		System.out.println("r"+"p");
		//Palindrom
		String name="Athul";
		String pal="";

		for(int i=name.length()-1;i>=0; i--) {
			System.out.println(name.charAt(i));
			pal=pal+name.charAt(i);
			System.out.println("pal"+pal);
		}	
		if(name.equals(pal)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not a palindrome");
		}

		System.out.println("========================================================");	






	}	

}				
