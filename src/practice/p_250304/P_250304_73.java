/**
 * 
 */
package practice.p_250304;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * 
 * 사각기둥의 부피
 * 
 */
public class P_250304_73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 입력 받을 변수
		Scanner scanner = new Scanner(System.in);

		// x, y, z가 문자열인지 체크할 변수
		char tmpX;
		char tmpY;
		char tmpZ;

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;
		boolean flagY = true;
		boolean flagZ = true;

		// 세로의 크기
		System.out.println("세로의 크기를 입력해 주세요.");
		String strX = scanner.nextLine();

		// 가로의 크기
		System.out.println("가로의 크기를 입력해주세요.");
		String strY = scanner.nextLine();

		// 높이
		System.out.println("높이를 입력해주세요.");
		String strZ = scanner.nextLine();

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

		// 전체 문자열 만큼 반복
		for (int i = 0; i < strZ.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpZ = strZ.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (Character.isDigit(tmpZ) == false) {

				flagZ = false;

			}

		}

		// 전부 숫자일 경우에만 값을 곱해서 출력
		if (flagX && flagY && flagZ == true) {

			// 입력받은 값을 int형으로 변환
			int x = Integer.parseInt(strX);
			int y = Integer.parseInt(strY);
			int z = Integer.parseInt(strZ);

			// 출력
			System.out.println("입력하신 사각형기둥의 부피는" + (x * y * z) + "cm³" + "입니다.");

		}

		scanner.close();

	} // main 끝

}
// class 끝
