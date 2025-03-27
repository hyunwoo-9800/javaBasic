package thisisjava.ch08.sec04;

// 인터페이스
public interface RemoteControl {

	// 상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메서드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

} // 인터페이스 끝
