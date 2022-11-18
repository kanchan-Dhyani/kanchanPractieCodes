package GeneralPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collections1 {

	public static void main(String[] args) {
		
		String temp = "hi";
		
		String temp1 = "hi";
		int[] c = {4};
		int[] b = {4};
		System.out.println(temp1==(temp));
		System.out.println("hi"==(temp));
		System.out.println(c.equals(b));
		System.out.println(c==b);
		
		
		@SuppressWarnings("deprecation")
		Integer i =new Integer(2);
	
		Integer k =2;
		int j =2;
		System.out.println(i == j);
		 double x =2;
		 System.out.println(i == x);
		 
		 System.out.println(i.equals(k));
		 System.out.println(i==k);
		 
		 
		 Integer b1 = 2;
		 System.out.println(b1.equals(i));
		 System.out.println(b1 ==i);
		 System.out.println(b1 ==k);
		 System.out.println(b1 !=k);
		 
	// Hashset	 
		 HashSet li = new HashSet();
		 li.add("amy"); li.add("may"); li.add("vbg");
		 li.add(null); li.add(null);
		 
		 System.out.println(li);
		 
		 
 //Arraylist
		 ArrayList li1 = new ArrayList();
		 li1.add("amy"); li1.add("may"); li1.add("vbg");
		 li1.add(null); li1.add(null);
		
		 System.out.println(li1);
		 
		 
		 
		 ArrayList li3 = new ArrayList();
		 li3.add(2); li3.add(4); li3.add(5);
		 li3.add(null); li3.add(null);
		
		 System.out.println(li3);
		 
		 
		// linked Hash set 
		 LinkedHashSet li2 = new LinkedHashSet();
		 li2.add("amy"); li2.add("may"); li2.add("vbg");
		 li2.add(null); li2.add(null);
		 
		 System.out.println(li2);
		 
	}

}




