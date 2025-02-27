/**
 * 
 */
package ch02.sec09;

/**
 * 
 */
public class OperationPromotionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 컴파일 단계에서 연산
		byte result1 = 10 + 20;
		System.out.println("result1 = " + result1);

		// short, byte, int형은 컴파일 단계에서 int 형으로 변환해서 연산해서 에러가 남
		// 계산 값을 저장할 변수를 int 형으로 선언하면 됨
		byte b1 = 10;
		byte b2 = 20;
//		byte result2 = b1 + b2;
		int result3 = b1 + b2;
//		byte result4 = b1 + 20;
//		byte result5 = 30 + b2;
//		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
//		System.out.println("result4 = " + result4);
//		System.out.println("result5 = " + result5);

		// short 형도 위의 byte형과 마찬가지
		short s1 = 10;
		short s2 = 20;
		short result6 = 10 + 20;
//		short result7 = s1 + s2;
		int result8 = s1 + s2;
//		short result9 = s1 + 20;
//		short result10 = 30 + s1;
		System.out.println("result6 = " + result6);
//		System.out.println("result7 = " + result7);
		System.out.println("result8 = " + result8);
//		System.out.println("result9 = " + result9);
//		System.out.println("result10 = " + result10);

		// 연산 시 가장 큰 값의 자료형으로 변수를 선언하여 연산할 것
		byte v1 = 10;
		int v2 = 100;
		long v3 = 1000L;

//		int result11 = v1 + v2 +v3;
		long result12 = v1 + v2 + v3;
		System.out.println("result12 = " + result12);

		int v4 = 10;
		int result13 = v4 / 4;
		System.out.println("result13 = " + result13);

		// 실수형을 정수형으로 계산할 수 없다.
		int v5 = 10;
//		int result14 = v5 /4.0;
		double result15 = v5 / 4.0;
		double result16 = (double) v4 / 4;
		double result17 = v4 / 4;
		System.out.println("result15 = " + result15);
		System.out.println("result16 = " + result16);
		System.out.println("result17 = " + result17);

	} // main 끝

} // OperationPromotionExample 끝
