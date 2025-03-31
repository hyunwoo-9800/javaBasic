package thisisjava.ch09.sec03.exam02;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();

		// B 클래스의 정적 필드 및 메소드 사용
		System.out.println(A.B.field2);
		A.B.method2();

	} // main 끝

} // class 끝