package constrdemo;


class B{
	int num;
	
	B(int parNum){
		this.num = parNum;
	
	}
	
	public void displayNumber(){
		System.out.println(this.num);
	}
}


public class A {

	int num;
	A(){
		this.num = 10;
		System.out.println("constructor");
	}
	
	public void displayNumber(){
		System.out.println("num = "+this.num);
	}

	public static void main(String[] args) {
		
		//A aobj = new A();
		//aobj.displayNumber();
		// TODO Auto-generated method stub
		
		B bobj = new B(10);
		bobj.displayNumber();

	}

}
