/**
 * 
 */
package thisisjava.ch07.sec04.exam02;

// 부모 메서드 호출
public class Airplane {

	// default 생성자
	public Airplane() {
		// TODO Auto-generated constructor stub
	}

	// 메서드 선언
	public void land() {
		
		System.out.println("착륙합니다.");
		
	}
	
	public void fly() {
		
		System.out.println("일반 비행합니다.");
		
	}

	public void takeOff() {

		System.out.println("이륙합니다.");

	}
	
} // class 끝
