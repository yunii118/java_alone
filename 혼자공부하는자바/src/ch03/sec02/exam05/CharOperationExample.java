package ch03.sec02.exam05;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A'+1; // 값을 초기화 하는 과정에서는 형변환 일어나지 않음. 이때는 1도 char형
		char c2 = 'A';
		//char c3 = c2+1;
		
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		//System.out.println("c3 : "+c3);
	}

}
