package Package1; 

import java.lang.reflect.Method;

public class InterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    C c = new C();
    B b = new B();
    A a = new A();
    A obj = new B();
    c.dostuff();
    a.dostuff();
   b.dostuff();
   obj.dostuff();
  
    
   
    
    Class tClass = c.getClass();
	Method[] methods = tClass.getMethods();
	for (int i = 0; i < methods.length; i++) {
		System.out.println("public method: " + methods[i]);
	}
	}

	
}

interface top 
{
	static void staticPrintMe()
	{
		System.out.println("interface top static method");
		
	}
	
	default void defaultPrintMe()
	{
		System.out.println("interface top default method");
	}
	void dostuff();
	
}



class A implements top
{

	
	public void dostuff() {
		// TODO Auto-generated method stub
		System.out.println("Class A  doStuff");
		A a = new A();
		
	}


}
	
class B extends A 
	{	
	public void dostuff() {
		// TODO Auto-generated method stub
		System.out.println("Class B  doStuff");
	}
	}

class C extends B implements top
{
	//So it will only have the doStuff from Class B since it ha soverridden the dostuff from class A
}

	
	
