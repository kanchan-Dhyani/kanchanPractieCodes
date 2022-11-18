package Package1;

import java.lang.reflect.Method;

public class InheritClass extends AccessModifier{
  int C = 0;
 static public int D = 18;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritClass obj = new InheritClass();
		AccessModifier obj2 = new InheritClass();
		System.out.println(obj2.D);
		System.out.println(obj.D);
		obj.callMe();
		obj2.callMe();
		
//		AccessModifier[] parentArr = new AccessModifier[10];
//		InheritClass[] childArr = new InheritClass[3];
//		
//		parentArr = childArr;
		
		
		
       // obj.play();
       // obj.goo();
       // obj.moo();
		

	    Class tClass = obj.getClass();
		Method[] methods = tClass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println("public method: " + methods[i]);
		}

		}
      
	
	
	
	public  void play()
	{
		goo();
		moo();
		System.out.print(B + super.C + D + C);
		
	}
	
	 public  static int callMe(int x)
	 {
		 System.out.println("Child call me");
		 return 4;
	 }

	}


