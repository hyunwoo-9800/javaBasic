/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class Test2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수값 5개를 넣을 배열
		ArrayList arr = new ArrayList();

		// 사용자가 입력할 값
		int tmpX = 0;

		// 카운트 변수
		int index = 0;

		// 스캐너 변수
		Scanner sc = new Scanner(System.in);

		// 배열에 넣을 값
		System.out.println("배열에 넣을 정수값 5개를 입력해 주세요.");
		for (int i = 0; i < 5; i++) {

			arr.add(tmpX = Integer.parseInt(sc.nextLine()));

		}

		// 임의의 숫자
		System.out.println("임의의 숫자 하나를 입력해주세요.");
		int tmp = Integer.parseInt(sc.nextLine());
		index = arr.indexOf(tmp);

		// 배열에 값이 있다면
		if (arr.contains(tmp)) {

			System.out.println("입력하신 숫자는 배열의 " + index + "번째 인덱스에 있습니다.");
			System.out.println("전체 배열은 " + arr);

		} else {

			// 배열에 없는 값이면
			System.out.println("입력하신 숫자는 배열에 없는 값입니다.");

		}

		// 스캐너 변수 종료
		sc.close();

	} // main 끝
}
