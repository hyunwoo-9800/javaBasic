/**
 * 
 */
package practice.p_250304;

import java.util.Scanner;

/**
 * 
 * 센티미터
 * 
 */
public class P_250304_74 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 입력 받을 변수
		Scanner sc = new Scanner(System.in);

		// x가 문자열인지 체크할 변수
		char tmpX;

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;

		// cm를 입력받음
		System.out.println("구하고 싶은 cm를 입력해주세요.");
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

		// 숫자일 경우에만 값을 곱해서 출력
		if (flagX) {

			// 입력받은 값을 int형으로 변환
//			int x = Integer.parseInt(strX);
//
//			double totalX = x * 0.01;
//
//			if (100 <= x) {
//
//				// 출력
//				System.out.println("입력하신 cm는 " + totalX + "m입니다.");
//
//			} else {
//
//				// 출력
//				System.out.println("입력하신 cm는 " + x + "cm입니다.");
//
//			}

			// 입력받은 값을 int형으로 변환
			int x = Integer.parseInt(strX);

			// 입력 받은 값의 몫
			int meter = x / 100;

			// 입력 받은 값의 나머지
			int cm = x % 100;

			// 출력
			System.out.println("입력하신 키는 " + meter + "m " + +cm + "cm 입니다.");

		} else {

			System.out.println("숫자로 입력해주세요");

		}

		sc.close();

	} // main 끝

} // class 끝
