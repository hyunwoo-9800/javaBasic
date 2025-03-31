package thisisjava.ch09.sec02.exam02;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		A a = new A();

		// A 인스턴스 메서드 호출
		a.useB();
		
		A.B.method2();
		int f2 = A.B.field2;

	} // main 끝

} // class 끝