package thisisjava.ch08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl rc;

		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true);
		rc.setMute(false);

		System.out.println();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true);
		rc.setMute(false);

		System.out.println();
		
		RemoteControl.changeBattery();
		
	} // main 끝

} // class 끝
