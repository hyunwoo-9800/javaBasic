package algorithm.chap06;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 단순 선택 정렬
public class SelectionSort {

	// a[idx1]과 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {

		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;

	}

	static void selectionSort(int[] arr, int n) {

		for (int i = 0; i < n - 1; i++) {

			int min = i; 							// 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 저장

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[min]) {

					min = j;

				}

			}

			swap(arr, i, min); 						// 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);

		System.out.println("선택 정렬");

		int nx = ci.readInt("요솟수: ");
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {

			System.out.print("x[" + i + "]: ");
			x[i] = ci.readInt("");

		}

		selectionSort(x, nx); 						// 배열 x를 선택 정렬

		System.out.println("오름차순으로 정렬했습니다.");

		for (int i = 0; i < nx; i++) {

			System.out.println("x[" + i + "]= " + x[i]);

		}

	}

}
