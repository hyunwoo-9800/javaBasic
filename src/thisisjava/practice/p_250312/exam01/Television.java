/**
 * 
 */
package thisisjava.practice.p_250312.exam01;

/**
 * Television 클래스
 */
public class Television {

	// 채널
	int channel = 0;

	// 볼륨
	int volume = 0;

	// 온오프
	boolean onOff = false;

	/**
	 * default 생성자
	 */
	public Television() {
		// TODO Auto-generated constructor stub
	}

	// 생성자
	public Television(int channel, int volume, boolean onOff) {

		// 초기화
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;

	}

} // class 끝
