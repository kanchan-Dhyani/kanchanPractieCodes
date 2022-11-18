public class staticmethod {
	static int A =1;
	String B = "hi";
	static int C = 5;
	 int D = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticmethod obj = new staticmethod();
  foo();
  obj.goo();
  obj.foo();
  System.out.println(A);
 // System.out.println(this.B);
  System.out.println(obj.B);
  System.out.println(obj.C);// warning static method should be accessed in static way
  System.out.println("******************************************************");
  
  B b = new B();
  b.foo(); // for classes the child method is able to access the parent class static method but it doesnt work for interfaces.
  // if interface static method then it has to be accessed by the interface name only...
  
	}
	
	static  void foo()
	{
//		goo();
		System.out.println("foo private");
	}
	
	 void goo()
	{
		 staticmethod objNew = new staticmethod();
		 moo();
		 System.out.println(this.A + this.D + this.C+ this.B); // warning static variable should be accessed in static way
		foo();
		 objNew.foo();
		System.out.println("goo protected");
	}
	
	 void moo()
	{
		 foo();
		System.out.println(B);
	}
	 
	 

}


class B extends staticmethod
{
	
}
