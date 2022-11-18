package GeneralPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	
   
   System.out.println(Double.valueOf("5.0") + 9);
   
  Double x = 43.4567890;
 
  
   ///////////////////////////////////////////////////////////////////////////////////////
   
  for(int i1 = 1 ; i1 <=5; i1++)
  {
	  for(int y = i1; y > 0; y--)
	  {
		  System.out.print("*");
	  }
	  System.out.println();
  }
  
  //////////////////////////////////////////////////////////////////////////////

   
   String [][] arr = new String[5][5];
   int row = 4;
   for(int i1 = 0 ; i1 <5; i1++)
	  {
		  for(int y = 0; y < 5; y++)
		  {
			 
			  if(y >= row)
				  arr[i1][y] = "*";
			  else
				  arr[i1][y] = " "; 
			  
			  System.out.print(arr[i1][y]);
		  }
		  
		  row--;
		  System.out.println();
	  }
   
 
	  
   
   
	}

}
