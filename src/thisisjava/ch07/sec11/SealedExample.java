package thisisjava.ch07.sec11;

public class SealedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();

		// 메서드 실행
		p.work();
		e.work();
		m.work();
		d.work();

	} // main 끝

} // class 끝
