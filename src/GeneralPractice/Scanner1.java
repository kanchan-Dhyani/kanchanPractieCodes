package GeneralPractice;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner("ab4hn6ab");
		
//		String token;
//	do {
//		token= s.findInLine("ab");
//		System.out.println(token);
//	}while(token != null);
	
	 s.findInLine("ab");
	MatchResult result = s.match();
	System.out.println(result.group(1));
    for (int i=1; i<=result.groupCount(); i++)
        System.out.println(result.group(i));

	}

}
