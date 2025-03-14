/**
 * 
 */
package ch06.sec08.exam03;

/**
 * return문 예제
 */
public class Car {

	int gas = 0;

	/**
	 * default 생성자
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// 가스 값 변경용 메서드
	void setGas(int gas) {

		this.gas = gas;

	} // 메서드 종료

	// 가스 잔량 확인용 메서드
	boolean isLeftGas() {

		if (gas == 0) {

			System.out.println("가스가 없습니다.");
			return false;

		} else {

			System.out.println("가스가 있습니다.");
			return true;

		}

	} // 메서드 종료

	// 가스잔량을 확인하여 달리는 여부를 결정하는 메서드
	void run() {

		while (true) {

			if (0 < gas) {

				System.out.println("달립니다.(가스 잔량 = " + gas + ")");
				gas -= 1;

			} else {

				System.out.println("멈춥니다.(가스 잔량 = " + gas + ")");
				return;

			}

		} // while 종료

	} // 메서드 종료

} // class 끝
