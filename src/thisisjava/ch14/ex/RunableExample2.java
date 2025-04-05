package thisisjava.ch14.ex;

public class RunableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String threadName = Thread.currentThread().getName();
		System.out.println("1. 현재 스레드 이름 : " + threadName);

		Thread blue = new Thread(new BlueFlag());
		Thread white = new Thread(new WhiteFlag());
		
		threadName = blue.getName();
		System.out.println("2. 현재 스레드 이름 : " + threadName);
		blue.start();
		
		threadName = white.getName();
		System.out.println("2. 현재 스레드 이름 : " + threadName);
		white.start();

	} // main 끝

} // class 끝
