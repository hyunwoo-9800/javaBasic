/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */
public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 선언
		ArrayList arr = new ArrayList();

		// 값을 입력받을 변수
		Scanner sc = new Scanner(System.in);

		// 카운트 변수
		int cnt = 0;

		// 배열에 int형으로 집어넣을 변수
		int tmpX = 0;

		// 종료 여부 확인용 변수
		String strTmp = "";

		// 입력받은 값이 문자열인지 확인하기 위한 변수
		char cTmp = ' ';

		// 종료 여부 체크용 변수
		boolean check = false;

		// 문자열 체크 변수
		boolean flag = false;

		do {

			System.out.println("배열에 넣을 " + cnt + "번째 값을 입력해 주세요.");
			String str = sc.nextLine();
			
			// 전체 문자열 만큼 반복
			for (int i = 0; i < str.length(); i++) {

				// 입력 받은 문자열을 차례대로 꺼냄
				cTmp = str.charAt(i);

				// 문자열이 포함되었다면 숫자가 아님
				if (!Character.isDigit(cTmp)) {

					flag = true;

				}

			} // 문자열 체크 for 종료

			// 문자열이 없을 경우
			if (!flag) {

				// 입력받은 값을 형변환
				tmpX = Integer.parseInt(str);

				// 배열에 값을 넣음
				arr.add(tmpX);
				
				// 카운트 변수 증가
				cnt++;

				// 종료 여부 확인
				System.out.println("종료하시려면 q를 눌러주세요. 계속하시려면 엔터키로 진행해 주세요.");
				strTmp = sc.nextLine();

				// q가 입력되었을 경우
				if (strTmp.contains("q")) {

					check = true;

				}

			} else {

				// 입력한 값이 문자열이 아닐 경우
				System.out.println("숫자로 입력해주세요.");
				break;

			} // else - if 종료

		// 입력값이 q가 아닐 동안 반복
		} while (!check); // do while 종료

		// 출력
		System.out.print("정렬전 배열의 값은 " + arr + " 입니다.");

		// 개행용
		System.out.println();

		// 정렬
		Collections.sort(arr);

		// 출력
		System.out.print("정렬후 배열의 값은 " + arr + " 입니다.");

		// 스캐너 종료
		sc.close();

	} // main 끝

} // class 끝
