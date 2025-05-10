/**
 * 
 */
package algorithm.chap01;

import java.util.Scanner;

/**
 * 
 */
public class SumFor2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		int n = 0;

		do {

			System.out.print("n값 : ");
			n = Integer.parseInt(sc.nextLine());

		} while (n <= 0);

		int sum = 0; // 합

		for (int i = 1; i <= n; i++) {

			sum += i;

		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

		sc.close();

	} // main 끝

} // class 끝
