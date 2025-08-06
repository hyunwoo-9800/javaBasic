package algorithm.chap02;

import java.util.Arrays;

// 배열 복제
public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone(); 			// b는 a의 복제를 참조

		b[3] = 0; 						// 한 요소에만 0을 대입

		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));

	}

}
