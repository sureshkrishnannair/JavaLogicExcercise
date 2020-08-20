package Practice;

public class colortest implements Color {
	
	
	@Override
	public void green() {
		System.out.println("green");
		
	}

	@Override
	public void red() {
		System.out.println("red");
		
	}

	@Override
	public void white() {
		System.out.println("white");
		
	}
	
	public void resetColor() {
		System.out.println("reset");
	}
	
	
	
	
	public static void main(String[] args) {
		
		colortest ct1=new colortest(); //if class is the  reference and class is the Object , access all methods
		ct1.green();
		ct1.red();
		ct1.white();
		ct1.resetColor();
		
		Color c=new colortest(); //If  the reference is an interface and class is the object, access only Implemented methods
		c.green();
		c.red();
		c.white();
		
	//	Color cc=new Color();  //cannot instantiate with Interface reference and interface object 
		
	//	colortest ctt=new Color();  //cannot instantiate with class reference and Interface Object
		
	}
	
	
	
	
	
	
	
	

}
