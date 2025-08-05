package algorithm.practice.chap02;

import java.util.Scanner;

//10진수를 2 ~  36진수로 변환
public class Q6 {

	// 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환
	static int cardConv(int x, int r, char[] d) {

		int n = ((Integer) x).toString().length(); 				// 변환 전의 자릿수
		int digits = 0; 										// 변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);

		do {

			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++) {

				System.out.print('-');

			}

			System.out.println();

			if (x / r != 0) {
				
				System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n), r, x / r, x % r);
				
			} else {
				
				System.out.printf(String.format("     %%%dd    ... %%d\n", n), x / r, x % r);
				
			}
			
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;

		} while (x != 0);

		// 배열 d의 숫자 문자열을 역순으로 정렬
		for (int i = 0; i < digits / 2; i++) {

			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;

		}

		return digits;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int no; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿수
		int retry; // 다시 한번?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

		System.out.println("10진수를 기수 변환합니다.");

		do {

			do {

				System.out.print("변환하는 음이 아닌 정수: ");
				no = Integer.parseInt(sc.nextLine());

			} while (no < 0);

			do {

				System.out.println("어떤 진수로 변환할까요? (2 ~ 36): ");
				cd = Integer.parseInt(sc.nextLine());

			} while (cd < 2 || 36 < cd);

			dno = cardConv(no, cd, cno); // no를 cd진수로 변환

			System.out.print(cd + "진수로 ");

			for (int i = 0; i < dno; i++) {

				System.out.print(cno[i]);

			}

			System.out.print("입니다.");

			System.out.print("한 번 더 할까요? (1... 예 / 0... 아니요): ");
			retry = Integer.parseInt(sc.nextLine());

		} while (retry == 1);

		sc.close();

	}

}
