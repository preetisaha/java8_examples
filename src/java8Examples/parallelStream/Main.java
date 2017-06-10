package java8Examples.parallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

		
		//parallel stream for map function enforces the lambda function provided over multiple values at a same time
		//using thread in a stream. And returns a new stream containing the transformed values. Having println inside lambda
		//function shows out of order due to multiple threads.
		List<Integer> outputList = inputList.
				parallelStream().
				map(
						(a) -> {System.out.println((a));
							return a * 10;
						}
				).
				collect(Collectors.toList());
		
		//filter function enforces the lambda function provided over multiple value in a stream and returns a boolean.
		//The filter function returns a stream containing all the values for which the lambda function returns a true.
		List<Integer> filterList = outputList.
				parallelStream().
				filter(
						(x) -> {
							return (x % 2 == 0);
						}
				).collect(Collectors.toList());
		
		// reduce function enforce lambda function to take 2 input parameters.
		// reduce function return a single entity after reducing the whole list.
		Optional<Integer> totalSum = inputList.parallelStream().reduce((i, j) -> {
			return i+j;
		});
	}

}
