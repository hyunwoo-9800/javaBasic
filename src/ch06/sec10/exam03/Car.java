/**
 * 
 */
package ch06.sec10.exam03;

/**
 * 
 */
public class Car {

	// 인스턴스 변수
	int speed = 0;

	// 인스턴스 메서드
	void run() {

		System.out.println(speed + "으로 달립니다.");

	}

	// 정적 메서드
	static void simulate() {

		// 자신을 인스턴스화
		Car car = new Car();

		// 값 세팅
		car.speed = 200;

		// 메서드 호출
		car.run();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정적 메서드 호출
		simulate();

		// 인스턴스화
		Car car = new Car();

		car.speed = 60;
		car.run();

	} // main 끝

} // class 끝
