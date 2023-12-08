package ch04.sec02.practice;

import java.util.Scanner;

public class bankWhile {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			String choice = scann.nextLine();
			switch(choice) {
				case "1":
					System.out.print("예금액 > ");
					String plus = scann.nextLine();
					balance += Integer.parseInt(plus);
					break;
				case "2":
					System.out.print("출금액 > ");
					String minus = scann.nextLine();
					if(Integer.parseInt(minus)>balance) {
						System.out.println("잔액이 부족합니다. 초기화면으로 돌아갑니다.");
						break;
					}
					else {
						balance -= Integer.parseInt(minus);
						break;
					}
					
				case "3":
					System.out.println("잔고 > "+balance);
					break;
				case "4":
					System.out.println();
					System.out.println("프로그램 종료");
					run = false;
					break;
			}
		}
		

	}

}
