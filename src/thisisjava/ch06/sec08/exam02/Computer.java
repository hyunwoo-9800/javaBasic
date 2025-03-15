/**
 * 
 */
package thisisjava.ch06.sec08.exam02;

/**
 * 가변길이 매개변수 메서드
 */
public class Computer {

	/**
	 * default 생성자
	 */
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	// 총합 계산용 메서드
	int sum(int ... values) {

		int sum = 0;

		// 배열 타입의 변수처럼 사용
		for (int i = 0; i < values.length; i++) {

			sum += values[i];

		}

		return sum;
	}

} // class 끝
