import java.util.ArrayList;

public class ArraylistPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList x = new ArrayList();
		  x.add("fg");
		  x.add(3);
		  x.add(null);
		  System.out.println(x.toString());
		  
		  ArrayList<String> users= new ArrayList<String>(1);
		  
		  users.add("Ram");
		  users.add("Sita");
		//  System.out.println(users.get(2));
		  
		  users.addAll(users);
		  
		for(String user : users)
		{
			System.out.println(user);
		}
		  
		  
	}

}
