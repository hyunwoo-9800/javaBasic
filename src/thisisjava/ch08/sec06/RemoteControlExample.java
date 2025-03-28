package thisisjava.ch08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl rc;

		// rc변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		rc.setMute(true);
		rc.setMute(false);

		System.out.println();

		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();

		rc.setMute(true);
		rc.setMute(false);

		System.out.println();

		System.out.println("리모콘 최대 볼륨 = " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최저 볼륨 = " + RemoteControl.MIN_VOLUME);

		System.out.println();

		RemoteControl.changeBattery();

	} // main 끝

} // class 끝
