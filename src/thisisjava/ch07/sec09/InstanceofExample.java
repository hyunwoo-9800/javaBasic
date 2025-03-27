package thisisjava.ch07.sec09;

public class InstanceofExample {

	// 메인에서 바로 호출하기 위한 정적 메서드
	public static void persionInfo(Person person) {

		System.out.println("name = " + person.name);
		person.walk();

		// person이 참조하는 객체가 Student 타입인지 확인
//		if (person instanceof Student) {
//
//			Student student = (Student) person;
//			System.out.println("studentNo = " + student.studentNo);
//			student.study();
//
//		}

		// person이 참조하는 객체가 Student 타입인 경우
		// 자바12 부터 사용 가능
		if (person instanceof Student student) {

			System.out.println("studentNo = " + student.studentNo);
			student.study();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("홍길동");
		persionInfo(p1);

		System.out.println();

		Person p2 = new Student("김길동", 10);
		persionInfo(p2);

	} // main 끝

} // class 끝
