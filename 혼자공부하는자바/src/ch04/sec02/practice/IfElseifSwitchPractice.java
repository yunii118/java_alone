package ch04.sec02.practice;

import java.time.LocalDateTime;



public class IfElseifSwitchPractice {

	public static void main(String[] args) {
		
		// 오늘 날짜 구하기
		// LocalDateTime 이라는 라이브러리 필요
		// LocalDateTime.now() method로 오늘날짜 구할수 있음
		LocalDateTime now = LocalDateTime.now();
		int month = now.getMonthValue();
		
		// 자바 17부터 적극적으로 권장하는 문자열 표기법
		/// 프론트 언어에서는 템플릿 문자열이라고 부르는
		// multi_line String
		// """로시작하고 """로 닫
		// 대표적 사용 예
		/*
		 * String sqlSelect = "SELECT" +
		 * 						"	*"+
		 * 						"FROM "+
		 * 						"  user" +
		 * 						"WHERE "+
		 * 						"	id=" + id;
		 * 
		 * String multiText = """안녕하세요
		 * 만나서				반갑습니다.
		 *Hello!
		 *		Nice to
		 *				meet
		 *			you""";
		 */
		
		
		switch(month/3) {
			case 1:
				System.out.println(month+"월은 봄입니다.");
				break;
			case 2: 
				System.out.println(month+"월은 여름입니다.");
				break;
			case 3 :
				System.out.println(month +"월은 가을입니다.");
				break;
			case 4: case 0:
				System.out.println(month+"월은 겨울입니다.");
				break;
		}
		
		
		// 계절을 상수이름으로 식별하기 쉽게 만듦
		final int SEASON_SPRING = 0;
		final int SEASON_SUMMER = 1;
		final int SEASON_FALL = 2;
		final int SEASON_WINTER = 3;
		
		// 사계절 이름을 배열로 선언 및 초기화
		// seasons배열 변수 현재 만들어지면서
		// 봄/여름/가을/겨울의 힙을
		// 바로 가리키고 있음
		String[] seasons = new String[] {
				"봄", "여름", "가을", "겨울"
		};
		
		seasons = null;
		//영어로 출력하기 원해서 새로운 힙창고에
		
		
		// 새로운 String[4] 크기의 스트링 배열 생성
		// 데이터는 "Spring, summer, fall, winter"로 초기화
		// {}안의 초기화 데이터로 배열 크기 알수있음
		seasons = new String[] {
			"Spring", "Summer", "Fall", "Winter"
		};
		
		String msg = """ 
				%s월은 %s입니다.
				""";
				
		/// 월에 따라 출력메세지를 만듦
		msg = msg.formatted(month, seasons[SEASON_FALL]);
		/// msg 출력문자열을 화면에 출력
		System.out.println(msg);
		

	}

}
