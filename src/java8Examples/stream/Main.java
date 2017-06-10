package java8Examples.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(4, 6, 7, 8, 9, 4, 2, 3, 4, 5, 6));

		
		//map function enforces the lambda function provided over each value in a stream. 
		//And returns a new stream containing the transformed values.
		List<Integer> outputList = inputList.
				stream().
				map(
						(a) -> {
							return a + 10;
						}
				).
				collect(Collectors.toList());
		
		//filter function enforces the lambda function provided over each value in a stream and returns a boolean.
		//The filter function returns a stream containing all the values for which the lambda function returns a true.
		List<Integer> filterList = outputList.
				stream().
				filter(
						(x) -> {
							return (x % 2 == 0);
						}
				).collect(Collectors.toList());
		
		
		// reduce function enforce lambda function to take 2 input parameters.
		// reduce function return a single entity after reducing the whole list.
		Optional<Integer> totalSum = inputList.stream().reduce((i, j) -> {
			return i+j;
		});
	}
}

