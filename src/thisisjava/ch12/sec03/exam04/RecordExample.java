package thisisjava.ch12.sec03.exam04;

public class RecordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m = new Member("winter", "눈송이" ,25);
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println(m.toString());
		
		System.out.println();
		
		Member m1 = new Member("winter", "눈송이" ,25);
		Member m2 = new Member("winter", "눈송이" ,26);
		Member m3 = new Member("fall", "단풍잎" ,20);
		System.out.println("m.hashCode() = " + m.hashCode());
		System.out.println("m1.hashCode() = " + m1.hashCode());
		System.out.println("m2.hashCode() = " + m2.hashCode());
		System.out.println("m3.hashCode() = " + m3.hashCode());
		System.out.println("m.equals(m1) = " + m.equals(m1));
		System.out.println("m.equals(m2) = " + m.equals(m2));
		System.out.println("m.equals(m3) = " + m.equals(m3));
		
		
	} // main 끝

} // class 끝
