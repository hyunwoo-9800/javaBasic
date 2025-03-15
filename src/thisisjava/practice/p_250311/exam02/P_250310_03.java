/**
 * 
 */
package thisisjava.practice.p_250311.exam02;

import java.util.Arrays;

/**
 * 
 */
public class P_250310_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 선언
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		// 최대값
		int maxValue = 0;

		// 최소값
		int minValue = 0;
		
		// 컬렉션리스트를 이용한 정렬
//		Arrays.sort(score);

		// 정렬
		sort(score);

		// 첫번째 값은 최소값
		maxValue = score[0];

		// 마지막 값은 최대값
		minValue = score[score.length - 1];

		System.out.println("최대값은? " + maxValue);
		System.out.println("최소값은? " + minValue);

		System.out.println();

		// 전체 배열 출력용
		System.out.println("전체 배열");
		for (int i = 0; i < score.length; i++) {

			System.out.println("score[" + i + "] = " + score[i]);
		}

	} // main 끝

	// 정렬용 메서드
	public static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int tmp = arr[i];
			int j = i - 1;

			while (0 <= j && tmp < arr[j]) {

				arr[j + 1] = arr[j];
				j--;

			} // while 종료

			arr[j + 1] = tmp;

		} // for 종료

	} // 메서드 종료

} // class 끝
