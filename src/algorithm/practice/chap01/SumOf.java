/**
 * 
 */
package algorithm.practice.chap01;

import java.util.Scanner;

/**
 * 
 */
public class SumOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("a부터 b 사이의 합을 구합니다.");

		System.out.print("a값 : ");

		int a = Integer.parseInt(sc.nextLine());
		System.out.print("b값 : ");
		int b = Integer.parseInt(sc.nextLine());

		System.out.println("두 정수 사이의 합은 : " + sumof(a, b) + " 입니다.");

		sc.close();

	} // main

	static int sumof(int a, int b) {

		int sum = 0; // 합계 저장용

		if (a < b) {

			while (a <= b) {

				sum += a;
				a++;

			}

			return sum;

		} else {

			while (b <= a) {

				sum += b;
				b++;

			}

			return sum;

		}

	}

} // class 끝
