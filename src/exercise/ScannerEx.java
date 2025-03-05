package exercise;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		char tmp;
		boolean flag = true;

		System.out.println("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();

		// 입력한 문자열 만큼 반복
		for (int i = 0; i < input.length(); i++) {

			tmp = input.charAt(i);

			if (Character.isDigit(tmp) == false) {

				flag = false;

			}

		} // 문자열 확인 for 종료

		// 입력한 문자가 숫자가 아닐 경우
		if (flag == false) {
			
			System.out.println("숫자가 아닙니다.");
			scanner.close();
			
		} else {
			
			// 숫자일 경우
			int num = Integer.parseInt(input);
			
			if (input != "" && input != null) {

				System.out.println("입력내용 : " + input);
				System.out.printf("num = %d%n", num);
				scanner.close();
				
			} // if 종료
			
		} // else if 종료 

	} // main 끝

} // class 끝
