package ch06.sec00.example06;

import java.util.Scanner;

public class Account {
	private String owner;
	private long balance;
	
	public Account() {
		
	}
	public Account(long balance) {
		this.balance = balance;
	}
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void  setBalance(long balance) {
		this.balance = balance;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public long getBalance() {
		return this.balance;
	}
	
	public long deposit(long amount) {
		System.out.println(amount+"만큼 입금합니다.");
		return this.balance+= amount;
	}
	
	public long withdraw(long amount) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 "+this.owner+"님은 최대 "+this.balance+"원 출금하실수 있습니다.");
		if(this.balance>=amount) {
			return this.balance -=amount;
		}
		else {
			System.out.println("잔고가 부족합니다. 최대 "+this.balance+"원 출금할 수 있습니다.");
			System.out.println("전액을 출금하시겠습니까? (y/n)");
			String[] se = {"y", "n"};
			String re = sc.nextLine();
			if(re.equals(se[0])){
				amount = this.balance;
				return this.balance-=amount;
				
			}
			else {
				return -1;
			}
			
			
		}
	}
	
	void show() {
		System.out.println("현재 "+this.balance+"원 가지고 있습니다.");
	}
	
	
	
	
}
