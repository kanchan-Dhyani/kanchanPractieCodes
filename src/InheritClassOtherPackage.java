import Package1.AccessModifier;
import Package1.InheritClass;

public class InheritClassOtherPackage extends AccessModifier{
	  int C = 0;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			InheritClassOtherPackage obj = new InheritClassOtherPackage();
	    obj.play();
	    obj.goo();
	    
	    
	    AccessModifier obj2 = new AccessModifier();
	 //   obj2.goo();
	    
	    
		}
		
		public  void play()
		{
			
			goo();
	//		moo();
	//		System.out.print(B + super.C + D + C);
			
		}

	}

class temp extends InheritClassOtherPackage
{
	void Joy()
	{
		goo();
	//	moo();
		System.out.print(B + super.C + D + C);
		
		InheritClassOtherPackage obj2 = new  InheritClassOtherPackage()	;
	//	obj2.goo();
	}
}


class A
{
	void foo()
	{
		temp obj = new temp();
//		obj.goo();
		
		InheritClassOtherPackage obj2 = new  InheritClassOtherPackage()	;
//		obj2.goo();
	}
}