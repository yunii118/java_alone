package ch06.sec00.example09;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	public double getCircumference() {
		return 2*(width+height);
	}

}
