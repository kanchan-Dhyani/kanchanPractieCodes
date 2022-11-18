package Package1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pc = new Child();
		   // Child c = new Parent(); // error cannot convert parent to child
		    Parent pp = new Parent();
		    Child cc = new Child();
		    pc.dostuff();
		    pp.dostuff();
		    cc.dostuff();
		    System.out.println("*********************");
		    print(cc);
		    print(pp);
		    print(pc);
		  

    
   // cc= pp;  // error cannot convert parent to child
   pp= cc;
    // cc= pc; // error cannot convert parent to child
	}
	
	public static void print(Parent p)
	{
		p.dostuff();
	}

}


class Parent{
	void dostuff()
	{
		System.out.println("dostuff  parent ");
	}
	
	
}

class Child extends Parent
{
	void dostuff()
	{
		System.out.println(" dostuff  child ");
	}
	
	
}