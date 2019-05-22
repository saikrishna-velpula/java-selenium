package constrdemo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Spring;

public class Loop {

	public static void main(String[] args) 
	{
		ArrayList arraylist=new ArrayList();
		arraylist.add("10");
		arraylist.add("rameshsoft");
		arraylist.add("selenium");
		arraylist.add("saikrishna");
		arraylist.add("esntechnologies");
		arraylist.add("90");
		arraylist.add("11.55");
		System.out.println(arraylist);
		Iterator iterator=arraylist.iterator();
		while(iterator.hasNext())
		{
			String string=(String)iterator.next();
			if (string.equalsIgnoreCase("rameshsoft"))
			{
				System.out.println("welcome");
			}
			if (string.equalsIgnoreCase("11.55"))
			{
				System.out.println("saikrishna");
				
			}
		}
		

	}

}
