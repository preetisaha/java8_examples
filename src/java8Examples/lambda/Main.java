package java8Examples.lambda;

public class Main {

	public static void main(String[] args) {
		
		// Created anonymous class based on from java7
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public int add(int a, int b) {
				
				return a+b;
			}
		};
		
		//created lambda based on java8 for the following interface
		// It is possible because "MyInterface" has only one method
		MyInterface myInterfaceLembda = (a,b) -> a+b;
		
		//calling "passLambda" and passing a lambda function to a method call
		passLambda((a,b) -> a+b+1);
		
	}
	
	static void passLambda(MyInterface myInt){
		
	}

}
