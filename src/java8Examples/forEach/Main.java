package java8Examples.forEach;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 5, 6, 7, 3, 4, 6, 2, 4, 6));
		
		//Iterating list with "forEach" method which is much better than iterator because there is no
		// need to create an object and a for/while loop. Rather we can simply use the lambda function for computation.
		list.forEach((a) -> {
			System.out.println(a * 10);
		});

	}

}
