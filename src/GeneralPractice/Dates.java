package GeneralPractice;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Dates {
	public static void main(String s[])
	{
		Date d = new Date();
		
		Calendar c =Calendar.getInstance(new Locale("en"));
		//Calendar c =Calendar.getInstance(Locale.);
		System.out.println(c.HOUR_OF_DAY);
		//System.out.println(c);
		//System.out.println(d);
		
		
		Calendar cal = Calendar.getInstance(Locale.CANADA);

	      System.out.println("Date And Time in Canada Is: " + cal.getTime());
	}

}
