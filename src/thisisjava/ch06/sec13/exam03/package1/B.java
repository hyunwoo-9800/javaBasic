/**
 * 
 */
package thisisjava.ch06.sec13.exam03.package1;

/**
 * 접근 제어자
 */
public class B {

	public void method() {

		// 인스턴스화
		A a = new A();

		// 3은 private이라 접근 불가
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;
		
		// 3은 private이라 접근 불가
		a.method1();
		a.method2();
//		a.method3();

	} // 메서드 종료

} // class 끝
