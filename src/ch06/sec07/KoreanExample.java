/**
 * 
 */
package ch06.sec07;

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
		Korean k1 = new Korean("홍길동", "000000-1234567");
		
		// 출력
		System.out.println("k1 nation = " + k1.nation);
		System.out.println("k1 name = " + k1.name);
		System.out.println("k1 ssn = " + k1.ssn);
		System.out.println();
		
		// 인스턴스
		Korean k2 = new Korean("바보", "123456-9999999");
		
		// 출력
		System.out.println("k2 nation = " + k2.nation);
		System.out.println("k2 name = " + k2.name);
		System.out.println("k2 ssn = " + k2.ssn);
		System.out.println();
		
		// 인스턴스
		Korean k3 = new Korean("누구");
		
		// 출력
		System.out.println("k3 nation = " + k3.nation);
		System.out.println("k3 name = " + k3.name);
		System.out.println("k3 ssn = " + k3.ssn);
		
		
	} // main 끝

} // class 끝
