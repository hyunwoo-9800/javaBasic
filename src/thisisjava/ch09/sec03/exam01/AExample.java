package thisisjava.ch09.sec03.exam01;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		A.B b = new A.B();

		A a = new A();
		A.B b1 = a.field2;
		A.method2();

	} // main 끝

} // class 끝