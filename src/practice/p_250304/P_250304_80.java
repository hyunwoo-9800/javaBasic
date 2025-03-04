/**
 * 
 */
package practice.p_250304;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 반지름 계산
 * 
 */
public class P_250304_80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pie = 3.141592;
		double num = (20 * 20 * pie) * 2;
		double num2 = 30 * 30 * pie;
		
		boolean flag = num < num2;
		
		flag = false ? false : true;
		
		
		if (flag == false) {
			
			System.out.println("20cm 피자 2개를 주문하는게 더 좋아요");
			
		} else {
			
			System.out.println("30cm 피자 1개를 주문하는게 더 좋아요");
			
		}
		
		
		
	} // main 끝

}
// class 끝
