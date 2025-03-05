/**
 * 
 */
package practice.p_250304;

import java.util.Scanner;

/**
 * 
 * 사다리꼴 넓이
 * 
 */
public class P_250304_75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 입력 받을 변수
		Scanner sc = new Scanner(System.in);

		// x, y, z. p가 문자열인지 체크할 변수
		char tmpX;
		char tmpY;
		char tmpZ;
		char tmpP;

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;
		boolean flagY = true;
		boolean flagZ = true;
		boolean flagP = true;

		// 윗변
		System.out.println("윗변의 길이를 입력해 주세요.");
		String strX = sc.nextLine();

		// 아랫변
		System.out.println("아랫볏의 길이를 입력해주세요.");
		String strY = sc.nextLine();

		// 높이
		System.out.println("높이를 입력해주세요.");
		String strZ = sc.nextLine();

		// 가격
		System.out.println("잔디의 가격을 입력해주세요.");
		String strP = sc.nextLine();

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

		// 전체 문자열 만큼 반복
		for (int i = 0; i < strZ.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpZ = strZ.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (!Character.isDigit(tmpZ)) {

				flagZ = false;

			}

		}

		// 전체 문자열 만큼 반복
		for (int i = 0; i < strP.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpP = strZ.charAt(i);

			// 문자열이 포함되었다면 숫자가 아님
			if (!Character.isDigit(tmpP)) {

				flagZ = false;

			}

		}

		// 전부 숫자일 경우에만 값을 곱해서 출력
		if (flagX && flagY && flagZ && flagP) {

			// 입력받은 값을 int형으로 변환
			int x = Integer.parseInt(strX);
			int y = Integer.parseInt(strY);
			int z = Integer.parseInt(strZ);
			int p = Integer.parseInt(strP);

			// 출력
			System.out.println("입력하신 사다리꼴에 심을 잔디의 가격은 " + (p * ((x + y) * z / 2)) + "원 입니다.");

		} else {

			System.out.println("숫자로 입력해주세요");

		}

		sc.close();

	} // main 끝

}
// class 끝
