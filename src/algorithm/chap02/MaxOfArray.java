package algorithm.chap02;

import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int[] height = new int[num];
		
		for (int i = 0; i < num; i++) {

			System.out.print("height[" + i + "] : ");
			height[i] = Integer.parseInt(sc.nextLine());

		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
		sc.close();
		
	} // main 끝

	// 배열의 최댓값을 구하여 반환하는 메서드
	static int maxOf(int[] a) {
		
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if (max < a[i]) {
				
				max = a[i];
				
			}
			
		}
		
		return max;
		
	} // 메서드 종료
	
} // class 끝
