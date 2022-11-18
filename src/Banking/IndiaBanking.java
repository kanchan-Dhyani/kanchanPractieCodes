package Banking;

public interface IndiaBanking {
	
	void aadharServices();
	void passBookServices();
	
	static void commonStaticMethod()
	{
		System.out.println("India banking static method");
	}
	
	 default void defaultMethod()
	  {
		  System.out.println("India banking default method");
	  }
	 
	 

}
