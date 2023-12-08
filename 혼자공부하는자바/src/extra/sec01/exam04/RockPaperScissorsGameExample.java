package extra.sec01.exam04;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGameExample {
	public static void main(String[] args) {
		int GAME_ROCK = 1;
		int GAME_SCISSORS = 2;
		int GAME_PAPER = 3;
		boolean keep = true;
		int playerWinCount = 0;
		int computerWinCount = 0;
		
		System.out.print("가위(2), 바위(1), 보(3) 중 하나를 입력해 주세요.(게임 중지 : 0)>");
		Scanner scann = new Scanner(System.in);
		Random rnd = new Random();
		while(keep) {
			int player = scann.nextInt();
			if(player==0) {
				keep = false;
			}
			else {
			int computer = Math.abs(rnd.nextInt()%3)+1;
			int result = player - computer;
		
			switch(result) {
			case -1: case 2:{
				System.out.println("computer : "+computer);
				System.out.println("플레이어가 이겼습니다.");
				playerWinCount++;
				
				break;
			}
			case 1: case -2:{
				System.out.println("computer : "+computer);
				System.out.println("컴퓨터가 이겼습니다.");
				computerWinCount++;
				
				break;
			}
			case 0:
				System.out.println("computer : "+computer);
				System.out.println("비겼습니다.");
				
			}
			System.out.println("플레이어:컴퓨터 = "+playerWinCount+":"+computerWinCount);
		}
	}

}
}