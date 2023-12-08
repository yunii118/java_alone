package ch04.sec01.exam05;

public class SwitchExample {
	public static void main(String[] args) {
		// 주사위 눈금 난수 생성
		int num = (int)(Math.random()*6+1);
		String msg = "번이 나왔습니다.";
		
		// num 변수와 case값이 일치하는 것을 찾는다.
		// 크다. 작다 비교는 불가
		// 해당하는 case 실행 후 반드시 break;
		// 실행의 끝을 나타냄
		
		switch(num) {
		case  1:{
			msg = num + msg;
			break;
		}
		case  2:{
			msg = num + msg;
			break;
		}
		case  3:{
			msg = num + msg;
			break;
		}
		case  4:{
			msg = num + msg;
			break;
		}
		case  5:{
			msg = num + msg;
			break;
		}
		case  6:{
			msg = num + msg;
			break;
		}
		default:
			break;
		}
		System.out.println(msg);
		
	}

}
