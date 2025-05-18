package algorithm.practice.chap01;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	// 배열 요소를 서로 바꾸기 위한 메서드
	static void swap(int[] a, int idx1, int idx2) {

		System.out.println(Arrays.toString(a));
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		System.out.println("a[" + idx1 + "]과 " + "a[" + idx2 + "]을 교환합니다.");
		
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
		
		System.out.println(Arrays.toString(x));
		System.out.println("역순 정렬을 마쳤습니다.");

		sc.close();
		
	} // main 끝

} // class 끝
