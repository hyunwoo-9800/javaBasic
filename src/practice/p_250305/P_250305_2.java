/**
 * 
 */
package practice.p_250305;

import java.util.Scanner;

/**
 * 
 * 절대값 출력하기
 * 
 */
public class P_250305_2 {

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

		System.out.println("숫자를 입력해주세요.");
		tmp = sc.nextLine();
		input = Integer.parseInt(tmp);

		// 절대값으로 바꾸기
		if (input < 0) {

			input *= -1;

		}

		System.out.println("입력한 값은 = " + tmp + " 절대값은 = " + input);

		sc.close();

	} // main 끝

} // class 끝
