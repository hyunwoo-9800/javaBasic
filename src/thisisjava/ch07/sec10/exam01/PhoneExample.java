package thisisjava.ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Phone phone = new Phone();

		SmartPhone smartPhone = new SmartPhone("홍길동");

		// Phone의 메서드
		smartPhone.turnOn();

		// SmartPhone의 메서드
		smartPhone.internetSearch();

		// Phone의 메서드
		smartPhone.turnOff();

	} // main 끝

} // class 끝
