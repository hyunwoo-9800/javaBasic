/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * 
 */
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("숫자 5개를 입력해주세요.");
		for (int i = 0; i < arr.length; i++) {

			int arr1 = Integer.parseInt(sc.nextLine());
			arr[i] = arr1;
			
		}
		
		for(int i : arr) {
			
			System.out.println(i);
			
		}

	}

}
