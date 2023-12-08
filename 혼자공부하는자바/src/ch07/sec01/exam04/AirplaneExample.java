package ch07.sec01.exam04;

public class AirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane airplane = new SupersonicAirplane();
		airplane.takeOff();
		airplane.fly();
		airplane.land();
		
		 
		airplane.setFlyMode(airplane.SUPERSONIC);
		airplane.takeOff();
		airplane.fly();
		airplane.land();
		

	}

}
