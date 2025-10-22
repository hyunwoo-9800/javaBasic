package algorithm.chap06;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 버블 정렬
public class BubbleSort {

	// a[idx1]과 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	
	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		
		for (int i = 0; i < n - 1; i++) {
			
			// 패스
			for (int j = n - 1; i < j; j--) {
				
				if (a[j] < a[j - 1]) {
					
					swap(a, j - 1, j);
					
				}
				
			}
			
		}
		
	} // bubbleSort 끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		System.out.println("버블 정렬 버전 1");
		
		int nx = ci.readInt("요솟수: ");
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			
			System.out.print("x[" + i + "]: ");
			x[i] = ci.readInt("");
			
		}
		
		bubbleSort(x, nx);	// 배열 x를 버블 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for (int i = 0; i < nx; i++) {
			
			System.out.println("x[" + i + "]= " + x[i]);
			
		}

	}

}
