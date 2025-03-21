/**
 * 
 */
package thisisjava.javaTest;

import java.util.Scanner;

public class BaseBallGame2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int user = 0;
		int com = 0;

		int cnt = 0;
		int outCnt = 0;

		for (;;) {

			com = 1;

			System.out.println("숫자를 입력 해주세요");
			user = Integer.parseInt(sc.nextLine());

			if (user == com) {

				System.out.println("안타입니다.");

			} else {

				System.out.println("아웃입니다.");
				outCnt++;

				if (outCnt == 3) {

					cnt++;
					System.out.println(cnt + "회 종료");

					if (cnt == 3) {

						cnt = 0;

					}

					continue;

				}

			}

		}

	} // main 끝

} // class 끝
