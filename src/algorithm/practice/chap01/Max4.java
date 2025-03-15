/**
 * 
 */
package algorithm.practice.chap01;

/**
 * 4개의 정수중 최댓값 구하기
 */
public class Max4 {

	// 최댓값 구하는 메서드
	static int max4(int a, int b, int c, int d) {

		int max = a;

		if (max < b) {

			max = b;

		}

		if (max < c) {

			max = c;

		}

		if (max < d) {

			max = d;

		}

		return max;

	} // 메서드 종료

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("max4(4,3,2,1) = " + max4(4, 3, 2, 1));
		System.out.println("max4(4,4,4,4) = " + max4(4, 4, 4, 4));
		System.out.println("max4(99,5,1,10) = " + max4(99, 5, 1, 10));
		System.out.println("max4(0,100,5,99) = " + max4(0, 100, 5, 99));

	} // main 끝

} // class 끝
