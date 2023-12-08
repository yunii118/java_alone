package ch01.sec02.exam02;

public class ValuableUseExample {
	public static void main(String[] args) {
		int hour;	
		hour = 3;
		int minute;	
		minute = 5; 
		
		// 현재 설정된 시간 출력
		System.out.println(hour+"시간 "+minute+"분"); 
		
		int total_minute;
		total_minute = (60 * hour) + minute; 
		
		// 총 몇분인지 출력
		System.out.println("총 "+total_minute+"분");
		
	} // end of main
	

} // end of ValuableUseExample.class

