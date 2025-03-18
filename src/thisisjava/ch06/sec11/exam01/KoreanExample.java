/**
 * 
 */
package thisisjava.ch06.sec11.exam01;

/**
 * 
 */
public class KoreanExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Korean k1 = new Korean("123456-1234567", "홍길동");

		// 출력
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);

		// final 필드는 값 변경 불가
//		k1.nation = "USA";
//		k1.ssn = "123-12-1234";

		// final 필드가 아닌 값은 변경 가능
		k1.name = "rhfkslek";

		// 출력
		System.out.println("===================================");
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);

	} // main 끝

} // class 끝
