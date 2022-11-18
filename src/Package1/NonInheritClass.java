package Package1;

public class NonInheritClass {
	int C = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier obj = new AccessModifier();
		obj.goo();
		obj.moo();
		//obj.foo();
		System.out.print(obj.B + obj.C + obj.D );
	}
	
	

}
