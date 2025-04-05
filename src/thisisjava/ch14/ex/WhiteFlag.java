package thisisjava.ch14.ex;

public class WhiteFlag implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		int i = 0;

		while (true) {

			if (100 < i) {
				
				break;
				
			}

			System.out.println(i + " 백기 올려");
			i++;

		} // while 종료

		String threadName = Thread.currentThread().getName();
		System.out.println("WhiteFlag 현재 스레드 이름 : " + threadName);

	} // 메서드 종료

} // class 끝
