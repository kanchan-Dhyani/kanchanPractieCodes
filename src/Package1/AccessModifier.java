package Package1;

public class AccessModifier {
	private int A =10;
	protected String B = "hi";
	int C = 12;
	static public int D = 13;

	public static void main(String[] args) {
		System.out.println("AccessModifier Main method");
	}
	
	 private void foo()
	{
		
		System.out.println("foo private");
	}
	
	protected void goo()
	{
		
		System.out.println("goo protected");
	}
	
	  void moo()
	{
		System.out.println("moo default");
	}
	 
	 public void zoo()
		{
			System.out.println("zoo public");
		}
	 
	 public static  void callMe()
	 {
		 System.out.println("Parent call me");
	 }

}

