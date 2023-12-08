package ch06.sec00.example05;

public class SalaryMan {
	private int salary;
	
	public SalaryMan() {
		this.salary = 1_000_000;
	}
	
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		
		return salary*17;
	}
}
