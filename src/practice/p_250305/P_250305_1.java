/**
 * 
 */
package practice.p_250305;

import java.util.Scanner;

/**
 * 
 */
public class P_250305_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력값을 받을 변수
		Scanner sc = new Scanner(System.in);
		
		// 입력값을 저장할 변수
		String tmp = "";
		
		// 저장한 입력값을 형변환 하기 위한 변수
		int input = 0;
		
		int a = 11;
		int b = 14;
		
		System.out.println("숫자를 입력해주세요.");
		tmp = sc.nextLine();
		input = Integer.parseInt(tmp);
		
		System.out.println("변경 전 " + "input = " + input);
		System.out.println("변경 전 " + "a = " + a + ", b = " + b);
		if (input == 0) {
			
			a = 5;
			
		} else {
			
			b = a + 3;
			
		}
		
		System.out.println("변경 전 " + "a = " + a + ", b = " + b);
		
		sc.close();
		
	} // main 끝

} // class 끝
