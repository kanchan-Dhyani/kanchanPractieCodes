package GeneralPractice;

import java.util.Comparator;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
		
		
		// Example 1 Stream.of()
		
		System.out.println(Stream.of("joey", "ana","smantha").filter(str -> str.length() > 3).count());
		
		
		// Example 2 print using foreach
		
		Stream.of("joey", "ana","smantha").filter(str -> str.length() > 3).forEach(str-> System.out.println(str));
		
		// Example 3
		
		String[] names = {"boi","charis","zooey","bokeh","Clover","aiko", };
		
		Stream.of(names).filter(str -> str.startsWith("c") ||  str.startsWith("C")).filter(str -> str.length() > 3).forEach(System.out::println);
		
		
		// MAP FILTER REDUCE
		
		Stream<Integer> intStr = Stream.of(38,37,41,35);
		System.out.println(intStr.map( i ->  55000*i/100).min(Comparator.comparing(Double::valueOf)).get());
		Stream.of(38,37,41,35).map( i ->  55000*i/100).forEach(System.out::println); // MAP Reduce
		
		
		Stream.of(38,37,41,35).filter(i-> i==35).map( i ->  55000*i/100).forEach(System.out::println); // filter map reduce
		
		
		
	}

}
