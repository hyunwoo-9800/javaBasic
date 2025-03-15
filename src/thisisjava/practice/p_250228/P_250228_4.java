/**
 * 
 */
package thisisjava.practice.p_250228;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 */
public class P_250228_4 {

	/**
	 * @param args
	 * 
	 * 두 개의 값을 입력 받아 곱한 값을 출력하는 클래스
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 값을 입력 받을 스캐너 변수
		Scanner sc = new Scanner(System.in);

		// x, y가 문자열인지 체크할 변수
		char tmpX;
		char tmpY;

		// 입력된 문자에 특수기호가 포함됬는지 확인하기 위함
		String regex = "[!@#$%^&*]";
		Pattern pattern = Pattern.compile(regex);

		// 숫자일 경우에만 실행시킬 플래그
		boolean flagX = true;
		boolean flagY = true;

		// 첫 번째 값을 입력 받음
		System.out.printf("첫 번째 값을 입력해주세요. >>>");
		String strX = sc.nextLine();

		// 입력 받은 값 체크

		// 전체 문자열 만큼 반복
		for (int i = 0; i < strX.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpX = strX.charAt(i);

			// 입력 받은 문자열에 특수 문자가 포함되었는지 확인
			Matcher matcher = pattern.matcher(strX);

			// 문자열이 포함되었다면 숫자가 아님
			if (Character.isDigit(tmpX) == false) {

				flagX = false;

			// .이 포함된 경우에는 실수로 판단
			} else if (strX.contains(".")) {

				flagX = true;

			// 입력 받은 문자열이 정규식에 선언한 문자열이 포함되었다면 숫자가 아님
			} else if (matcher.find()) {

				flagX = false;

			}

		}

		// 두 번째 값을 입력 받음
		System.out.print("두 번째 값을 입력해주세요. >>>");
		String strY = sc.nextLine();

		// 전체 문자열 만큼 반복
		for (int i = 0; i < strY.length(); i++) {

			// 입력 받은 문자열을 차례대로 꺼냄
			tmpY = strY.charAt(i);

			// 입력 받은 문자열에 특수 문자가 포함되었는지 확인
			Matcher matcher = pattern.matcher(strY);

			// 문자열이 포함되었다면 숫자가 아님
			if (Character.isDigit(tmpY) == false) {

				flagY = false;

			// .이 포함된 경우에는 실수로 판단
			} else if (strX.contains(".")) {

				flagY = true;

			// 입력 받은 문자열이 정규식에 선언한 문자열이 포함되었다면 숫자가 아님
			} else if (matcher.find()) {

				flagY = false;

			}
		}

		// 플래그 체크
		if (flagX == false) {

			System.out.println("입력한 x값이 숫자가 아닙니다.");

		}

		if (flagY == false) {

			System.out.println("입력한 y값이 숫자가 아닙니다.");

		}

		// 둘다 숫자일 경우에만 값을 곱해서 출력
		if (flagX && flagY == true) {

			double x = Double.parseDouble(strX);
			double y = Double.parseDouble(strY);

			System.out.printf("%f" + " * " + "%f" + " = " + "%f 입니다.", x, y, (x * y));

		}

	} // main 끝

} // class 끝
