package algorithm.chap01;

import java.util.Scanner;

public class PrintStars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, w = 0;

		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

		do {

			System.out.print("n값 : ");
			n = Integer.parseInt(sc.nextLine());

		} while (n <= 0);

		do {

			System.out.print("w값 : ");
			w = Integer.parseInt(sc.nextLine());

		} while (w <= 0 || n < w);
		
//		System.out.println("w <= 0 || n < w : " + (w <= 0 || n < w));

		for (int i = 0; i < n / w; i++) {

			System.out.println("*".repeat(w));

			int rest = n % w;
			if (rest != 0) {
				System.out.println("*".repeat(rest));
			}

		} // for 종료
		
		sc.close();

	} // main 끝

} // class 끝
