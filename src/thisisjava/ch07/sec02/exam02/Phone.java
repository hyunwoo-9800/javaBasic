/**
 * 
 */
package thisisjava.ch07.sec02.exam02;

public class Phone {

	public String model;
	public String color;

	// default 생성자
	public Phone() {

	}

	// 매개변수 생성자
	public Phone(String model, String color) {

		this.model = model;
		this.color = color;
		System.out.println("Phone 매개변수를 갖는 생성자 실행");

	}

} // class 끝
