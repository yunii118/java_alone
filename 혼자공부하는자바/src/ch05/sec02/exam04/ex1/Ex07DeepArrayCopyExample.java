package ch05.sec02.exam04.ex1;

import java.util.Arrays;

public class Ex07DeepArrayCopyExample {

	public static void main(String[] args) {
		// 원본배열
		int[] list = {10, 20, 30, 40, 50};
		
		// 복사본 배열
		// 깊은 복사는 
		// 1. 공간을 확보해야함
		// 2. 복사할 원본과 크기가 같아야 하므로 배열타입 크기많금
		// 		new 배열타입[원본의 배열 크기]으로 공간 확보가필요
		// 3. 루프를 통하여 원본의 개별요소를 복사본의 개별요소에 저장
		int[] numbers = new int[list.length];
		
		for(int i = 0;i<numbers.length;i++) {
			numbers[i] = list[i];
		}
		
		// 1. 원본과 복사본이 같은 주소를 참조하는지 확인
		// 배열의 내용 정보를 보여주는 toString 출력
		System.out.println(list.toString());
		System.out.println(numbers.toString());
		
		// 비교연산자를 사용하여 정확한 비교 해보기
		
		if(list == numbers) {
			System.out.println("list == numbers");
		}
		else {
			System.out.println("list !=numbers");
		}
		// 2. 두 배열의 인자 확인
		for(int i = 0;i<numbers.length;i++) {
			if(list[i]==numbers[i]) {
				System.out.println("list[i]==numbers[i]");
			}
			else
				System.out.println("list[i]!=numbers[i]");
		}
		
		// 3. 복사본의 내용을 변경하였을 때 원본에도 영향이 있는지
		for(int i = 0;i<numbers.length;i++) {
			numbers[i] = 0;
		}
		// 4. 두배열의 내용 출력
		for(int num : list) {
			System.out.println(num);
		}
		for(int num : numbers) {
			System.out.println(num);
		}
		
		

	}

}
