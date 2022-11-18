package Banking;

public interface UKBanking {

	void passBookServices();
	void VisitServices();
	
	static void commonStaticMethod()
	{
		System.out.println("UK banking static method");
	}

	 default void defaultMethod()
	  {
		  System.out.println("UK banking default method");
	  }
}
