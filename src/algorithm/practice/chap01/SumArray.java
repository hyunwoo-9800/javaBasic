package algorithm.practice.chap01;

import java.util.Scanner;

public class SumArray {

	// 배열의 모든 요소의 합을 구하는 메서드
	static int sumOf(int[] a) {

		int sum = 0;

		for (int i = 0 ; i < a.length; i++) {

			sum += a[i];

		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = Integer.parseInt(sc.nextLine());

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {

			System.out.print("x[" + i + "] = ");
			x[i] = Integer.parseInt(sc.nextLine());

		}

		System.out.println("입력한 배열의 합은? " + sumOf(x));

		sc.close();

	} // main 끝

} // class 끝
