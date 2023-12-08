package ch06.sec00.settergetter;




public class Account {
	private int regNumber; // 계좌번호
	private String name; // 소유자
	private int balance; // 잔고
	
	
	
	Account(){
		
	}
	// 계좌번호는 불변해야함 
	public Account(int regNumber) {
		this.regNumber = regNumber;
		
	}
	
	// 속성함수 정의
	
	
	void setName(String name){
		this.name = name;
	}
	
	void setBalance(int balance){
		if(balance<0) {
			this.balance = 0;
		}
		else {
			this.balance = balance;
		}
	
		
	}
	// 읽기만 가능한 속성함수
	int getRegNumber() {
		return this.regNumber;
	}
	
	String getName(){
		return this.name;
	}
	
	int getBalance(){
		return this.balance;
	}

}
