/**
 * 
 */
package practice.p_250304;

import java.util.Scanner;

/**
 * 
 * 키(m)를 cm로 바꾸기
 * 
 */
public class P_250304_78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 값을 입력 받을 스캐너 변수
		Scanner sc = new Scanner(System.in);

		// x가 문자열인지 체크할 변수
		char tmpX;

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;

		// 키를 입력받음
		System.out.println("키를 입력해주세요(m단위로) >>>");
		String strX = sc.nextLine();

		// 전체 문자열 만큼 반복
		for (int i = 0; i < strX.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpX = strX.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (!Character.isDigit(tmpX)) {

				flagX = false;

			}

		}

		// 숫자일 계산해서 출력
		if (flagX) {

			double x = Double.parseDouble(strX);

			System.out.printf("입력하신 키는 cm로 %-10.2f cm입니다.", x);

		} else {
			
			System.out.println("숫자로 입력해주세요");
			
		}

		sc.close();

	} // main 끝

} // class 끝
