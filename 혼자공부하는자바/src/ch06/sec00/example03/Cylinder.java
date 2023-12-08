package ch06.sec00.example03;

public class Cylinder {
	
	Circle cir;
	double height;
	
	
	
	public void setHeight(double height) {
		this.height = height;
	}
	public Cylinder(Circle cir, double height) {
		this.cir = cir;
		this.height = height;
	}
	public double getCylinder() {
		return cir.getArea() * height;
	}
	
	
	
	public static void main(String[] args) {
		Circle circle = new Circle(2.8);
		double height = 5.6;
		
		Cylinder cyl = new Cylinder(new Circle(2.8), 5.6);
		
		
		System.out.println("넓이 : "+circle.getArea());
		System.out.println("부피 : "+circle.getArea()*height);
		System.out.println("부피 : "+cyl.getCylinder());

	}

}

