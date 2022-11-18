package FunctionalInterfaceAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class supplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Supplier dp = ()->{
			return "This is India";
		};
		
		System.out.println(dp.get());
		
		IntSupplier in = () ->{		
			return 7;
		};
	
	
	
	Consumer<String> cn = (pill) ->{
		if (pill.equals("red"))
			System.out.println("red pill");
		if (pill.equals("blue"))
			System.out.println("blue pill");
	};
	
	 cn.accept("red");
	 
	 
	 
	 
	List names = Arrays.asList("tom", "harry", "sita");
	  Consumer<String> conNames = (name) -> System.out.println("Hi " + name);
	  names.forEach(conNames);
	 
	 
	
	 
	 
	 
}
}
