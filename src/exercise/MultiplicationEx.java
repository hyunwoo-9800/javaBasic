package exercise;

import java.util.Scanner;

public class MultiplicationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0; // 입력받은 문자열 저장
		boolean flag = true; // 입력받은 문자열 체크 플래그
		char check; // 입력받은 문자열 체크

		System.out.println("출력할 구구단 단을 입력해주세요.>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();

		// 입력 받은 문자열이 숫자인지 체크
		for (int i = 0; i < tmp.length(); i++) {
			check = tmp.charAt(i);

			// 숫자가 아니라면 flag = false
			if (Character.isDigit(check) == false) {
				flag = false;
			}

		} // 문자열 체크 for 끝

		// 입력받은 문자열이 숫자일 경우
		if (flag == true) {
			
				total = Integer.parseInt(tmp);
				
				// 입력받은 숫자의 단만 반복
				for (int i = total; i <= total; i++) {
					for (int j = 1; j < 10; j++) {
						
						// 입력받은 단수만 출력하기 위함
						if (i == total) {
							System.out.printf("%d * %d = %d%n", i, j, i * j);
						} else {
							break;
						}

					} // for 끝
				} // for 끝

		} else {
			// 입력받은 문자열이 숫자가 아닐 경우
			System.out.println("출력할 구구단 단은 숫자로 입력해주세요.");
			sc.close();
		} // if - else 끝

	} // main 끝

}
