/**
 * 
 */
package thisisjava.ch07.sec04.exam01;

// 오버라이딩
public class Computer extends Calculator {

	// default 생성자
	public Computer() {
		
		// TODO Auto-generated constructor stub
		super();
		
	}

	@Override
	public double areaCircle(double r) {

		// TODO Auto-generated method stub
		System.out.println("자식객체의 메서드 실행");
		return Math.PI * r * r;

	}

} // class 끝
