class Example{
	static int a=10;
	int x=20;
	static void m1(){
		System.out.println("SM M1() Executed="+a);
		Example e=new Example();
		//System.out.println("value of x="+x);
		System.out.println("The value of x="+e.x);
		e.m2();
	}
	void m2() {
		System.out.println("Non static method a="+a);
		
		System.out.println("Non static method x="+x);
	}
	static void m3() {
		m1();
	}
}

public class Test05 {
	public static void main(String[] args) {
		Example em=new Example();
		em.m3();
		em.m2();
	}

}
