package GeneralPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employee el1 = new Employee("sara", 34,2000);
 Employee el2 = new Employee("sana", 23,34000);
 Employee el3 = new Employee("monty", 45,67000);
 Employee el4 = new Employee("jihan", 78, 80000);
 
 List<Employee> elList = new ArrayList<Employee>();
elList.add(el4);elList.add(el1);elList.add(el2);elList.add(el3);

nameComparator nameSort = new nameComparator();
ageComparator ageSort = new ageComparator();

//name sort
Collections.sort(elList,nameSort);
elList.forEach(System.out::print);
System.out.println();

//age sort
Collections.sort(elList,ageSort);
elList.forEach(System.out::print);


System.out.println();

//sort using functional interface

Collections.sort(elList, (e1,e2) -> e1.salary - e2.salary);
elList.forEach(System.out::print);
	}

}

class Employee{
	
	String name ;
	int age;
	int salary;
	
	public Employee(String name, int age, int salary)
	{
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return name + ":" + age + ":" + salary;
		
	}
}

class nameComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.name.compareTo(e2.name);
		
	}
}


class ageComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.age -e2.age;
		
	}
}


