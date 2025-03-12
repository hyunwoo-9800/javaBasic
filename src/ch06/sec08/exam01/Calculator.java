/**
 * 
 */
package ch06.sec08.exam01;

/**
 * 메서드 호출 예제 클래스
 */
public class Calculator {

	/**
	 * default 생성자
	 */
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	void powerOn() {

		System.out.println("전원 ON");

	}

	void powerOff() {

		System.out.println("전원 OFF");

	}

	// 더하기용
	int plus(int x, int y) {

		int result = x + y;
		return result;

	}

	// 나누기용
	double divide(int x, int y) {

		double result = (double) x / (double) y;
		return result;

	}

} // class 끝
