package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ArraylistsPractice {

	public static void main(String[] args) {
		
		T1 ob = new T1("ria");
		T1 ob1 = new T1("ria");
		
		System.out.println(ob.equals(ob1));
		System.out.println(ob == ob1);
		
		
		// ArrayLists
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Ahaan");
		list1.add("kanchan");
		list1.add ("Abhi");
		list1.add("Shalini");
		list1.add("Ashish");
		System.out.println(list1.toString());
		System.out.println(list1.indexOf("Ahaan"));
		System.out.println(list1.remove("Kanchan"));
		System.out.println(list1.remove("kanchan"));
		
		list1.add(null);
		list1.add(null);
		list1.add("Ahaan");
		System.out.println(list1.toString());
		
		list1.remove(null);list1.remove(null);
		ArrayList copyList = new ArrayList();;
		copyList.addAll(list1);
		
		Collections.sort(list1);
		System.out.println(list1.toString());
		
		
		System.out.println(copyList.toString());
		System.out.println(copyList.equals(list1));
		Collections.sort(copyList);
		System.out.println(copyList.equals(list1));
		
		Collections.reverse(list1);
		
		// Generlised arraylist which can contain any type
		ArrayList list2 = new ArrayList();
		list2.add(56);
		list2.add("dfsdf");
		list2.add(ob);
	//	Collections.sort(list2);
		
		
		// ArrayList of a class objects- using comparator
		T1 obj1 = new T1("Sia");
		T1 obj2 = new T1("Mia");
		T1 obj3 = new T1("Ria");
		T1 obj4 = new T1("Jia");
		T1 obj5 = new T1("Tia"); 
		
		ArrayList<T1> list3 = new ArrayList<T1>();
		list3.add(obj1);
		list3.add(obj2);
		list3.add(obj3);
		list3.add(obj4);
		list3.add(obj5);
		
		System.out.println(list3.toString());
	    Collections.sort(list3);
	    System.out.println(list3.toString());

	}

}


class T1 implements Comparable {   
	String name ;
	int id;
	
	T1(String name)
	{
		this.name = name;
	}

	
	@Override
	public int compareTo(Object obj)
	{
		return name.compareTo(((T1)obj).name);
	}
	
	public String toString()
	{
		return name;
	}
	
	
}



class T2   {   
	String name ;
	int id;
	
	T2(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	public String toString()
	{
		return name;
	}
	
	
}

class NameSort implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		return (((T2)obj1).name).compareTo(((T2)obj2).name);
	}
}

class IDSort implements Comparator<T2>
{
	public int compare(T2 obj1, T2 obj2)
	{
		return ((Integer)obj1.id).compareTo((Integer)obj2.id);
	}
}
