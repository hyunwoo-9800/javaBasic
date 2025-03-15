/**
 * 
 */
package thisisjava.practice.p_250307;

import java.util.Scanner;

/**
 * 
 */
public class P_250306_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int user;
		int cum;

		// 입력한 문자열 체크
		char check;

		// 문자열이 숫자인지 아닌지 판별하기 위한 플래그
		boolean flag = true;

		String strUserTmp = "";
		String strCumTmp = "";

		System.out.println("가위(0), 바위(1), 보(2) 중 하나를 입력하세요.>");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();

		// 입력한 문자열이 숫자가 아닐 경우 flag == false
		for (int i = 0; i < tmp.length(); i++) {

			check = tmp.charAt(i);

			if (!Character.isDigit(check)) {

				flag = false;

			}

		} // for 끝

		// 입력한 문자가 숫자일 경우
		if (flag) {

			// 사용자가 입력한 값
			user = Integer.parseInt(tmp);

			// 0, 1, 2중 하나가 저장됨
			cum = (int) (Math.random() * 3);

			if (user == 0) {

				strUserTmp = "가위";

			} else if (user == 1) {

				strUserTmp = "바위";

			} else {

				strUserTmp = "보";
			}

			if (cum == 0) {

				strCumTmp = "가위";

			} else if (cum == 1) {

				strCumTmp = "바위";

			} else {

				strCumTmp = "보";
			}

			// 입력한 값이 0 ~ 2 일경우
			if (-1 < user && user < 3) {

				System.out.println("당신은 " + strUserTmp + "(" + user + ")" + " 입니다.");
				System.out.println("컴퓨터는 " + strCumTmp + "(" + cum + ")" + " 입니다.");

				switch (user - cum) {

				case -2:
				case -1:
					System.out.println("당신이 졌습니다.");
					break;

				case 2:
				case 1:
					System.out.println("당신이 이겼습니다.");
					break;

				case 0:
					System.out.println("비겼습니다.");
					break;

				} // switch 끝

			} else {

				System.out.println("가위(0), 바위(1), 보(2) 중 하나를 입력하세요.>");

			} // if - else 끝

		} else {

			System.out.println("숫자로 입력해주세요");

		} // if - else 끝

		sc.close();

	} // main 끝

} // class 끝
