/**
 * 
 */
package practice.p_250304;

import java.util.Scanner;

/**
 * 
 * 사각형의 넒이 구하기
 * 
 */
public class P_250304_72 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 입력 받을 변수
		Scanner sc = new Scanner(System.in);

		// x, y가 문자열인지 체크할 변수
		char tmpX;
		char tmpY;

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;
		boolean flagY = true;

		// 세로의 크기
		System.out.println("세로의 크기를 입력해 주세요.");
		String strX = sc.nextLine();

		// 가로의 크기
		System.out.println("가로의 크기를 입력해주세요.");
		String strY = sc.nextLine();

		// 입력 받은 값 체크

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

		// 둘다 숫자일 경우에만 값을 곱해서 출력
		if (flagX && flagY == true) {

			// 입력받은 값을 int형으로 변환
			int x = Integer.parseInt(strX);
			int y = Integer.parseInt(strY);

			// 출력
			System.out.println("입력하신 사각형의 넓이는 "+ (x * y) + "cm²" + "입니다.");

		} else {
			
			System.out.println("숫자로 입력해주세요");
			
		}
		
		sc.close();

	} // main 끝

}
// class 끝
