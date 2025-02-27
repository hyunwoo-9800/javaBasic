/**
 * 
 */
package ch02.sec03;

/**
 * 
 */
public class CharExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자 저장
		char c1 = 'A';

		// 유니코드 값 저장
		char c2 = 65;

		// 문자 저장
		char c3 = '가';

		// 유니코드 값 저장
		char c4 = 44032;
		
		// 초기화 할때 공백
		char c5 = ' ';

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);

		// 유니코드 값 더하기
		System.out.println("c2 + 1 = " + (c2 + 1));
		System.out.println("(char)c2 + 1 = " + (char)(c2 + 1));

		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);

		// 유니코드 값 더하기
		System.out.println("c4 + 1 = " + (c4 + 1));
		System.out.println("(char)c4 + 1 = " + (char)(c4 + 1));
		
		System.out.println("c5 = " + c5);

	} // main 끝

} // CharExample 끝
