package algorithm.practice.chap06;

import java.util.Arrays;
import java.util.Scanner;

import algorithm.util.ConsoleInput;

// 버블 정렬(교환 과정 출력)
public class Q4 {

	// a[idx1]과 a[idx2]의 값을 교환
		static void swap(int[] arr, int idx1, int idx2) {
			
			int temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;
			
		}
		
		// 버블 정렬
		static void bubbleSort(int[] arr, int n) {
			
			int ccnt = 0;	// 비교 회수
			int scnt = 0;	// 교환 회수
			
			int k = 0;			// a[k]보다 앞쪽은 정렬을 마친 상태
			int i = 0;
			
			while (k < n - 1) {
				
				System.out.printf("패스%d : \n", ++i);
				int last = n - 1;			// 마지막으로 요소를 교환한 위치
				
				// 패스
				for (int j = n - 1; k < j; j--) {
					
					for (int m = 0; m < n - 1; m++) {
						
						System.out.printf("%3d %c" , arr[m], (m != j - 1) ? ' ' : (arr[j] < arr[j - 1]) ? '+' : '-');
						
					}
					
					System.out.printf("%3d\n", arr[n - 1]);
					ccnt++;
					
					if (arr[j] < arr[j - 1]) {
						
						swap(arr, j - 1, j);
						last = j;
						scnt++;
						
					}
					
				}
				
				k = last;
				
			}
			
			System.out.println("\n비교를 " + ccnt + "회 했습니다.");
			System.out.println("교환을 " + scnt + "회 했습니다.\n");
			
		} // bubbleSort 끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		
		System.out.println("버블 정렬");
		
		int nx = ci.readInt("요솟수: ");
		int[] x = new int[nx];
		
		for (int i = 0; i < x.length; i++) {
			
			System.out.print("입력 값 x[" + i + "]: ");
			x[i] = ci.readInt("");
			
		}
		
		System.out.println("\n정렬 전 배열 값은 " + Arrays.toString(x) + " 입니다.");
		
		bubbleSort(x, nx);	// 배열 x를 버블 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		System.out.println("정렬 후 배열 값은 " + Arrays.toString(x) + " 입니다.");
		
		
	}

}
