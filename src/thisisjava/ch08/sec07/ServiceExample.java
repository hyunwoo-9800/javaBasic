package thisisjava.ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImpl();

		// 디폴트 메서드 호출
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();

		// 정적 메서드 호줄
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();

	} // main 끝

} // class 끝
