package java8Examples.defaultMethod;

public interface MyInterface {

	public int add(int a, int b);
	
	public default int multiply(int a, int b){
		return a*b;
	}
}
