/**
 * 
 */
package algorithm.practice.chap01;

import java.util.Scanner;

/**
 * 
 */
public class SumGaus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값 : ");
		int n = Integer.parseInt(sc.nextLine());

		double sum = 0; // 합계 저장용
		double middle = (double) n / 2; // 입력 값의 중간 값

		sum = (1 + n) * middle;

		System.out.println("1부터 " + n + "까지의 합은 " + (int)sum + "입니다.");

		sc.close();

	} // main

} // class 끝
