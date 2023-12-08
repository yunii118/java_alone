package ch03.sec02.practice;

public class num4 {

	public static void main(String[] args) {
		int pancils = 534;
		int students = 30;
		
		int pencilsPerStudents = pancils/students;
		System.out.println("한 학생당 가지는 연필은 "+ pencilsPerStudents+"자루 입니다.");
		int pencilsLeft = pancils%students;
		System.out.println("남는 연필은 "+pencilsLeft+"자루 입니다.");

	}

}
