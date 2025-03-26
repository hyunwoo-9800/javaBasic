/**
 * 
 */
package thisisjava.ch07.sec04.exam02;

// 부모 메서드 호출
public class SupersonicAirplane extends Airplane {

	// 상수 선언
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;

	// 필드 선언
	public int flyMode = NOMAL;

	// default 생성자
	public SupersonicAirplane() {

		// TODO Auto-generated constructor stub
		super();

	}

	@Override
	public void fly() {

		// TODO Auto-generated method stub
		if (flyMode == SUPERSONIC) {

			System.out.println("초음속 비행 합니다.");

		} else {

			super.fly();

		}

	}

} // class 끝
