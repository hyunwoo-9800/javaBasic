/**
 * 
 */
package ch06.sec08.exam03;

/**
 * return문 예제
 */
public class CarExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Car car = new Car();

		// 가스값 세팅
		car.setGas(5);

		// 가스값 확인용 메서드 호출
		if (car.isLeftGas()) {

			System.out.println("출발합니다.");

			// 가스가 있다면 메서드 호출
			car.run();

		} // if 종료

		System.out.println("가스를 주입하세요");

	} // main 끝

} // class 끝
