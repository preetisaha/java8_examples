package javaExamples.innerClass;


public class Main {

	public static void main(String[] args) {

		MyClass myClass = new MyClass(10);
		MyClass.MyInnerClass myInnerClass = myClass.new MyInnerClass();
		
		// Inner class method is accessing the outer class variable over which it was initiated 
		myInnerClass.printVar();
		
		MyClass myClass2 = new MyClass(20);
		MyClass.MyInnerClass myInnerClass2 = myClass2.new MyInnerClass();
		
		myInnerClass2.printVar();
		
		MyClass.MyStaticInnerClass myStaticInnerClass = new MyClass.MyStaticInnerClass();
		
		/* Static class does not required any outer class object, it can access all the static 
		properties inside the outer class*/
		myStaticInnerClass.printStaticVar();
	}

}
