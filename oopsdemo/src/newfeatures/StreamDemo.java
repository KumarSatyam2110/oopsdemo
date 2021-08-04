package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<String> city=Arrays.asList("Delhi","mumbai","Dhanbad","Patna","Daman");
		
		//sorting elements using stream
		city.stream().sorted().forEach(System.out::println);
		
		System.out.println();
		
		//operation by creating a stream
		city.stream().filter(s -> s.startsWith("D")).map(String::toUpperCase)
		.sorted().forEach(System.out::println);
		
		List<String> bCity=city.stream()
								.filter(s -> s.startsWith("D"))
								.map(String::toUpperCase)
								.collect(Collectors.toList());
		System.out.println(bCity);
		System.out.println();
		bCity.forEach(c -> System.out.println(c)); //print list using lambda expression
		
		// displays nos from 1-10 with streams
				IntStream.range(1,10).forEach(i->System.out.println(i));
				
				System.out.println();
				IntStream.rangeClosed(1,10).forEach(i->System.out.println(i));
				
				// sum of array elements using streams
				int[] numbers= {1,2,3,4,5,6,7,8,9,10};
				
				// reduce
				int sum= Arrays.stream(numbers).reduce(0, (a,b) -> a + b);
				System.out.println("Sum of array is :"+sum);			

	}

}
