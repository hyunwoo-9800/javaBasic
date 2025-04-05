package thisisjava.ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		// 작업 처리 코드...
		executorService.shutdownNow();
	} // main 끝

} // class 끝
