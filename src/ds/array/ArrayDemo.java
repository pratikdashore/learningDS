package ds.array;


import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArrayDemo {
	
	public static void main(String[] args) {
		Map<Date,String> map = new TreeMap<>();
		Calendar cal = Calendar.getInstance();
		Date first = new Date();
		cal.add(Calendar.DATE, -1);
		Date second = cal.getTime();
		cal.add(Calendar.DATE, 2);
		Date third = cal.getTime();
		
		map.put(first, "First");
		map.put(second,"Second");
		map.put(third, "third");
				
	    for(Map.Entry<Date, String> entry : map.entrySet()){
	    	Date key = entry.getKey();
	    	String val = entry.getValue();
	    	System.out.println(key + " " + val );
	    }
		
	    int a = 10;
	    double b = a;
	    System.out.println(b);
	    
	    String s = "test";
	    String s2 = new String("test");
	    String s3 = new String("test");
	    StringBuilder s4 = new StringBuilder("test");
	    Set set = new HashSet();
	    set.add(s2);
	    set.add(s3);
	    set.add(s4);
	    System.out.println(set.size());
	}
	
	
	public static int paint(int [] A){
		int strokes = 0;
		int currentLevel = 0;
		for(int i =0; i < A.length; i++){	
			if( A[i] > currentLevel){
				strokes += (A[i] - currentLevel);
				if(strokes > 1000000000){
					return -1;
				}
			}
			currentLevel = A[i];
		}
		return strokes;
		
	}
}
