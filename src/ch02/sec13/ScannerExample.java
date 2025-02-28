/**
 * 
 */
package ch02.sec13;

import java.util.Scanner;

/**
 * 
 * Scanner 연습 클래스
 * 
 */
public class ScannerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스캐너 변수
		Scanner sc = new Scanner(System.in);

		// x, y가 문자열인지 체크할 변수
		char tmpX;
		char tmpY;
		
		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;
		boolean flagY = true;

		// 값을 입력받고 입력한 값이 문자열일 경우 false
		System.out.print("x 값을 입력해주세요.");
		String strX = sc.nextLine();

		for (int i = 0; i < strX.length(); i++) {

			tmpX = strX.charAt(i);

			if (Character.isDigit(tmpX) == false) {

				flagX = false;
			}
		}

		// 값을 입력받고 입력한 값이 문자열일 경우 false
		System.out.print("y 값을 입력해주세요.");
		String strY = sc.nextLine();

		for (int i = 0; i < strY.length(); i++) {

			tmpY = strY.charAt(i);

			if (Character.isDigit(tmpY) == false) {

				flagY = false;

			}
		}

		// 플래그 체크
		if (flagX == false) {

			System.out.println("입력한 x값이 숫자가 아닙니다.");

		}
		
		if (flagY == false) {

			System.out.println("입력한 y값이 숫자가 아닙니다.");

		}
		
		// 둘다 숫자일 경우에만 값을 더해서 출력
		if (flagX && flagY == true) {

			int x = Integer.parseInt(strX);
			int y = Integer.parseInt(strY);
			System.out.println("x + y = " + (x + y));
			System.out.println();

		}

		while (true) {

			// q를 입력하면 종료
			System.out.print("입력 문자열 : (q를 입력하면 종료합니다.)");
			String data = sc.nextLine();

			if (data.contains("q")) {

				break;

			}

			System.out.println("출력 문자열 = " + data);
			System.out.println();

		}

		// 스캐너 함수 종료
		System.out.println("종료");
		sc.close();

	} // main 끝

} // class 끝
