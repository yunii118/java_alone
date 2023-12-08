package ch07.sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-2345661", 1);
		
		// 홍길동 학생의 정보 출력
		// Student 클래스는 직접적으로 name, ssn을 가지고 있진 않지만
		// 부모클래스를 통해 상속받고 있음
		
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		System.out.println("studentNo : "+student.studentNo);

	}

}
