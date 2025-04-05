package thisisjava.ch14.sec05.exam03;

public class WorkThread extends Thread {

	// 필드
	public boolean work = true;

	// 생성자
	public WorkThread(String name) {
		setName(name);
	}

	// 메소드
	@Override
	public void run() {

		// 무한 반복
		while (true) {

			if (work) {

				System.out.println(getName() + ": 작업처리");

			} else {

				Thread.yield();

			}

		}

	}

} // class 끝
