package ch06.sec00.settergetter;

public class AccountExample {

	public static void main(String[] args) {
		// Tom의 계정 하나 만듦
		Account tomAccount = new Account();
		tomAccount.setName("Tom");
		tomAccount.setBalance(100_000);
		System.out.println("이름은 "+tomAccount.getName()+
				" 통장잔고는 "+tomAccount.getBalance());
		
		
		// Jane의 계정 하나 만듦
		Account janeAccount = new Account();
		janeAccount.setName("Jane");
		janeAccount.setBalance(1_000_000);
		System.out.println("이름은 "+janeAccount.getName()+
				" 통장잔고는 "+janeAccount.getBalance());		
		
		// lili의 계정을 하나 만듦
		// 매개변수가 하나인 Account생성자메소드로
		// Account객체 초기화
		Account liliAccount = new Account(100010001);
		liliAccount.setName("lili");
		liliAccount.setBalance(-100000);
		System.out.println("계좌번호는 "+liliAccount.getRegNumber()+
				"이름은 "+liliAccount.getName()+
				" 통장잔고는 "+liliAccount.getBalance());	
		
		
	}

}
