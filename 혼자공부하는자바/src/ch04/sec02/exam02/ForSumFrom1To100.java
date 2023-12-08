package ch04.sec02.exam02;

public class ForSumFrom1To100 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1+...+100 = "+sum);
		
		sum = 0;
		for(int i = 1;i<=100;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
