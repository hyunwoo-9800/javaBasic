/**
 * 
 */
package ch06.sec07.exam04;

/**
 * 생성자 오버로딩
 */
public class Car {

	String company = "BMW";
	String model = "";
	String color = "";
	int maxSpeed = 0;

	// default 생성자
	public Car() {

	}

	// 생성자 선언
	public Car(String model) {

		// 초기화
		this.model = model;

	}

	// 생성자 선언
	public Car(String model, String color) {

		// 초기화
		this.model = model;
		this.color = color;

	}

	// 생성자 선언
	public Car(String model, String color, int maxSpeed) {

		// 초기화
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}
	
	// 생성자 선언
	public Car(String model, int maxSpeed) {
		
		// 초기화
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	}

} // class 종료
