package algorithm.practice.chap01;

import java.util.Scanner;

public class RectangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("정사각형을 출력합니다.");
		int lenth = 0;
		do {

			System.out.print("변의 길이 : ");

			lenth = Integer.parseInt(sc.nextLine());

		} while (lenth <= 0);

		for (int i = 0; i < lenth; i++) {

			for (int j = 0; j < lenth; j++) {

				System.out.print("*");

			}

			System.out.println();
		}

		sc.close();

	} // main 끝

} // class 끝
