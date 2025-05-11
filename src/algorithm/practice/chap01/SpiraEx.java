package algorithm.practice.chap01;

import java.util.Scanner;

public class SpiraEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("피라미드를 출력합니다.");
		int n = 0;

		do {

			System.out.print("n의 값 : ");
			n = Integer.parseInt(sc.nextLine());

		} while (n <= 0);

		spira(n);
		
		sc.close();

	} // main 끝

	static void spira(int n) {

		for (int i = 0; i < n; i++) {

			
			for (int j = 0; j < n - i; j++) {

				System.out.print(" ");

			}

			for (int k = 0; k < i * 2 + 1; k++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

} // class 끝
