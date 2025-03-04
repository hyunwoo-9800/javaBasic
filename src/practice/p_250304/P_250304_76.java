/**
 * 
 */
package practice.p_250304;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 두 수의 차이
 * 
 */
public class P_250304_76 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 값을 입력 받을 스캐너 변수
		Scanner sc = new Scanner(System.in);

		// x, y가 문자열인지 체크할 변수
		char tmpX;
		char tmpY;

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;
		boolean flagY = true;

		// 첫 번째 값을 입력 받음
		System.out.printf("첫 번째 값을 입력해주세요. >>>");
		String strX = sc.nextLine();

		// 두 번째 값을 입력 받음
		System.out.print("두 번째 값을 입력해주세요. >>>");
		String strY = sc.nextLine();

		// 전체 문자열 만큼 반복
		for (int i = 0; i < strX.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpX = strX.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (Character.isDigit(tmpX) == false) {

				flagX = false;

			}

		}

		// 전체 문자열 만큼 반복
		for (int i = 0; i < strY.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpY = strY.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (Character.isDigit(tmpY) == false) {

				flagY = false;

			}

		}

		// 둘다 숫자일 경우에만 차이를 구해서 출력
		if (flagX && flagY == true) {

			int x = Integer.parseInt(strX);
			int y = Integer.parseInt(strY);

			System.out.println("두 수의 차이는? " + (x - y));

		}  else {
			
			System.out.println("숫자로 입력해주세요");
			
		}
		
		sc.close();

	} // main 끝

}
// class 끝
