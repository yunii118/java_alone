package ch11.sec01.exam08;

import ch06.sec02.exam01.Car;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		// 첫번째 방법
		//Class clazz = Car.class;
		
		// 두번째 방법
		//Class clazz = Class.forName("ch06.sec02.exam01.Car");
		
		// 세번째 방법
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());

	}

}
