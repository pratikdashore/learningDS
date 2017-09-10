package pluralSight.basics;

import java.util.Date;

public class First {

	public static void main(String[] args) {
		Person p = new Student(1,26,"Pratik");
		Person p2 = new Person(27, "Rahul"); 
		p2.printDetail();
		p2.printIsAged();
		Date d = new Date(1480857000000L);
		System.out.println(d);
		
	}	
	
}
