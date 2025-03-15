/**
 * 
 */
package thisisjava.practice.p_250304;

import java.util.Scanner;

/**
 * 
 * 계산
 * 
 */
public class P_250304_79 {

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

		// 박스 구매 여부
		System.out.println("연필을 몇 박스 구매하시겠습니까? >>>");
		String strX = sc.nextLine();
		
		// 한 자루 구매 여부
		System.out.println("연필을 몇 자루 구매하시겠습니까? >>>");
		String strY = sc.nextLine();


		// 전체 문자열 만큼 반복
		for (int i = 0; i < strX.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpX = strX.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (!Character.isDigit(tmpX)) {

				flagX = false;

			}

		}
		
		// 전체 문자열 만큼 반복
		for (int i = 0; i < strY.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpY = strY.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (!Character.isDigit(tmpY)) {

				flagY = false;

			}

		}

		// 전부 숫자일 경우에만 값을 계산해서 출력
		if (flagX && flagY) {

			int boxPrice = Integer.parseInt(strX);
			int onePrice = Integer.parseInt(strY);
			
			boxPrice *= 12000;
			onePrice *= 1000;
			
			System.out.println("지불하실 금액은 " + (boxPrice + onePrice) + "원 입니다.");

		} else {
			
			System.out.println("숫자로 입력해 주세요.");
			
		}
		
		sc.close();

	} // main 끝

} // class 끝
