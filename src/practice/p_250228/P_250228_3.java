/**
 * 
 */
package practice.p_250228;

/**
 * 
 */
public class P_250228_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 85.4;
		int score = (int) d;
		
		// 85출력 > 실수형을 정수형으로 변환했으므로 실수 부분이 버려짐
		System.out.println("score = " + score);
		
		// 85.4 출력
		System.out.println("d = " + d);
		System.out.println("========================================");
		
		
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);

		// a * b를 하면 300인데 300은 byte형의 범위를 넘어섬
		// 그래서 강제로 byte형으로 변환하면 300대신 이상한 값이 나올 것으로 예상
		System.out.println("c = " + c);
		System.out.println("========================================");
		
		double num1 = 1.2345;
		int num2 = 6;

		// 
		System.out.println("num1 + num2 = " + num1 + num2);

	} // main 끝

} // class 끝
