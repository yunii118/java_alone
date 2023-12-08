package ch06.sec00.example06;

import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Account player = new Account();
		System.out.println("사용자 성함을 입력하세요.");
		player.setOwner(scan.nextLine());
		System.out.println("사용자의 현재 잔액을 입력하세요.");
		player.setBalance(scan.nextLong());
		
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("1. 입금 2. 출금 3. 종료");
		int choice = scan.nextInt();
		boolean run = true;
		while(run) {
			switch(choice) {
			case 1:
				System.out.println("입금 금액을 입력해주세요.");
				player.deposit(scan.nextInt());
				player.show();
				break;
			case 2:
				System.out.println("출금 금액을 입력해주세요.");
				player.withdraw(scan.nextInt());
				player.show();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}
		}
		

	}

}
