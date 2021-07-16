
public class Test01 {
	
	
	public static void m1()  //method definition 
	{  
		System.out.println("m1 is executed");
		//m2(5); Cannot make a static reference to the non-static method m2(int) from the type Test01
		//m1(); static method execute first before the main start Execute until stack overflow==>
		//(Exception in thread "main" java.lang.StackOverflowError)
	}
	
	//doesn't have memory without static keyword
	void m2(int x)  // parametarized constructor & method definition
	{
		System.out.println(x);
		System.out.println("m2 is executed");
		m1();
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		//m2(5); //Cannot make a static reference to the non-static method m2(int) from the type Test01
		Test01 t1 =new Test01();
		t1.m2(5);
		System.out.println("main end");
		
	}

}
