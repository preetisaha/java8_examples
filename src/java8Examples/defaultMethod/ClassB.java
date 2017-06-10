package java8Examples.defaultMethod;

public class ClassB implements MyInterface{

	@Override
	public int add(int a, int b) {
		
		return a+b+23;
	}
	
	public int multiply(int a, int b){
		return a*b*10;
		
	}

}
