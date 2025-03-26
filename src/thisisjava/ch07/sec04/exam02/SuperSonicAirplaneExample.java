/**
 * 
 */
package thisisjava.ch07.sec04.exam02;

// 부모 메서드 호출
public class SuperSonicAirplaneExample extends Airplane {

	public static void main(String[] args) {

		// 인스턴스화
		SupersonicAirplane sa = new SupersonicAirplane();
		
		// 부모 객체 메서드
		sa.takeOff();
		System.out.println();
		System.out.println("flyMode = " + sa.flyMode);
		
		// 자식 객체 메서드
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		System.out.println();
		System.out.println("flyMode = " + sa.flyMode);
		sa.fly();
		System.out.println();
		
		sa.flyMode = SupersonicAirplane.NOMAL;
		System.out.println("flyMode = " + sa.flyMode);
		sa.fly();
		System.out.println();
		
		// 부모 객체 메서드
		sa.land();

	} // main 끝

} // class 끝
