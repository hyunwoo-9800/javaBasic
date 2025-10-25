package algorithm.practice.chap06;

import java.util.Arrays;
import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 양방향 버블 정렬(셰이커 정렬)
public class Q5 {

	// 배열의 요소 arr[idx1]과 arr[idx2]를 교환
	static void swap(int[] arr, int idx1, int idx2) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
	}
	
	// 셰이커 정렬
	static void shakerSort(int[] arr, int n) {
		
		int left = 0;			// 배열의 왼쪽(시작 위치)
		int right = n - 1;		// 배열의 오른쪽(종료 위치 = 요소값 - 1)
		int last = right;		// 종료 위치
		
		while (left < right) {
			
			for (int j = right; left < j; j--) {
				
				if (arr[j] < arr[j - 1]) {
					
					swap(arr, j - 1, j);
					last = j;
					
				}
				
			}
			
			left = last;
			
			for (int j = left; j < right; j++) {

				if (arr[j + 1] < arr[j]) {
					
					swap(arr, j, j + 1);
					last = j;
					
				}
				
			}
			
			right = last;
			
		} // while 종료
		
	} // shakerSort 종료
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		System.out.println("양방향 버블 정렬(셰이커 정렬)");
		
		int nx = ci.readInt("요솟수 : ");
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			
			System.out.print("입력 값 x[" + i + "] : ");
			x[i] = ci.readInt("");
			
		}
		
		System.out.println("\n정렬 전 배열 값은 " + Arrays.toString(x) + " 입니다.");
		
		shakerSort(x, nx);	// 배열 x를 양방향 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		System.out.println("정렬 후 배열 값은 " + Arrays.toString(x) + " 입니다.");
		
	}

}
