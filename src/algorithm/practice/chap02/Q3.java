package algorithm.practice.chap02;

import java.util.Scanner;

// 배열의 모든 요소 합 구하기
public class Q3 {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("배열 요소 합을 구하는 과정을 보여줍니다.");
		System.out.println("요소수를 입력해 주세요.");

		int i = Integer.parseInt(sc.nextLine());

		System.out.println("\n입력한 요소수는 " + i + "입니다.\n");

		int[] array = new int[i];

		for (int n = 0; n < i; n++) {

			System.out.print((n + 1) + "번째 요소를 입력해 주세요:");
			int value = Integer.parseInt(sc.nextLine());
			array[n] = value;

		}
		
		System.out.println("배열의 전체 합은? " + sumOf(array) + "입니다.");
		sc.close();

	}
	
	// 배열의 합 계산용 메서드
	static int sumOf(int[] a) {
		
		int[] array = a;
		
		int arraySum = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			arraySum += array[i];
			System.out.println("\na[" + i + "]" + " + " + "a[" + (i + 1) + "]의 값은? " + arraySum + "입니다.\n");
			
		}
		
		return arraySum;
		
	}


}
