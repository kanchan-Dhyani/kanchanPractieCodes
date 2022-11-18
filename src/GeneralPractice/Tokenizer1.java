package GeneralPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer1 {

	public static void main(String[] args) {
		//System.out.println(" start");
		Pattern p = Pattern.compile("[cC]\\d[aA]\\d[tT]");
		Matcher m = p.matcher("aaac1a2TbbbC23bbbC4A5t");
		
		while (m.find()) {    
            System.out.println("I found the text "+m.group()+" starting at index "+    
             m.start()+" and ending at index "+m.end());    
            System.out.println(" found");
        }    
		System.out.println(m.groupCount());
		
//		String str= "Dance with me ana ddan";
//		int n = str.indexOf("an")+1;
//		System.out.println(str.indexOf("an", (str.indexOf("an",n)+1 )));

	}

}
