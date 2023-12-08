package ch13.sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		Student student = new Student(2, "kkk");
		
		
		map.put(student, 95);
		
		map.replace(student, 95, 96);
		System.out.println(map.get(student));
		

	}

}
