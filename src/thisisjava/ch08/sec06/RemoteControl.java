package thisisjava.ch08.sec06;

//인터페이스
public interface RemoteControl {

	// 상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메서드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 인스턴스 메서드
	default void setMute(boolean mute) {

		if (mute) {

			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);

		} else {

			System.out.println("무음 해제합니다.");

		}

	}

	// 정적 메서드
	static void changeBattery() {

		System.out.println("리모콘 건전지를 교환합니다.");

	}

} // 인터페이스 끝
