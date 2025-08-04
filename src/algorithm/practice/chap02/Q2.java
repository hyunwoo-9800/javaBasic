package algorithm.practice.chap02;

import java.util.Arrays;
import java.util.Scanner;

// 배열 요소 역순 정렬 과정
public class Q2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("배열 요소를 역순으로 정렬하는 과정을 보여줍니다.");
		System.out.println("요소수를 입력해 주세요.");

		int i = Integer.parseInt(sc.nextLine());

		System.out.println("\n입력한 요소수는 " + i + "입니다.");

		int[] array = new int[i];

		for (int n = 0; n < i; n++) {

			System.out.print((n + 1) + "번째 요소를 입력해 주세요:");
			int value = Integer.parseInt(sc.nextLine());
			array[n] = value;

		}

		System.out.println("\n[정렬 전]");
		System.out.println(Arrays.toString(array) + "\n");
		
		reverse(array);
		
		sc.close();

	}

	// 배열 요소를 서로 바꾸기 위한 메서드
	static void swap(int[] a, int idx1, int idx2) {

		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
		System.out.println("a[" + idx1 + "]" + "과 " + "a[" + idx2 + "]" + "의 값을 교환 합니다.");
		System.out.println("정렬 후 값은" + Arrays.toString(a) + "\n");

	}

	// 배열 요소를 역순으로 정렬하기 위한 메서드
	static void reverse(int[] a) {

		for (int i = 0; i < a.length / 2; i++) {

			swap(a, i, a.length - i - 1);

		}

	}

}
