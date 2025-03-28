package thisisjava.ch08.sec10.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		// 인터페이스 변수
		A a;

		// 자동 타입 변환
		a = b;
		a = c;
		a = d;
		a = e;

	} // main 끝

} // class 끝
