/**
 * 
 */
package practice.p_250304;

import java.util.Scanner;

/**
 * 
 * 평균 구하기
 * 
 */
public class P_250304_77 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 값을 입력 받을 스캐너 변수
		Scanner sc = new Scanner(System.in);

		// x, y, z가 문자열인지 체크할 변수
		char tmpX;
		char tmpY;
		char tmpZ;

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;
		boolean flagY = true;
		boolean flagZ = true;

		// 첫 번째 값을 입력 받음
		System.out.printf("국어점수를 입력해주세요. >>>");
		String strX = sc.nextLine();

		// 두 번째 값을 입력 받음
		System.out.print("영어점수를 입력해주세요. >>>");
		String strY = sc.nextLine();

		// 세 번째 값을 입력 받음
		System.out.print("수학점수를 입력해주세요. >>>");
		String strZ = sc.nextLine();

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

			int x = Integer.parseInt(strX);
			int y = Integer.parseInt(strY);
			int z = Integer.parseInt(strZ);

			int sum = x + y + z;

			double avg = sum / 3;

			System.out.printf("국어 : %d 영어 : %d 수학: %d 평균 : %f", x, y, z, avg);

		}  else {
			
			System.out.println("숫자로 입력해주세요");
			
		}
		
		sc.close();

	} // main 끝

}
// class 끝
