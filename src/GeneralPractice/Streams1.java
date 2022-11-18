package GeneralPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Streams1 {

	public static void main(String[] args) {
		// ex 1
		Integer[] x = {1,2,3,4,5,5};
		Stream<Integer> sOfx = Arrays.stream(x);
		sOfx = sOfx.distinct();
		
		Stream<Integer> sOfxN = sOfx.distinct();
		//System.out.print(sOfx);
		
		//System.out.print(sOfxN.toArray());
		
		// EXAMPLE 2 find numbers greater than 50
		
		Integer[] num = {45,34,12,56,23,67};
		Stream<Integer> numStr = Arrays.stream(num);
		//System.out.println(numStr.filter(i -> i>50).count());
		
		
		// EXAMPLE 3 find count of incorrect email id
		
		String[] emaiList = {"abc@gmail.com","fgh@gmail.com","auij@gmail.com","dfskdf"};
		System.out.println(Arrays.stream(emaiList).filter(str->{
			return !str.contains("@");
		}).count());
		
		
		// EXAMPLE 4 create stream from collection -LIST
		
		List<Integer> intList = Arrays.asList(3,4,7,8,9);
		System.out.println(intList.stream().filter(i -> i>4).count());
		
		
		// EXAMPLE 5 create stream from collection -MAp
		
		Map<String, Integer> names = new HashMap<String,Integer>();
		names.put("tom", 90);names.put("joy", 96);names.put("eva", 95);names.put("john", 92);
		
		System.out.println(names.entrySet().stream().filter(mark -> mark.getValue() >= 95 ).count());
		
		

	}

}
