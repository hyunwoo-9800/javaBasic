/**
 * 
 */
package algorithm.chap01;

import java.util.Scanner;

/**
 * 
 */
public class JudgeABC1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");
		int n = Integer.parseInt(sc.nextLine());

		if (n == 1) {
			System.out.println("A");
		} else if (n == 2) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

		sc.close();

	} // main 끝

} // class 끝
