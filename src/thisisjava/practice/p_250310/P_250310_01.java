/**
 * 
 */
package thisisjava.practice.p_250310;

import java.util.Scanner;

/**
 * 
 */
public class P_250310_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수값 5개를 넣을 배열
		int[] iArr = new int[5];

		// 사용자가 입력할 값
		int tmpX = 0;

		// 카운트 변수
		int cnt = 0;

		// 값이 있는지 확인할 변수
		boolean check = false;

		// 스캐너 변수
		Scanner sc = new Scanner(System.in);

		System.out.println("배열에 넣을 값 5개를 입력해 주세요.");
		for (int i = 0; i < iArr.length; i++) {

			tmpX = Integer.parseInt(sc.nextLine());
			iArr[i] = tmpX;

		}

		// 숫자 하나를 입력받음
		System.out.println("임의의 숫자 하나를 입력해주세요.");
		tmpX = Integer.parseInt(sc.nextLine());

		// 값을 비교
		for (int i = 0; i < iArr.length; i++) {

			int iTmp = iArr[i];
			
			// 값이 배열에 있으면
			if (iTmp == tmpX) {

				check = true;

				// 배열의 인덱스
				cnt = i;

			}

		}

		// 배열에 있는 값이면
		if (check) {

			System.out.println("입력하신 숫자는 배열의 " + cnt + "번째 인덱스에 있습니다.");

		} else {

			// 배열에 없는 값이면
			System.out.println("입력하신 숫자는 배열에 없는 값입니다.");

		}

		// 스캐너 변수 종료
		sc.close();

	} // main 끝

} // class 끝
