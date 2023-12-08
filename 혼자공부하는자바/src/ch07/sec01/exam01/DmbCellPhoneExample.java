package ch07.sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellphone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("보라색", "자바폰",6);
		
		
		//dmbCellPhone 작동
		
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);
		System.out.println("채널 : "+dmbCellPhone.channel);
		String msg = """
				현재 DmbCellPhone클래스는
				cellPhone클래스로부터 상속(extends)받았으나
				아무것도 추가한 것이 없습니다.
				""";
		System.out.println(msg);
		// 전원 온오프 가능한가?
		dmbCellPhone.powerOn();
		// 전화 벨소리가 들릴수 있나?
		dmbCellPhone.bell();
		// 메세지를 주고받을수 있나?
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요");
		// 통화를 종료할 수 있나?
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
