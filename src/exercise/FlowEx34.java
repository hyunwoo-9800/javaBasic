package exercise;

import java.util.Scanner;

public class FlowEx34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu = 0;
		int num = 0;

		// 입력한 문자열 체크
		char check;

		// 문자열이 숫자인지 아닌지 판별하기 위한 플래그
		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		// outer은 while문의 이름
		// 반복이 여러번 일어날 때 break시 지정된 while문 전체를 벗어나기 위함
		outer: while (true) {

			System.out.println();
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.printf("원하는 메뉴(1~3)을 선택하세요.%n종료하시려면 0을 입력해주세요.>");

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

				menu = Integer.parseInt(tmp);

				if (menu == 0) {

					System.out.println("시스템을 종료합니다.");
					sc.close();
					break;

				} else if (!(1 <= menu && menu <= 3)) {

					System.out.printf("메뉴를 잘못 선택하셨습니다.%n종료하시려면 0을 입력해주세요.");
					continue;

				} // if 끝

				// 무한 반복
				for (;;) {

					System.out.println();
					System.out.printf("계산할 값을 입력하세요.%n계산종료는 0을 전체종료는 99를 입력해주세요.>");
					tmp = sc.nextLine();
					num = Integer.parseInt(tmp);

					// 계산 종료. for문을 벗어남
					if (num == 0) {

						break;

					}

					// 전체 종료. for문과 while문을 벗어남
					if (num == 99) {

						break outer;

					}

					// 입력한 값에 따라 출력 하기 위함
					switch (menu) {
					case 1: {

						System.out.println("result = " + num * num);
						break;

					}
					case 2: {

						System.out.println("result = " + Math.sqrt(num));
						break;

					}
					case 3: {

						System.out.println("result = " + Math.log(num));
						break;

					}

					} // switch 끝

					sc.close();

				} // for(;;) 끝

			} else {

				System.err.println("숫자로 입력해주세요.");
				break;

			} // if - else 끝

		} // while 끝

	} // main 끝

} // class 끝
