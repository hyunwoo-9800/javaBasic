package algorithm.practice.chap02;

import java.util.Arrays;
import java.util.Scanner;

// 배열 복사
public class Q4 {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 배열을 복사합니다.");
		System.out.println("요소수를 입력해 주세요.");

		int i = Integer.parseInt(sc.nextLine());

		System.out.println("\n입력한 요소수는 " + i + "입니다.\n");

		int[] array = new int[i];
		int[] arrayCopy = new int[i];

		for (int n = 0; n < i; n++) {

			System.out.print((n + 1) + "번째 요소를 입력해 주세요:");
			int value = Integer.parseInt(sc.nextLine());
			array[n] = value;

		}
		
		System.out.print("\n복사전 array 배열 값은" + Arrays.toString(array) + "입니다.\n");
		System.out.print("복사전 arrayCopy 배열 값은" + Arrays.toString(arrayCopy) + "입니다. \n");
		
		copy(arrayCopy, array);
		
		System.out.print("\n복사후 array 배열 값은" + Arrays.toString(array) + "입니다.\n");
		System.out.print("복사후 arrayCopy 배열 값은" + Arrays.toString(arrayCopy) + "입니다.");
		
		sc.close();

	}
	
	// 배열의 복사용 메서드
	static void copy(int[] a, int[] b) {
		
		for(int i = 0; i < b.length; i++) {
			
			a[i] = b[i];
			System.out.println("\nb[" + i + "]의 값 " + b[i] + "을(를) a[" + i + "]에 복사했습니다.");
			System.out.println("a[" + i + "]의 값은" + a[i] + "입니다.");
			
		}
		
	}


}
