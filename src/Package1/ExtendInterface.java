package Package1;

import java.io.IOException;

public class ExtendInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // ParInterface pc = new concrete();
//  SubInterface sc = new concrete();
  concrete c = new concrete();
  Object o = new concrete();
 // pc = sc;
//  sc = pc;
 // o = c;
 // c =o;
 // pc.dostuff();
//  sc.dostuff(3);
  
	}

}

interface ParInterface 
{
	void doshape() ;
	void dostuff();
}

interface SubInterface extends ParInterface
{
	 void doshape();
	
	void dostuff(int y);
}

class concrete 
{

	
	public void dostuff() {
		// TODO Auto-generated method stub
		System.out.println(" ParInterface doStuff");
	}

	
	public void doshape() {
		// TODO Auto-generated method stub
		System.out.println(" doShape ");
	}

	public void dostuff(int y) {
		// TODO Auto-generated method stub
		System.out.println(" SubInterface doStuff");
	}

	
	class D extends concrete implements ParInterface
	{
		
	}

	
	
}