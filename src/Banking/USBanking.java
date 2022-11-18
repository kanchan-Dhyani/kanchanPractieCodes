package Banking;

public interface USBanking {
	
	void passBookServices();
	void PersonalNoServices();
	static void commonStaticMethod()
	{
		System.out.println("US banking static method");
	}

	  default void defaultMethod()
	  {
		  System.out.println("US banking default method");
	  }
}
