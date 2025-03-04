/**
 * 
 */
package practice.p_250304;

/**
 * 
 * 에러
 * 
 */
public class P_250304_71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		boolean b = true;
		int i = 1;
		short s = 2;
		char c = 'a';
		
		// 실수의 경우 숫자 뒤에 자료형을 적지 않으면 기본적으로 double형이므로 큰 자료형을 작은 자료형에 넣을 수 없어서 에러가 발생
		
		// 잘못된 선언
		//float f = 1.234;
		
		// 올바른 선언
		float f = 1.234f;
		
		// 자바는 컴파일시 int형으로 형변환 한 뒤 계산하여 에러가 발생한다.
		
		// 잘못된 예시
//		short s2 = s + c;
		
		// 올바른 예시
		int s2 = s + c;
		
		// 잘못된 예시
//		short s3 = s + s;
		
		// 올바른 예시
		int s3 = s + s;
		
		// 잘못된 예시
//		char c2 = c + s;
		
		// 올바른 예시
		int c2 = c + s;
		
		int i2 = c + s;
		
		// boolean형과 int형은 계산이 불가능
//		int i3 = b + i;
		

	} // main 끝

} // class 끝
