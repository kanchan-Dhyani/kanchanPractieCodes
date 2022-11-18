package GeneralPractice;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = 10;
		Double d = 34.5678;
		Boolean b = true;
		String is = "23";
		String id = "45.76";
		String ib = "false";
		int x = 78;
		double y = 89d;
		boolean z = false;
		
		// convert String to primitive date types
		int ci = Integer.parseInt(is);
        System.out.println(ci);
        
        double cd = Double.parseDouble(id);

        boolean cb = Boolean.parseBoolean(ib);
        
     // convert String to wrapper objects
        
         ArrayList<Integer> arr = new ArrayList();
         arr.add(ci); // autoboxing converted int to integer object
         System.out.println(arr.get(0) instanceof Integer); 
         
         // primitive to String
        String cx = Integer.toString(x); //passing primitive 
        String cy = Double.toString(y);
        String ic = Integer.toString(i); // passing wrapper object
        System.out.println(cx instanceof String);
        String zc = Boolean.toString(z);
        
        // Another way converting primitive to String
        String cx1 = String.valueOf(x); //passing primitive 
        String cy1 = String.valueOf(y);
        String ic1 = String.valueOf(i); // passing wrapper object
        System.out.println(cx1 instanceof String);
        String zc1 = String.valueOf(z);
        
        
        
        int check = (int) i;
        double cv = (double)check;
        System.out.println(cv);
	}

}
