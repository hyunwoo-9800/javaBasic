package algorithm.chap01;

import java.util.Scanner;

public class TwoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int no = 0;

		System.out.println("2자리의 양수를 입력하세요.");

		do {

			System.out.print("no값 : ");
			no = Integer.parseInt(sc.nextLine());

		} while (no < 10 || 99 < no);
		
		System.out.println("변수 no 값은 " + no + "이 되었습니다.");
		
		sc.close();

	} // main 끝

} // class 끝
