package ch07.sec01.exam01;

public class DmbCellPhone extends CellPhone{
	// 필드 추가
	//tv 기능을 의미하는 channel 변수 선언
	 int channel;
	 
	 // channel 변수를 초기화하기 위하여 생성자 추기
	 DmbCellPhone(
			 String model,
			 String color,
			 int channel){
		 this.model = model;
		 this.color = color;
		 this.channel = channel;
	 }
	 
	 void turnOnDmb() {
		 System.out.println("채널 "+channel+"번 DMB 방송 수신을 시작합니다.");
	 }
	 
	 void changeChannelDmb(int channel) {
		 this.channel = channel;
		 System.out.println("채널 "+channel + "으로 변경합니다.");
	 }
	 
	 void turnOffDmb() {
		 System.out.println("dmb를 종료합니다.");
	 }

}
