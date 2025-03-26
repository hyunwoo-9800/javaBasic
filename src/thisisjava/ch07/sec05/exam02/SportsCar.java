package thisisjava.ch07.sec05.exam02;

public class SportsCar extends Car {

	// default 생성자
	public SportsCar() {

		// TODO Auto-generated constructor stub
		super();

	}

	@Override
	public void speedUp() {
		speed += 10;
	}

	// final 메서드는 오버라이딩 불가
	/*
	 * @Override public void stop() {
	 * 
	 * System.out.println("스프츠카를 멈춤"); speed = 0; }
	 */

} // class 끝
