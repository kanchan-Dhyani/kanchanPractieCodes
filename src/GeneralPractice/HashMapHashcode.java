package GeneralPractice;

import java.util.HashMap;
import java.util.stream.Stream;

public class HashMapHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		HashMap<Object,Object> li = new HashMap<Object, Object>();
		li.put("kan", "Kanchan");
		li.put(new cat(), "cat object2");
		li.put(new cat(), "cat object5");
		
		li.put(new dog("tommy"), "Tommy");
		li.put(new dog("puppy"), "puppy");
		
		System.out.println(li.get(new dog("tommy")));
		System.out.println(li.get(new cat()));
		
		// get a stream of that
		
		Stream<Object> Str = Stream.of(li);
		
		Str.forEach(System.out:: println);
		
		// another way to get stream
		
		li.entrySet().stream().forEach(System.out::println);
	}

}

class dog
{
	String name;
	public dog(String name)
	{
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object o)
	{
		if((o instanceof dog) && ((dog)o).name.equals(this.name))
		return true;
		else
	     return false;
		
	}
	
	/*
	@Override
	public int hashCode()
	{
		return name.hashCode();
		
	}
	*/
	
	@Override
	public int hashCode()
	{
		return 4;
		
	}
	
	
}

class cat
{
	@Override
	public int hashCode()
	{
		return 4;
		
	}
	
	@Override
	public boolean equals(Object o)
	{
		
	     return true;
		
	}
}