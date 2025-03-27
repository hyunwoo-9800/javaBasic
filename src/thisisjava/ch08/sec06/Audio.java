package thisisjava.ch08.sec06;

public class Audio implements RemoteControl {

	private int volume;
	private int memoryVolume;

	// 메서드 오버라이딩
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

		System.out.println("Audio를 켭니다.");

	}

	// 메서드 오버라이딩
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

		System.out.println("Audio를 끕니다.");

	}

	// 메서드 오버라이딩
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

		if (RemoteControl.MAX_VOLUME < volume) {

			this.volume = RemoteControl.MAX_VOLUME;

		} else if (volume < RemoteControl.MIN_VOLUME) {

			this.volume = RemoteControl.MIN_VOLUME;

		} else {

			this.volume = volume;

		}

		System.out.println("현재 Audio 볼륨 = " + this.volume);

	}

	// 메서드 오버라이딩
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub

		if (mute) {

			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);

		} else {

			System.out.println("무음 해제합니다.");
			setVolume(memoryVolume);

		}
	}

} // class 끝
