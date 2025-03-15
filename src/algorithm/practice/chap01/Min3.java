/**
 * 
 */
package algorithm.practice.chap01;

/**
 * 3개의 정숫값중 최솟값 구하기
 */
public class Min3 {

	// 최솟값 구하기 메서드
	static int mix3(int a, int b, int c) {

		int min = a;

		if (b < min) {

			min = b;

		}

		if (c < min) {

			min = c;

		}

		return min;

	} // 메서드 종료

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("min3(1,2,3) = " + mix3(1, 2, 3));
		System.out.println("min3(2,2,1) = " + mix3(2, 2, 1));
		System.out.println("min3(5,25,1) = " + mix3(5, 25, 1));
		System.out.println("min3(3,2,0) = " + mix3(3, 2, 0));
		System.out.println("min3(8,4,6) = " + mix3(8, 4, 6));

	} // main 종료

} // class 종료
