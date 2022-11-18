package FunctionalInterfaceAndLambda;

public class functionalInterf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x = 7;
		 Top obj = (p) -> System.out.println(x+p);
		 obj.callMe(3);
		 
		 
		 parent obj2 = new parent(k-> System.out.println(k*x));
		 
		 forInteger in = z-> z+x; //  it means it will return z+x but if we use curly braces here, then must use return keyword
		 System.out.println(in.getInteger(19));
		 
		 topper fn1 = () -> {return x >412 ? true: false;};
		  topper fn2 = () -> {return true;}; // if return statement is there ,lambda curly braces are required
		 topper fn3 = () -> true; // it means it will return true
		 System.out.println(fn1.printMe() + " "+ fn2.printMe()+ " "+fn3.printMe());
	}

}

@FunctionalInterface
interface Top //extends topper, its not allowed
{
	void callMe(int i);
	
}

class parent
{
	parent(Top t)
	{
		t.callMe(6);
	}

	
}


interface topper
{
	boolean printMe();
	//void printMe1(String s); will give error in line 15
}

interface forInteger
{
	int getInteger(int s);

}


