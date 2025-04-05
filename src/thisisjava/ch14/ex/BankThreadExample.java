package thisisjava.ch14.ex;

public class BankThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String threadName = Thread.currentThread().getName();
		System.out.println("1. 현재 스레드 이름 : " + threadName);

		Bank b = new Bank();
		Thread th1 = new Thread(new AddThread("1번 ", b));
		threadName = th1.getName();
		System.out.println("2. 현재 스레드 이름 : " + threadName);

		Thread th2 = new Thread(new AddThread("2번 ", b));
		threadName = th2.getName();
		System.out.println("3. 현재 스레드 이름 : " + threadName);

		th1.start();
		th2.start();

	} // main 끝

} // class 끝
