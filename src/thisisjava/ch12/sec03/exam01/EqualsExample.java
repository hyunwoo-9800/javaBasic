package thisisjava.ch12.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		System.out.println("obj1.hashCode() = " + obj1.hashCode());
		System.out.println("obj2.hashCode() = " + obj2.hashCode());
		System.out.println("obj3.hashCode() = " + obj3.hashCode());
		
		System.out.println();
		
		if (obj1.equals(obj2)) {

			System.out.println("obj1과 obj2는 동등합니다.");

		} else {

			System.out.println("obj1과 obj2는 동등하지 않습니다.");

		}

		if (obj1.equals(obj3)) {

			System.out.println("obj1과 obj3은 동등합니다.");

		} else {

			System.out.println("obj1과 obj3은 동등하지 않습니다.");

		}

	} // main 끝

} // class 끝
