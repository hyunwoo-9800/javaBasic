package thisisjava.ch14.ex;

public class RunableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String threadName = Thread.currentThread().getName();
		System.out.println("1. 현재 스레드 이름 : " + threadName);

		Thread white = new Thread(new WhiteFlag());
		threadName = white.getName();
		System.out.println("2. 현재 스레드 이름 : " + threadName);
		white.start();

	} // main 끝

} // class 끝
