package Package1;

public class classOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  classOverload obj = new classOverload();
  classOverload obj1 = new E();
  
  obj.printme(4);
  obj1.printme(6);
	}

	public void printme(int x)
	{
		System.out.println("parent class");
	}
	
	
}

class E extends classOverload
{
	public void printme()
	{
		System.out.println("child class print me");
	}
	
	public void printme(float x)
	{
		System.out.println("child class");
	}
}