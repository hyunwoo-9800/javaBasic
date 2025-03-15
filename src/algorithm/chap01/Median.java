/**
 * 
 */
package algorithm.chap01;

import java.util.Scanner;

/**
 * 3개의 입력값 중 중앙값을 구하기
 */
public class Median {

	// 중앙값 구하는 메서드
	public static int med3(int a, int b, int c) {

		if (b <= a) {

			if (c <= b) {

				return b;

			} else if (a <= c) {

				return a;

			} else {

				return c;

			}

		} else if (a > c) {

			return a;

		} else if (b > c) {

			return c;

		} else {

			return b;

		}

	} // 메서드 종료

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을 구합니다.");

		System.out.println("a의 값 = ");
		int a = Integer.parseInt(sc.nextLine());

		System.out.println("b의 값 = ");
		int b = Integer.parseInt(sc.nextLine());

		System.out.println("c의 값 = ");
		int c = Integer.parseInt(sc.nextLine());

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
		sc.close();

	} // main 끝

} // class 끝
