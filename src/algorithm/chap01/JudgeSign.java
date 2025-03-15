/**
 * 
 */
package algorithm.chap01;

import java.util.Scanner;

/**
 * 입력한 정숫값의 부호 판단
 */
public class JudgeSign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");

		int n = Integer.parseInt(sc.nextLine());

		if (0 < n) {

			System.out.println("양수입니다.");

		} else if (n < 0) {

			System.out.println("음수입니다.");

		} else {

			System.out.println("0입니다.");

		}

	} // main 끝

} // class 끝
