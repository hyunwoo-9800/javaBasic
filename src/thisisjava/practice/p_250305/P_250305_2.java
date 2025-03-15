/**
 * 
 */
package thisisjava.practice.p_250305;

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

		// x, y가 문자열인지 체크할 변수
		char tmpX;

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;

		System.out.println("숫자를 입력해주세요.");
		tmp = sc.nextLine();

		// 전체 문자열 만큼 반복
		for (int i = 0; i < tmp.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpX = tmp.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (!Character.isDigit(tmpX)) {

				flagX = false;

			// 입력한 값에 -가 포함되어 있으면 절대값을 계산 하기 위함
			} else if (tmp.contains("-")) {
				
				flagX = true;
				
			}

		}

		// 숫자일 경우에만 값을 계산해서 출력
		if (flagX) {

			input = Integer.parseInt(tmp);

			// 절대값으로 바꾸기
			if (input < 0) {

				input *= -1;

			}

			System.out.println("입력한 값은 = " + tmp + " 절대값은 = " + input);

			sc.close();

		} else {

			System.out.println("숫자로 입력해 주세요.");

		} // else if 종료

	} // main 끝

} // class 끝
