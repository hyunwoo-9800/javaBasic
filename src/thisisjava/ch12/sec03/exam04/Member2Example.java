package thisisjava.ch12.sec03.exam04;

public class Member2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member2 m = new Member2("fall", "단풍", 25);
		
		System.out.print("Member2[id = " + m.getId() + ", name = " + m.getName() + ", age = " + m.getAge() + "]\n");
		
//		System.out.println(m.getId());
//		System.out.println(m.getName());
//		System.out.println(m.getAge());
		
		System.out.println(m.toString());
		
		System.out.println();

	} // main 끝

} // class 끝
