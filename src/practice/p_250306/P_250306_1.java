/**
 * 
 */
package practice.p_250306;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 */
public class P_250306_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int형 배열 선언
		int[] iArr = { 1, 2, 3 };

		// 반복하면서 배열값 +2 한 뒤 출력
		for (int i = 0; i < iArr.length; i++) {

			iArr[i] += 2;

			System.out.println("iArr[" + i + "] = " + iArr[i]);

		} // for 종료

	} // main 끝

} // class 끝
