package ch06.sec00.example10;

public class Computer {
	public static final String[] osType = {"윈도우7", "애플 OS X", "안드로이드"};
	private int memory;
	private int OS;
	
	Computer(int OS, int memory){
		this.OS = OS;
		this.memory = memory;
	}
	
	public void print() {
		System.out.printf("운영체제 : %s, 메인메모리 : %d\n", osType[this.OS], this.memory);
	}
		
	

}
