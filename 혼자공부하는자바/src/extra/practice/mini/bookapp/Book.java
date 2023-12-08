package extra.practice.mini.bookapp;

import java.util.Scanner;

public class Book {
	
	Book(){
		
	}
	void showMain(){
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("Welcome to the Library");
			System.out.println("[1] 도서 등록   [2] 전체 조회   [3] 개별 조회   [4] 책 정보 수정"+
								"   [5] 책 삭제      [6] 도서 반납 및 대여   [0] 종료");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");	
			}
		}

	}
	
	void bRegi() {
		
	}

	


}
