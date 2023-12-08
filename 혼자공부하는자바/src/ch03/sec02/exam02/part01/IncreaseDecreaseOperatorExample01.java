package ch03.sec02.exam02.part01;

public class IncreaseDecreaseOperatorExample01 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		// 구분선 출력
		System.out.println("--------------------------------------");
		System.out.println("증가연산 전 기본값 x : "+ x);
		x++;
		System.out.println("후치증가연산 x++ : "+x);
		++x;
		System.out.println("전치증가연산 ++x : " + x);
		
		System.out.println("--------------------------------------");
		System.out.println("감소연산 전 기본값 y : "+ y);
		y--;
		System.out.println("후치감소연산 y-- : "+y);
		--y;
		System.out.println("전치감소연산 --y : " + y);
		
		

	}

}
