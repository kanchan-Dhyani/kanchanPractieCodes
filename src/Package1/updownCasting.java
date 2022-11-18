package Package1;

public class updownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 g obj = new g();
		 System.out.println("**************************");
		 f obj1 = new g();
	// obj = (g)obj1;
		 
		 //obj.callMe();;
		// obj1.callMe();
		 
		 obj.foo();
	}

}

class f
{
	{
		System.out.println("class f init");
	}
	
	public f()
	{
		System.out.println("class f constructor");
	}
	static {
		System.out.println("class f static block");
	}
	public  static void callMe()
	{
		System.out.println("parent call me");
	}
	
	
}

class g extends f
{
	
	{
		System.out.println("class g init");
	}
	
	public g()
	{
		super();
		System.out.println("class g constructor");
	}
	static {
		System.out.println("class g static block");
	}
	public  static void callMe()
	{
		System.out.println("child call me");
		
	}
	
	public void foo()
	{
		super.callMe();
		System.out.println("child method foo");
	}
	
}