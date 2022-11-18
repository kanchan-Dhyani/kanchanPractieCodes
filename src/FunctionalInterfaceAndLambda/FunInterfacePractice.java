package FunctionalInterfaceAndLambda;

import java.util.function.Consumer;

public class FunInterfacePractice {

	public static void main(String[] args) {
		Dog boi = new Dog("boi", 10,13);
		Dog clover = new Dog("clover", 20,9);
		
 // DogQueries dq = d->d.getAge() > 9;
    //  System.out.println(dq.test(clover));
      
      DogQueries dp = (d)->{
    	   d.setAge(100);
    	  return d;
      };
      
      dp.test(boi);
      System.out.println(boi.getAge()); // we can modify the state of an object inside the funct
      ////////////////////////////////////////////////////////////////////////////////////////////////
      
      Consumer<Dog> weight =(Dog d) -> {
    	  d.setWeight(110);
      };
      
      Consumer<Dog> age =(Dog d) -> {
    	  d.setAge(30);
      };
      
     Consumer comb =  weight.andThen(age);
     comb.accept(boi);
     
      System.out.println(boi.getAge());
      System.out.println(boi.getWeight());
      
      ////////////////////////////////////////////////////////////////////////////////////////////////////
      
      
	}

}

@FunctionalInterface
interface DogQueries {
	Dog test(Dog d);
}

class Dog{
	public Dog(String name, int weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	private String name;
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	private int weight;
	private int age;
	
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
	
	
}