/**
 * 
 */
package thisisjava.ch06.sec13.exam03.package1;

/**
 * 접근 제어자
 */
public class A {

	// 필드 선언
	public int field1;
	int field2;
	private int field3;

	/**
	 * default 생성자
	 */
	public A() {
		// TODO Auto-generated constructor stub

		// 같은 클래스에 있어서 전부 접근 가능
		field1 = 1;
		field2 = 1;
		field3 = 1;

		method1();
		method2();
		method3();
		
	}

	// 메서드 선언
	public void method1() {

	}

	void method2() {

	}

	private void method3() {

	}

} // class 끝
