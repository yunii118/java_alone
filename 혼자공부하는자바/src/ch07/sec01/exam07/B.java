package ch07.sec01.exam07;

public class B extends A {
	
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
