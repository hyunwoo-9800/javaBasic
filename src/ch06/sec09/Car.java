/**
 * 
 */
package ch06.sec09;

/**
 * 
 */
public class Car {

	String model = "";
	int speed = 0;

	/**
	 * default 생성자
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// 생성자
	public Car(String model) {

		this.model = model;

	}

	// 필드 값을 세팅할 메서드
	void setSpeed(int speed) {

		this.speed = speed;
		
	}

	// 메서드
	void run() {

		// 객체 내의 메서드 호출
		setSpeed(100);

		// this 생략시 객체내의 필드를 호출
		System.out.println(setModelName(model) + "가 달립니다.(시속 = " + speed + "km/h)");

	}

	// 모델이 없을 경우 기본값을 세팅할 메서드
	public static String setModelName(String model) {

		String tmp = "소나타";

		if (model == "" || model == null) {

			model = tmp;

		}

		return model;

	} // 메서드 종료

} // class 끝
