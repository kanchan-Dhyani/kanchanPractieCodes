
package GeneralPractice;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class Scanner2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
	
        System.out.println("Enter name : ");
        String name = s.next();
        
        System.out.println("Enter Id :" );
        int id = s.nextInt();
        
        System.out.println("Enter percentage : ");
        double p = s.nextDouble();
        
        System.out.println("Name : "+ name+ " , id : "+ id + " percentage : " + p);
        
        
	}

}
