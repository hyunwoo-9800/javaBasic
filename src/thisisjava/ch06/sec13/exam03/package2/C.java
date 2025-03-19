/**
 * 
 */
package thisisjava.ch06.sec13.exam03.package2;

import thisisjava.ch06.sec13.exam03.package1.*;

/**
 * 
 */
public class C {

	/**
	 * 
	 */
	public C() {
		// TODO Auto-generated constructor stub

		// 인스턴스화
		A a = new A();

		// 2, 3은 패키지가 달라서 접근 불가
		a.field1 = 1;
//		a.field2 = 1;
//		a.field3 = 1;

		// 2, 3은 패키지가 달라서 접근 불가
		a.method1();
//		a.method2();
//		a.method3();

	} // 메서드 종료

} // class 끝
