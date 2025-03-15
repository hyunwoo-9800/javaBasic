/**
 * 
 */
package algorithm.chap01;

import java.util.Scanner;

/**
 * 
 * 3개의 정숫값을 입력하고 최댓값을 구하여 출력
 * 
 */
public class Max3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");

		System.out.println("a의 값 = ");
		int a = Integer.parseInt(sc.nextLine());

		System.out.println("b의 값 = ");
		int b = Integer.parseInt(sc.nextLine());

		System.out.println("c의 값 = ");
		int c = Integer.parseInt(sc.nextLine());

		int max = a;
		if (max < b) {

			max = b;

		}

		if (max < c) {

			max = c;

		}

		System.out.println("최댓값은 " + max + " 입니다.");
		sc.close();

	} // main 끝

} // class 끝
