package exercise;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 0;
		// 입력한 문자열 체크
		char check;

		// 문자열이 숫자인지 아닌지 판별하기 위한 플래그
		boolean flag = true;

		System.out.println("현재 월을 입력하세요.>");

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

		// 입력받은 문자가 숫자일 경우
		if (flag == true) {
			
			month = Integer.parseInt(tmp);

			// 입력받은 숫자가 1 ~ 12일 경우
			if (0 < month && month < 13) {
				
				switch (month) {
				
				case 3:
				case 4:
				case 5:
					System.out.println("현재 계절은 봄입니다");
					sc.close();
					break;

				case 6:
				case 7:
				case 8:
					System.out.println("현재 계절은 여름입니다");
					sc.close();
					break;

				default:
					System.out.println("현재 계절은 봄입니다");
					sc.close();
					break;
					
				} // switch 종료
				
			} else {
				
				System.out.println("1부터 12까지의 숫자로 입력해주세요.");
				sc.close();
				
			} // if - else 끝

		} else {
			
			System.out.println("현재 월은 숫자로 입력해주세요.");
			sc.close();
			
		} // if - else 끝

	} // main 끝

} // class 끝
