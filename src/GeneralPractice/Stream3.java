package GeneralPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Stream3 {

	public static void main(String[] args) {
		
		// Example MapToDouble functon
		ArrayList<User> userList = new ArrayList();
		userList.add(new User("tanya",23,34000));
		userList.add(new User("mohan",43,76000));
		userList.add(new User("rupa",55,78000));
		userList.add(new User("sameer",30,50000));
		
		ArrayList<User> userList1=userList,userList12 =userList, userList13 =userList, userList4 =userList, 
				userList5 =userList, userList6 =userList,userList7 =userList,userList8 =userList,userList9 =userList;
		
		userList.stream().mapToDouble(i -> i.salary).forEach(System.out::println);
		
		userList1.stream().forEach(System.out::println);
		
		// return blank as no value lef after filter function
		OptionalDouble maxVal = userList12.stream().mapToDouble(i -> i.salary).filter(i -> i>100000).max();
		if(maxVal.isPresent())
		System.out.println(maxVal.getAsDouble());
		
		//Sum method print 0.0 even when no element in the stream
		System.out.println(userList13.stream().mapToDouble(i -> i.salary).filter(i -> i>100000).sum());
		
		
		
		// allmatch /anymatch rupa
		
		System.out.println(userList1.stream().allMatch(user -> user.name.equals("rupa")));
		
		
		// findFirst 
		
		System.out.println(userList4.stream().findFirst().get().name);
		
		//sorted based on age field but only will show the age
		
		userList5.stream().mapToInt(user -> user.age).sorted().forEach(System.out::println);
		
		//sorted based on name field
		
		userList6.stream().sorted().forEach(user -> System.out.println(user.name));
		
		//sorted based on age using sorted comparator argument
		
		userList7.stream().sorted(Comparator.comparing(user -> user.age)).forEach(user-> System.out.println(user.name));
		// OR
		userList7.stream().sorted((u1,u2) -> u1.age-u2.age).forEach(user-> System.out.println(user.name));
		
		
		
	}

}


class User implements Comparable<User>{
	String name;
	int age;
	Double salary;
	
	public User(String name, int age, double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(User user)
	{
		return this.name.compareTo(user.name);
	}

	
}