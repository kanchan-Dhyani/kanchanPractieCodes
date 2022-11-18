package GeneralPractice;

public class ExceptionsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionsPrac p = new ExceptionsPrac();
		p.method1();

	}
	
	public void method1()
	{
		System.out.println("method 1 - start");
		method2();
		System.out.println("method 1 - end");
	}
	public void method2()
	{
		System.out.println("method 2 - start");
		try {
		int i = 9/0;
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("method 2 - end");
	}


}
