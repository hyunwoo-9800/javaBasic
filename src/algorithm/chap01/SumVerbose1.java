/**
 * 
 */
package algorithm.chap01;

import java.util.Scanner;

/**
 * 
 */
public class SumVerbose1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		
		do {
			
			System.out.print("n값 : ");
			n = Integer.parseInt(sc.nextLine());
			
		} while(n <= 0);
		
		
		int sum = 0; // 합
		
		for(int i = 1; i <= n; i++) {
			
			if(i < n) {
				// 중간 과정
				System.out.print(i + " + ");
			} else {
				// 마지막 과정
				System.out.print(i + " = ");
			}
			
			sum += i;
			
		}
		
		System.out.println(sum);
		
		sc.close();
		
	} // main 끝

} // class 끝
