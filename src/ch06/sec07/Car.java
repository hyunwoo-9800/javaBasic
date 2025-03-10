/**
 * 
 */
package ch06.sec07;

/**
 * 
 */
public class Car {

	String model;
	String color;
	int maxSpeed;
	
	// default 생성자
	public Car() {
		
	}
	
	// 생성자 선언
	public Car(String model, String color, int maxSpeed) {
		
		// 초기화
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
} // class 종료
