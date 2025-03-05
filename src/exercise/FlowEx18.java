package exercise;

public class FlowEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 10; i++) {

			for (int j = 1; j < 10; j++) {

				System.out.printf("%d * %d = %d%n", i, j, i * j);

			} // for 끝

			System.out.println();

		} // for 끝

		// 2의 배수단만 출력
		for (int i = 2; i < 10; i += 2) {

			for (int j = 1; j < 10; j++) {

				System.out.printf("%d * %d = %d%n", i, j, i * j);

			} // for 끝

			System.out.println();

		} // for 끝

		// 3의 배수단만 출력
		for (int i = 3; i < 10; i += 3) {

			for (int j = 1; j < 10; j++) {

				System.out.printf("%d * %d = %d%n", i, j, i * j);

			} // for 끝

			System.out.println();

		} // for 끝

	} // main 끝

} // class 끝
