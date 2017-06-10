package java8Examples.defaultMethod;

public class Main {

	public static void main(String[] args) {

		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		
		//"classA" inheriting "MyInterface" and implementing "add" method.
		System.out.println(classA.add(20, 30));
		
		//classA inheriting MyInterface and using default "multiply" method from the interface
		System.out.println(classA.multiply(20, 30));
		
		//classB is inheriting MyInterface and overriding "add" method
		System.out.println(classB.add(20, 30));
		
		//classB is inheriting MyInterface and overriding "multiply" method
		System.out.println(classB.multiply(20, 30));
	}

}
