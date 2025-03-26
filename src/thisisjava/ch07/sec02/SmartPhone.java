/**
 * 
 */
package thisisjava.ch07.sec02;

public class SmartPhone extends Phone {

	public boolean wifi;

	// 생성자 선언
	public SmartPhone(String model, String color) {
		
		super();
		this.model = model;
		this.color = color;

	}

	// 메서드 선언
	public void setWifi(boolean wifi) {

		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");

	}

	public void internet() {
		
		System.out.println("인터넷에 연결합니다.");
		
	}

} // class 끝
