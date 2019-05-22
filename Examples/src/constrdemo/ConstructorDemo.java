package constrdemo;

public class ConstructorDemo
{
	int id;
	String practice;
	
	public ConstructorDemo(int a, String s)
	{
		id=a;
		practice=s;
	}
	public void display()
	{
		System.out.println(id+"............"+practice);
	}

	public static void main(String[] args)
	{
		ConstructorDemo c=new ConstructorDemo(25,"job");
		ConstructorDemo c1=new ConstructorDemo(98,"salary");
		c.display();
		c1.display();
	}

}
