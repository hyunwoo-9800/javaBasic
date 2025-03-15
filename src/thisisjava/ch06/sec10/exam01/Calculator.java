/**
 * 
 */
package thisisjava.ch06.sec10.exam01;

/**
 * 정적 멤버
 */
public class Calculator {

	// 원주율
	static double pi = 3.14159;
	
	/**
	 * default 생성자
	 */
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	// 덧셈 메서드
	static int plus(int x, int y) {
		
		return x + y;
		
	}
	
	// 뺄셈 메서드
	static int minus(int x, int y) {
		
		return x - y;
		
	}

} // class 끝
