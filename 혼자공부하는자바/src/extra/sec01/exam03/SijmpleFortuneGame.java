package extra.sec01.exam03;

// 오늘의 날짜를 얻어야함.
// java.util.date 라이브러리 패키지에 있음
// import java.util.Date 라이브러리 가져옴
import java.util.Date;
//오늘의 운세를 랜덤 정수로 판별
// random 라이브러리 필요
// java.util.Random 패키지 사용
import java.util.Random;
//날짜는 각 나라마다 출력형식이 다름
// 따라서 출력 형식을 지정할 필요가 있음
// 날짜 출력 형식 지정 클래스는 java.text.SimpleDateFormat
import java.text.SimpleDateFormat;

 class SijmpleFortuneGame {
	public static void main(String[] args) {
		// 포춘게임 만드는 방법
		// 1. 오늘 날짜를 얻는다.(today = new Date())
		Date today = new Date(); 		
		// 2. 날짜 객체를 현재 국가에 따라 다르게 표시
		// SimpleDateForamt("yyyy년 MM월 dd일")
		// 이 객체는 문자열을 return
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		// 3. 위의 오늘의 날짜를 어떻게 한국식으로 출력할 것인가?
		System.out.println(dateFormat.format(today));
		// 4. 오늘의 운세를 얻어야함. 
		// 난수를 0~100 사이의 숫자를 구해서 이 숫자가 운세 백분율을 의미하도록
		Random rnd = new Random();
		// random.nextInt() % 100 : 임의의 수를 100으로 나눈 나머지를구함. 이는 음수도 나올수가 있음
		// Math.abs(변환숫자) : 변환숫자를 무조건 양수로 반환
		int randomNum = Math.abs(rnd.nextInt() % 100)+1; // 1~100%
		// 행운의 내용 출력
		System.out.println("금전운(100%) : " + randomNum+"%");
		
	
	}

}
