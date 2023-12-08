package ch04.sec02.exam06;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.println(i++);
			
		}
		
		i = 1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
		i = 1;
		while(i<=10) {
			System.out.printf("%d \n", i++);
		}

	}

}
