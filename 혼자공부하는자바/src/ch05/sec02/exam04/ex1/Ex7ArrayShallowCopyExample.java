package ch05.sec02.exam04.ex1;


//shallow copy : 얕은 복사
public class Ex7ArrayShallowCopyExample {

	public static void main(String[] args) {
		int[] list = {10, 20 ,30, 40 , 50};
		// 얕은 복사(shallow copy)
		
		int[] numbers = list;
		
		for(int number : list) {
			System.out.println(number);
		}
		
		System.out.println("=======================================");
		
		
		for(int num : numbers) {
			System.out.println(num);
		}
		
		System.out.println("=======================================");
		// numbers와 list 참조 비교
		if(list == numbers) {
			System.out.println("list배열과 numbers배열이 완전히 같습니다.");
			
		}
		else {
			System.out.println("list배열과 numbers배열이 다릅니다.");
			
		}
		
		// numbers와 list의 내용 비교
		if(list.equals(numbers)) {
			System.out.println("list배열과 numbers배열이 같습니다.");
			
		}
		else {
			System.out.println("list배열과 numbers배열이 다릅니다.");
			
		}
		// numbers와 list의 요소 비교
		for(int i = 0;i<list.length;i++) {
			if(list[i]==numbers[i]) {
				System.out.println("list배열과 numbers배열의 개별요소가 같습니다.");
			}
			else {
				System.out.println("list배열과 numbers배열의 개별요소가 다릅니다.");
				
			}
			
		}
		
		System.out.println("=======================================");
		// 데이터 객체의 정보 특징을 해쉬값으로 출력
		// 같으면 같은 힙을 참조하는것
		System.out.println(list.toString());
		System.out.println(numbers.toString());
		
		// list = null;

		// System.out.println(list.toString());
		// System.out.println(numbers.toString());
		
		// numbers 각 요소에 10을 곱하고
		// list를 프린트
		// 원본이 바뀌었나?아닌가?
		for(int i = 0;i<numbers.length;i++) {
			numbers[i] = numbers[i]*10;
			
			System.out.println(list[i]);
			System.out.println(numbers[i]);
		}
		
		
	}

}
