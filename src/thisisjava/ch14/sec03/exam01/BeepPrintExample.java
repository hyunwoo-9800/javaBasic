package thisisjava.ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// 소리 5번 울리게 하는 반복문
		for (int i = 0; i < 5; i++) {

			toolkit.beep();

			try {

				Thread.sleep(500);

			} catch (Exception e) {

			}

		}

		// "띵" 글자를 출력할 반복문
		for (int i = 0; i < 5; i++) {

			System.out.println("띵");

			try {

				Thread.sleep(500);

			} catch (Exception e) {

			}

		}

	} // main 끝

} // class 끝
