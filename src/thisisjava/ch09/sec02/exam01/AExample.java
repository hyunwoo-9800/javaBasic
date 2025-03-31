package thisisjava.ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		A a = new A();
		System.out.println("1--------------------");
		System.out.println(a);
		
		
		// 인스턴스화
		A.B b = a.new B();
		System.out.println("2--------------------");
		System.out.println(b);

	} // main 끝

} // class 끝