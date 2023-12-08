package ch03.sec02.exam02.part03;

public class IncreaseDecreaseOperatorExample02 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z = 0;
		
			System.out.println("------------복합증감연산--------------");
			
			
			System.out.println("복합증감연산 전 기본값 z = "+z);
			System.out.println("복합증감연산 전 기본값 x = "+x);
			System.out.println("복합증감연산 전 기본값 y = "+y);
			
				
			System.out.println("z = ++x + y++ 연산 후==>");
			z = ++x + y++ ; 
			// 위 연산식은
			// z = ++x + y;
			// y = y+1;
			// 로 진행됨
			
			// 실행순서
			/// 먼저 대입연산자는 하나의 연산식에서 마지막 실행
			/// ++x 연산식은 하나로 보고 항상 먼저 계산
			/// y++ 연산식은 y 포함 연산 후에 마지막에 y=y+1
			/// y++ 은 y관련 연산식 y=y+1; 로 두개의 문장임
			System.out.println("복합증감연산 후 z = "+z);
			System.out.println("복합증감연산 후 x = "+x);
			System.out.println("복합증감연산 후 y = "+y);
			
			
		
	}

}
