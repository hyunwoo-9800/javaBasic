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

		// x, y가 문자열인지 체크할 변수
		char tmpX;

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;

		int a = 11;
		int b = 14;

		System.out.println("숫자를 입력해주세요.");
		tmp = sc.nextLine();

		// 전체 문자열 만큼 반복
		for (int i = 0; i < tmp.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpX = tmp.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (!Character.isDigit(tmpX)) {

				flagX = false;

			}

		}

		// 숫자일 경우에만 값을 계산해서 출력
		if (flagX) {

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

		} else {

			System.out.println("숫자로 입력해 주세요.");

		} // else if 종료

	} // main 끝

} // class 끝
