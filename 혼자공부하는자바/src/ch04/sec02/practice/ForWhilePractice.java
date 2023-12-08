package ch04.sec02.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ForWhilePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("첫번째 정수를 입력 : ");
		int i = scan.nextInt();
		System.out.println("두번째 정수를 입력 : ");
		int j = scan.nextInt();
		System.out.println("세번째 정수를 입력 : ");
		int k = scan.nextInt();
		
		int[] arr = {i, j, k};
		int a = 0;
		int b = 0;
		while(a <=2) {
			if(arr[a]>=b) {
				b = arr[a];
			}
			a++;
		}
		System.out.println("최대값은 "+ b+"입니다.");
		
		for(int c = 0;c<arr.length-1;c++) {
			if(arr[c]>arr[c+1]) {
				int temp = arr[c];
				arr[c+1] = arr[c];
				arr[c] = temp;
			}
		}
		System.out.println("최대값은 "+ arr[2]+"입니다.");
		
		int[] answer = {i, j, k};
		Arrays.sort(answer);
		System.out.println("최대값은 "+ answer[2]+"입니다.");
							
		

	}

}
