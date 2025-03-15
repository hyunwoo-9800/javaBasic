/**
 * 
 */
package thisisjava.ch06.sec07.exam05;

/**
 * 생성자 오버로딩
 */
public class Car {

	String company = "벤츠";
	String model = "";
	String color = "";
	int maxSpeed = 0;

	// default 생성자
	public Car() {

	}

	// 생성자 선언
	public Car(String model) {

		// 다른 생성자 호출
		this(model, "은색", 200);
		System.out.println("1개 파라미터로 구성한 생성자 호출했을때");

	}

	// 생성자 선언
	public Car(String model, String color) {

		// 다른 생성자 호출
		this(model, color, 250);
		System.out.println("2개 파라미터로 구성한 생성자 호출했을때");

	}

	// 생성자 선언
	public Car(String model, int maxSpeed) {

		// 다른 생성자 호출
		this(model, "빨강", maxSpeed);

	}

	// 생성자 선언
	public Car(String model, String color, int maxSpeed) {

		System.out.println("3개 파라미터로 구성한 생성자 호출했을때");
		
		// 전체 초기화
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

} // class 종료
