/**
 * 
 */
package ch02.sec11;

/**
 * 
 */
public class VariableScopeExample {

	/**
	 * @param args
	 * 
	 * 변수 사용 범위 확인용 클래스
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v1 = 15;
		System.out.println("v1 = " + v1);
		System.out.println();

		if (10 < v1) {

			int v2 = v1 - 10;
			System.out.println("if문 안의 변수 값");
			System.out.println("v1 = " + v1);
			System.out.println("v2 = " + v2);
			System.out.println();

		}

		int v3 = 100;
		System.out.println("if문 밖의 변수 값");
		System.out.println("v1 = " + v1);
		System.out.println("v3 = " + v3);

	} // main 끝

} // class 끝
