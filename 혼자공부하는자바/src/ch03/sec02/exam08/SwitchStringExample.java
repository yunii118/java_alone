package ch03.sec02.exam08;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("직급을 입력해주세요.>");
		
		String position = scan.nextLine();
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}

	}

}
