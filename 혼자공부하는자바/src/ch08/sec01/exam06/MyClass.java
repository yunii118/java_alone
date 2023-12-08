package ch08.sec01.exam06;

import ch08.sec01.exam03.Audio;
import ch08.sec01.exam03.RemoteControl;
import ch08.sec01.exam03.Television;

public class MyClass {
	
	// 필드
	RemoteControl rc = new Television();
	
	
	// 생성자
	MyClass(){
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
		
	}

}
