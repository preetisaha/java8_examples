package javaExamples.anonymousClass;

public class Main {

	public static void main(String[] args) {

		MyInterface myInterface = new MyInterface() {
			
			@Override
			public int sub(int a, int b) {
				return a-b;
			}
			
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		
		MyInterface myInterface2 = new MyInterface() {
			
			@Override
			public int sub(int a, int b) {
				return a-b-1;
			}
			
			@Override
			public int add(int a, int b) {
				return a + b -1;
			}
		};
		
		//Created anonymous object of an interface and calling method on that object
		System.out.println(myInterface.add(20, 10));
		System.out.println(myInterface.sub(20, 10));
		
		//Created another anonymous object of the same interface having a different behavior and 
		//calling method on that object
		System.out.println(myInterface2.add(20, 10));
		System.out.println(myInterface2.sub(20, 10));
	}

}
