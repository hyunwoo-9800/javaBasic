package exercise;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int user;
		int cum;

		char check; // 입력한 문자열 체크
		boolean flag = true; // 문자열이 숫자인지 아닌지 판별하기 위한 플래그

		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();

		// 입력한 문자열이 숫자가 아닐 경우 flag == false
		for (int i = 0; i < tmp.length(); i++) {
			check = tmp.charAt(i);

			if (Character.isDigit(check) == false) {
				flag = false;
				sc.close();
			}
		} // for 끝

		// 입력한 문자가 숫자일 경우
		if (flag == true) {
			user = Integer.parseInt(tmp);
			cum = (int) (Math.random() * 3) + 1; // 1, 2, 3중 하나가 저장됨

			// 입력한 값이 1 ~ 3 일경우
			if (0 < user && user < 4) {

				System.out.println("당신은 " + user + "입니다");
				System.out.println("컴은 " + cum + "입니다");

				switch (user - cum) {
				case -2:
				case -1:
					System.out.println("당신이 졌습니다");
					sc.close();
					break;

				case 2:
				case 1:
					System.out.println("당신이 이겼습니다");
					sc.close();
					break;

				case 0:
					System.out.println("비겼습니다.");
					sc.close();
					break;
				}
			} else {
				System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
				sc.close();
			} // if - else 끝

		} else {
			System.out.println("숫자로 입력해주세요");
			sc.close();
		} // if - else 끝

	} // main 끝

}
