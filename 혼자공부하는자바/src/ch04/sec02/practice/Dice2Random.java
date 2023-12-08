package ch04.sec02.practice;

public class Dice2Random {

	public static void main(String[] args) {
		
		int first = 0; 
		int second = 0;
		
		while((first+second)!=5) {
			first = (int)(Math.random()* 6)+1;
			second = (int)(Math.random()* 6)+1;
			
			System.out.println("현재 눈금은 ("+first+", "+second+") 입니다. 눈금의 합은 "+(first + second)+"입니다.");
		}

	}

}
