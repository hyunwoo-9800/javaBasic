/**
 * 
 */
package algorithm.practice.chap01;

/**
 * 
 */
public class Min4 {

	// 최솟값 구하기 메서드
	static int mix4(int a, int b, int c, int d) {

		int min = a;

		if (b < min) {

			min = b;

		}

		if (c < min) {

			min = c;

		}

		if (d < min) {

			min = d;

		}

		return min;

	} // 메서드 종료

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("min4(1,2,3,4) = " + mix4(1, 2, 3, 4));
		System.out.println("min4(1,3,3,4) = " + mix4(1, 3, 3, 4));
		System.out.println("min4(4,3,2,1) = " + mix4(4, 3, 2, 1));
		System.out.println("min4(100,25,13,45) = " + mix4(100, 25, 13, 45));
		System.out.println("min4(5,7,0,4) = " + mix4(5, 7, 0, 4));
		System.out.println("min4(4,2,1,3) = " + mix4(4, 2, 1, 3));

	}

}
