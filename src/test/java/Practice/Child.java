package Practice;

public class Child extends Parent implements Color{

	@Override
	public void blueP() {
		System.out.println("Abstract Blue");
		
	}

	@Override
	public void green() {
		System.out.println("Interface Green");
		
	}

	@Override
	public void red() {
		System.out.println("Interface red");
		
	}

	@Override
	public void white() {
		System.out.println("Interface white");
		
	}
	
	public void resetChildAbstract() {
		System.out.println("reset abstract");
	}
	
	
	public static void main(String[] args) {
		Child p1=new Child();	//Child class Object and reference , access all methods 
		p1.blueP();
		p1.green();
		p1.white();
		p1.resetChildAbstract();
		
		Parent p2=new Child();		//Parent class reference and child class object, access methods of parent only
		p2.blueP();
		p2.greenP();
		p2.whiteP();
		p2.redP();
		
		
		Color r=new Child();
		r.red();
		r.green();
		r.white();
		
		//Parent p3=new Parent(); //Cannot instantiate with Abstract class Object
		//Child c3=new Parent(); //Cannot instantiate with Abstract class Object
		
		
	}
	
	
	

}
