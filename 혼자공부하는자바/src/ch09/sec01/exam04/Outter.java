package ch09.sec01.exam04;

public class Outter {
	
	public void method2(final int arg) {
		final int localVariable = 1;
		// arg = 100;
		//localVariable = 100;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	

}
