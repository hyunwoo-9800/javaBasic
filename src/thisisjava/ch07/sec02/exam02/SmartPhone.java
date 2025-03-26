/**
 * 
 */
package thisisjava.ch07.sec02.exam02;

public class SmartPhone extends Phone {

	// 생성자 선언
	public SmartPhone(String model, String color) {

		// 부모 클래스의 생성자 호출
		super(model, color);
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone 매개변수를 갖는 생성자 실행");

	}

} // class 끝
