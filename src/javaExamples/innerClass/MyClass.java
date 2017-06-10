package javaExamples.innerClass;

public class MyClass {
	
	private int var;
	private static int staticVar = 200;
	
	public MyClass(int var) {
		this.var = var;
	}
	
	public class MyInnerClass{
		
		public void printVar(){
			System.out.println(var);
		}
	}
	
	public static class MyStaticInnerClass{
		
		public void printStaticVar(){
			System.out.println(staticVar);
		}
	}
}
