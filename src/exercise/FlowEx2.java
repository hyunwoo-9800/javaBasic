package exercise;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input;
		char check;
		boolean flag = true;

		System.out.println("숫자를 하나 입력하세요.>");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); // 입력받은 값을 저장

		// 입력받은 문자열이 숫자인지 아닌지 판별
		for (int i = 0; i < tmp.length(); i++) {
			check = tmp.charAt(i);

			if (Character.isDigit(check) == false) {
				flag = false;
			}
		} // for

		if (flag == false) {
			System.out.println("숫자가 아닙니다.");
			sc.close();
		} else {
			
			input = Integer.parseInt(tmp); // 입력받은 문자열을 형변환
			
			if (input == 0) {
				System.out.println("입력하신 숫자는 0입니다.");
				sc.close();
			}

			if (input != 0) {
				System.out.println("입력하신 숫자는 0이 아닙니다.");
				System.out.printf("입력하신 숫자는 %d입니다.", input);
				sc.close();
			}
		}

	} // main

}
