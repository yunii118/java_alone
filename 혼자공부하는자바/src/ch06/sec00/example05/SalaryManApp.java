package ch06.sec00.example05;

public class SalaryManApp {
	

	public static void main(String[] args) {
		SalaryMan sal = new SalaryMan(2_000_000);
		System.out.println(sal.getAnnualGross());
		
		SalaryMan sal1 = new SalaryMan();
		System.out.println(sal1.getAnnualGross());
		

	}

}



