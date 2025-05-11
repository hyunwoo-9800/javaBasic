package algorithm.practice.chap01;

import java.util.Scanner;

public class TriangleLBwithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.println("모서리가 직각인 이등변삼각형을 출력합니다.");

		do {

			System.out.println("몇 단 삼각형입니까?");
			n = Integer.parseInt(sc.nextLine());

		} while (n <= 0);

		System.out.println("왼쪽 위가 직각인 이등변삼각형 ");
		triangleLT(n);
		System.out.println();
		
		System.out.println("왼쪽 아래가 직각인 이등변삼각형 ");
		triangleLB(n);
		System.out.println();

		System.out.println("오른쪽 위가 직각인 이등변삼각형 ");
		triangleRT(n);
		System.out.println();

		System.out.println("오른쪽 아래가 직각인 이등변삼각형 ");
		triangleRB(n);

		sc.close();

	} // main 끝

	// 왼쪽 위가 직각인 이등변 삼각형
	static void triangleLT(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

	// 왼쪽 아래가 직각인 이등변삼각형
	static void triangleLB(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}
	}

	// 오른쪽 위가 직각인 이등변 삼각형
	static void triangleRT(int n) {

		for (int i = 0; i < n; i++) {

//			System.out.print("i = " + i + "\n");

			for (int j = 0; j <= i - 1; j++) {

//				System.out.print("j = " + j + "\n");
				System.out.print(" ");

			}

			for (int k = 0; k < n - i; k++) {

//				System.out.print("k = " + k + "\n");
				System.out.print("*");
			}

			System.out.println();

		}

	}

	// 오른쪽 아래가 직각인 이등변 삼각형
	static void triangleRB(int n) {

		for (int i = 0; i < n; i++) {


			for (int j = 0; j <= n - i; j++) {

				System.out.print(" ");

			}

			for (int k = 0; k <= i; k++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

} // class 끝
