package thisisjava.ch12.sec04;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {

			System.out.println(i);

			if (i == 5) {

				// JVM 프로세스 종료
				System.out.println("프로세스 강제 종료");
				System.exit(0);

			}

		}

	} // main 끝

} // class 끝
