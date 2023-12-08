package ch05.sec02.exam04.ex4;

public class DiceCount {

	public static void main(String[] args) {
		// 1. 주사위의 눈금 수를 기호상수로 정의
		// 나중에 눈금 수가 변하더라도 프로그램 코드 고칠필요 없음
		final int diceLength = 6;
		// 주사위를 던져서 나온 눈의 횟수 측정할 변수 count 선언
		//각 주사위 눈을 얻어내는 방식 동일하므로 배열이 적격
		
		int[] count = new int[diceLength];
		// 3. 각 주사위 눈을 구하기위해 주사위를 반복해서 던져야함. 반복문이 적격
		int i = 0;
		while(i<=100000000) {
			// 주사위 눈금은 난수 구하는 Math.random() 사용
			int dice = (int)(Math.random()*6)+1;
			count[dice-1]++;
			i++;
		}
		String msg = """
				================
				면 	빈도
				================
				%d	%d
				%d	%d
				%d	%d
				%d	%d
				%d	%d
				%d	%d
				
				
				""";
		
		msg = msg.formatted(1, count[0], 2,count[1], 3, count[2], 4, count[3], 5, count[4], 6, count[5]);
		System.out.println(msg);

	}

}
