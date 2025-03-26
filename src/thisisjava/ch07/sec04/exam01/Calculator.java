/**
 * 
 */
package thisisjava.ch07.sec04.exam01;

// 오버라이딩
public class Calculator {

	// default 생성자
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	// 메서드
	public double areaCircle(double r) {
		
		System.out.println("부모객체의 메서드 실행");
		return 3.14159 * r * r ;
	}
	

} // class 끝
