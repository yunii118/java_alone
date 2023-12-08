package ch07.sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		// 반지름 10
		int r = 10;
		
		// calculator 객체 생성
		Calculator calculator = new Calculator();
		System.out.println(
				"Calculator의 원면적 : "+calculator.areaCircle(r));
		
		// computer 객체 생성
		Computer computer = new Computer();
		System.out.println(
				"Computer의 원면적 : "+computer.areaCircle(r));

	}

}
