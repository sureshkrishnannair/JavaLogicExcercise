package Practice;

public class OverChild extends OverParent {
	
	public void car() {
		System.out.println("car Child ");
	}
	
	public void engine() {
		System.out.println("Child engine");
	}
	
	public static void main(String[] args) {
		
		OverChild oc=new OverChild();
		oc.car();
		oc.engine();
		
		System.out.println("===========");
		
		OverParent op=new OverChild();
		op.car();
		System.out.println("===========");
		
		OverParent opp=new OverParent();
		opp.car();
		
	}

}
