package algorithm.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	// 배열 요소를 서로 바꾸기 위한 메서드
	static void swap(int[] a, int idx1, int idx2) {

		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;

	}

	// 배열 요소를 역순으로 정렬하기 위한 메서드
	static void reverse(int[] a) {

		for (int i = 0; i < a.length / 2; i++) {

			swap(a, i, a.length - i - 1);

		}

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
		
		reverse(x);

		System.out.println("요소를 역순으로 정렬했습니다.");
		System.out.println("x = " + Arrays.toString(x));
		
		sc.close();
		
	} // main 끝

} // class 끝
