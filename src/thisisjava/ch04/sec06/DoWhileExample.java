/**
 * 
 */
package thisisjava.ch04.sec06;

import java.util.Scanner;

/**
 * 
 */
public class DoWhileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 눌러주세요.");

		Scanner sc = new Scanner(System.in);
		String inputStr;

		// q를 입력받기 전까지 입력받음
		do {

			System.out.println(">");
			inputStr = sc.nextLine();
			System.out.println(inputStr);

		} while (!inputStr.equals("q")); 
		// do while 종료

		System.out.println();
		System.out.println("프로그램 종료");
		
		sc.close();

	} // main 끝

} // class 끝
