package GeneralPractice;

enum coffeSize   { 
	big( "500ml",0),
	small("100ml",1) ,
	medium("200ml",2);

	coffeSize(String size) {
		this.size = size;
	}
	
	coffeSize(String size, int priority) {
		this.size = size;
		this.priority = priority;
	}
	 public String getSize() {
		return size;
	}
	private String size;
	
	public int getPriority() {
		return priority;
	}
	private int priority;
	 
};
 
  
	

public class Enums {
	


	public static void main(String[] args) {
		
		//coffeSize z = Enums.coffeSize.big; 
		
		coffeSize obj = coffeSize.medium;
		System.out.println(obj.getSize());
      printMe(obj);
	}
	
	static void printMe(coffeSize c)
	{
		System.out.println(c.getSize());
	}

}


