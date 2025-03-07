/**
 * 
 */
package ch06.sec04;

/**
 * 
 */
public class StudentExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Student class 인스턴스화
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다." + s1);
		
		// Student class 인스턴스화
		Student s2 = new Student();
		System.out.println("s2 변수가 new로 생성한 또 다른 Student 객체를 참조합니다." + s2);
		
	} // main 끝

} // class 끝
