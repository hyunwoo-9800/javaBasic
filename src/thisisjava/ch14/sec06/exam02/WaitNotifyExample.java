package thisisjava.ch14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {

		WorkObject workObject = new WorkObject();

		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);

		threadA.start();
		threadB.start();

	} // main 끝

} // class 끝
