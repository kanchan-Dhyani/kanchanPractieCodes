
public class ConstructorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  child obj = new child("hi");
  System.out.println(obj.F);
  
  child obj1 = new child("hiyyyyy");
  System.out.println(obj1.F);
  
  System.out.println(obj.F);
	}

}


class parent
{

	public parent(String f) {
		// TODO Auto-generated constructor stub
	}
	
}

class child extends parent
{
	static String F;
	String G;
	public child(String g1)
	{
		super(F);
		
		F = g1;
	}
	
	
}