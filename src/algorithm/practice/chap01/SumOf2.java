/**
 * 
 */
package algorithm.practice.chap01;

import java.util.Scanner;

/**
 * 
 */
public class SumOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("b - a 값을 구합니다.");

		int b = 0;

		System.out.print("a값 : ");
		int a = Integer.parseInt(sc.nextLine());

		do {

			System.out.print("b값 : ");
			b = Integer.parseInt(sc.nextLine());

			if (b <= a) {
				
				System.out.println("b에는 a보다 큰 값을 입력하세요!");

			}
			
		} while (b <= a);
		
		System.out.println("b - a는 " + (b - a) + " 입니다." );

		sc.close();

	} // main

} // class 끝
