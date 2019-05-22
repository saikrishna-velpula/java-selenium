package constrdemo;

public class ConstructorDem 
{
	int id;
	String practice;
	public ConstructorDem(int id, String practice)
	{
		this.id=id;
		this.practice=practice;
		
	}
	public void display()
	{
		System.out.println(id+"------"+practice);
	}

	public static void main(String[] args) 
	{
		ConstructorDem d1=new ConstructorDem(25,"job");
		ConstructorDem d2=new ConstructorDem(35,"salary");
		//d1.display();
		
	}

}
