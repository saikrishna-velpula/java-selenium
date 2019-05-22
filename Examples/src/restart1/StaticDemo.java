package restart1;


class AContainer{
	public static int a=10;
	int b=20;
	
	public int funA() {
		a++;
		return a;
	}
	
	public int funB() {
		a++;
		return a;
	}
	    
	public int funC() {
		b++;
		return b;
	}
	
	public int funD() {
		b++;
		return b;
	}
	
}


public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AContainer a = new AContainer();
		
		System.out.println(a.funC()); //21
		System.out.println(a.funD()); //22
		
		System.out.println(a.funA()); //11
		System.out.println(a.funB()); //12
		
		AContainer b = new AContainer();
		System.out.println(b.funC()); //21
		System.out.println(b.funD()); //22
		
		System.out.println(b.funA()); //13

	}

}
