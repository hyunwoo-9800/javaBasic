package algorithm.practice.chap06;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 버블 정렬(앞쪽 부터 정렬)
public class Q1 {

	// a[idx1]과 a[idx2]의 값을 교환
		static void swap(int[] arr, int idx1, int idx2) {
			
			int temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;
			
		}
		
		// 버블 정렬
		static void bubbleSort(int[] arr) {
			
			for (int i = 0; i < arr.length - 1; i++) {
				
				// 패스
				for (int j = 0; j < arr.length - i - 1; j++) {
					
					if (arr[j + 1] < arr[j]) {
						
						swap(arr, j, j + 1);
						
					}
					
				}
				
			}
			
		} // bubbleSort 끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		System.out.println("버블 정렬");
		
		int[] x = new int[ci.readInt("요솟수: ")];
		
		for (int i = 0; i < x.length; i++) {
			
			System.out.print("x[" + i + "]: ");
			x[i] = ci.readInt("");
			
		}
		
		bubbleSort(x);	// 배열 x를 버블 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for (int i = 0; i < x.length; i++) {
			
			System.out.println("x[" + i + "]= " + x[i]);
			
		}
		
	}

}
