package constrdemo;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDulpict {

	public static void main(String[] args) 
	{
		ArrayList arraylist=new ArrayList();
		arraylist.add(10);
		arraylist.add("Rameshsoft");
		arraylist.add("Rameshsoft");
		arraylist.add(10);
		arraylist.add(10);
		arraylist.add("saikrishna");
		
		
		HashSet haset=new HashSet(arraylist);
		System.out.println(haset);

	}

}
