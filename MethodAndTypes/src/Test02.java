
abstract class A{
	abstract void m1();       //method declaration
	
	 void m2() {				  //method definition 
		System.out.println("m2 is executed from class A");
	}
	
	void m3() {					// method definition(declaration+ implementation)
		System.out.println("m3 is executed from class A");
	}
	
	void m3(int x) {					// method  overloading(same name with the diff parameters)
		System.out.println("m3(int) is executed from class A");
	}
	
	void m3(String x) {					// method overloading(same name with the diff parameters)
		System.out.println("m3(string) is executed from class A");
	}
	
	 static void m4() {
		System.out.println("m4() is executed from class A");
	}
	
}
 
 class B extends A{  // if in the class B have no m1() implementation give error
	                //The type B must implement the inherited abstract method A.m1()
	
	void m1() {			// method implementation of m1() ( writing logic for super class in sub class first time)
		System.out.println("m1 is executed from class B");
	}
	 
	void m3() {				// method overriding (changing super class method logic in subclass)
		System.out.println("m3(no parameter) is executed from class B");
	}
	
	void m3(double x) {				// method overloading (new method same name with diff parameters)
		System.out.println("m3(double) is executed from class B");
	}
	
	static void m4() {         //method hiding
		System.out.println("m4(method hiding) is executed from class B");
	
	}
}
 /*
  1)you can overload a method in super and sub class also 
  2)you can override a method in(from) only subclass
 */
 
public class Test02 {

	public static void main(String[] args) {
		System.out.println("Main start");
		//A a1=new A();   A is abstract;cannot be instantiated
		B b1=new B();
		b1.m1();
		b1.m2();
		
		b1.m3();
		b1.m3(5); 
		b1.m3("a");
		b1.m3(5.7 );
		b1.m4();
		System.out.println("Main end");
	}

}
