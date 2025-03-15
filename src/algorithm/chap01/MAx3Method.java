/**
 * 
 */
package algorithm.chap01;

/**
 * 3개의 정숫값 가운데 최댓값을 구하는 메서드
 */
public class MAx3Method {

	// 최댓값 반환 메서드
	static int max3(int a, int b, int c) {

		// 최댓값
		int max = a;

		if (max < b) {

			max = b;

		}

		if (max < c) {

			max = c;

		}

		return max;

	} // 메서드 종료

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2));
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2));
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3));
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3));
		System.out.println("max3(3,3,2) = " + max3(3, 3, 2));
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3));
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3));
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1));
		System.out.println("max3(2,3,2) = " + max3(2, 3, 2));
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2));
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3));
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3));

	} // main 끝

} // class 끝
