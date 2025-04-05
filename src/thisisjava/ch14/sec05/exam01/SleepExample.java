package thisisjava.ch14.sec05.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// 3초 마다 소리가 나게 하는 반복문
		for (int i = 0; i < 10; i++) {

			toolkit.beep();

			try {

				Thread.sleep(3000);

			} catch (InterruptedException e) {

			}

		}

	} // main 끝

} // class 끝