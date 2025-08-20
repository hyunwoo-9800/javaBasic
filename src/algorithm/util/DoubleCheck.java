package algorithm.util;

import java.util.Scanner;

// Double형 및 입력 값 체크용 유틸 클래스
public class DoubleCheck {

	// 입력 전용 메서드
	public Double getValidInt(String message, Scanner sc) {

		String input;

		while (true) {

			System.out.print(message);
			input = sc.nextLine();

			if (!stringCheck(input)) {

				System.out.println("숫자만 입력해주세요.");
				continue;

			}

			try {

				Double result = Double.parseDouble(input); 	// 범위 안이면 통과

				return result;

			} catch (NumberFormatException e) {
				// TODO: handle exception

				System.out.println("실수범위만 허용 합니다.");

			}

		}

	}

	// 입력 값 체크
	public boolean stringCheck(String str) {

		return str.matches("^[0-9]*\\.[0-9]+$");	// 실수만 허용

	}

}
