package ch01.sec02.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		// 교환하기 전 x, y값 출력
		System.out.println("x : "+x+", y : "+y);
		
		// x와y 교체
		int temp = x;  // temp에 x값 대입
		x = y;		   // x에 y값 대입
		y = temp;	   // temp에 저장되어있던 x값 y에 대입
		
		System.out.println("x : "+x+", y : "+y);

	} // end of main

} // end of VariableExchangeExample.class
