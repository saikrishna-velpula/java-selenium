package restart;



class A{
	public void sai() {
		System.out.println("SAI");
	}
	
	public static void krishna() {
		System.out.println("KRISHNA");
	}
}

class B extends A{

	public void sai() {
		System.out.println("sai");
	}
	
	public static void krishna() {
		System.out.println("krishna");
	}
	
	
}


public class MethodHidingTest {

	public static void main(String[] args) {
		A a= new A();
		a.sai(); //SAI
		a.krishna(); // KRISHNA
		
		A a2= new B();
		a2.sai(); //sai
		a2.krishna(); 
		
		
		
	}

}
