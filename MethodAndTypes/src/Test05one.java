class Example1{  // in one 1 package you can give same class name because it will create same .class file
				// this class is already defined
   				
	int x=20;		// non static variable 
	void m1() 		// Non static method 
	{    
		
		System.out.println(x);	// dynamic code (this.x) use
		//int x=35;
		//Example e4= new Example();
		//int x=35;
		//System.out.println(e4.x); // static code // enable above line and think about the answer
	}
	
}
public class Test05one {
	public static void main(String[] args) {
		
		Example1 e1=new Example1();			 
		e1.m1();						// call non static variable by using non static method 
		
		Example1 e2=new Example1();
		e2.x=9;
		e2.m1();        				// e1 called current object of method m1(); 
										//Static nature of code read value from e2 object only 
		
		Example1 e3=new Example1();
		e3.x=15;
		e3.m1();						// e2 called current object of method m1();
		
		Example e= new Example();
		System.out.println(e.x);		// e called current object with example class variable x=20
	
		//System.out.println(x);		// this will give compiler error x cannot be resolved to a variable

		int x=30;
		System.out.println(x);			// think the answer 		
		
	}

}
