package ch06.sec00.example03;

public class Circle {
	
	public double radius;
	public static double PI = 3.14;
	public double height;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	

}
