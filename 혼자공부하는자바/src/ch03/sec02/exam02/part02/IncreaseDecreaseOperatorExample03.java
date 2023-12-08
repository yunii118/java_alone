package ch03.sec02.exam02.part02;

public class IncreaseDecreaseOperatorExample03 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		// 증감연산자와 다른 변수의 상호작용
				System.out.println("--------------------------------------");
				z = x++; // z=x 먼저 실행 후 x +1
				
				System.out.println("z = "+z);
				System.out.println("x = "+x);
				
				System.out.println("--------------------------------------");
				z = ++x; // 전치증가연산 = x+1먼저 실행 후 z=x
				
				System.out.println("z = "+z);
				System.out.println("x = "+x);
				
				System.out.println("--------------------------------------");
				z = y--; // z=x 먼저 실행 후 y -1
				
				System.out.println("z = "+z);
				System.out.println("y = "+y);

				System.out.println("--------------------------------------");
				z = --y; // 전치증가연산 = y-1먼저 실행 후 z=y
				
				System.out.println("z = "+z);
				System.out.println("y = "+y);
		
	}

}
