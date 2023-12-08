package ch02.sec02.exam08;

public class BooleanExample {
	public static void main(String[] args) {
		Boolean stop = false; // 프로그램은 처음시작할때 보통 bool값은 false로 초기화
		int choice = (int)(Math.random() * 2);
		if(choice == 1) {
			stop = true;
		}
		else
			stop = false;
		
		
		if(stop) {
			System.out.println("프로그램을 종료합니다.");
		}
		else {
			System.out.println(" 프로그램을 시작합니다.");
		}
	}

}
