package algorithm.practice.chap01;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	// 배열b를 a에 복사
	static void copy(int[] a, int[] b) {

		for (int i = 0; i < b.length; i++) {

			a[i] = b[i];

		}

	}

	// 배열b를 a에 역순으로 복사
	static void reverseCopy(int[] a, int[] b) {

		for (int i = 0; i < b.length; i++) {

			a[b.length - i - 1] = b[i];

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = Integer.parseInt(sc.nextLine());

		int[] a = new int[num];
		int[] b = new int[num];

		for (int i = 0; i < num; i++) {

			System.out.print("b[" + i + "] = ");
			b[i] = Integer.parseInt(sc.nextLine());

		}

		copy(a, b);
		System.out.println("a배열 = " + Arrays.toString(a));
		System.out.println("b배열 = " + Arrays.toString(b));
		
		System.out.println();

		reverseCopy(a, b);
		System.out.println("a배열 = " + Arrays.toString(a));
		System.out.println("b배열 = " + Arrays.toString(b));
		
		sc.close();

	} // main 끝

} // class 끝
