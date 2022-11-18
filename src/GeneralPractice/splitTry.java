package GeneralPractice;

public class splitTry {

	public static void main(String[] args) {
		
		String str = "aaaaa$45bbb bbRs67cccc";
		String[] list = str.split(" ");
		
		for(String row : list)
		{
			System.out.print("<"+row+ ">");
		}
		
	}

}



