package ch08.sec01.exam03;

public class Audio implements RemoteControl {
	
	private int volume;
	
	public void turnOn() {
		System.out.println("오디오 전원을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("오디오 전원을 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재 볼륨 : "+ this.volume);
	}

}
