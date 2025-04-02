package thisisjava.ch12.sec04;

public class InExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int speed = 0;
		int keyCode = 0;

		while (true) {

			// Enter 키를 누르지 않았을때 실행
			if (keyCode != 13 && keyCode != 10) {

				// 숫자 1일 경우
				if (keyCode == 49) {

					speed++;

					// 숫자 2일 경우
				} else if (keyCode == 50) {

					speed--;

					// 숫자 3일 경우
				} else if (keyCode == 51) {

					break;

				}

				System.out.println("---------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("현재 속도 = " + speed);
				System.out.println("선택 : ");

			}

			// 입력한 키를 하나씩 읽음
			keyCode = System.in.read();

		}

		System.out.println("시스템 종료");

	} // main 끝

} // class 끝