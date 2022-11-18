
public  class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Hello AbstractClass");
  car obj = new ertiga();
  System.out.println(obj.getCarName());
  
  ertiga obj2 = new ertiga();
  System.out.println(obj2.getCarName());
	}

}

abstract class car  {
	private String carName = "gggg";
	private  String color = "red";
	public car()
	{
		carName = "sdfd";
		color = "white";
		System.out.println("constructor");
	}
	 public void perform()
	 {
		 System.out.println("perform");
	 }
	
	 public abstract void speed();
	public String getCarName() {
		return carName;
	}
	public String getColor() {
		return color;
	}
}


class  ertiga extends car{
	public  void speed()
	{
		 String carName = "ertiga";
		  String color = "blue";
		 System.out.println("speec");
	}
}