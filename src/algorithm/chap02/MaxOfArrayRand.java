package algorithm.chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i < num; i++) {
			
			height[i] = 100 + rand.nextInt(90);						// 키값을 난수로 결정
			System.out.println("height[" + i + "] = " + height[i]);
			
		}
		
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
		
		sc.close();
		
	} // main 끝

} // class 끝
