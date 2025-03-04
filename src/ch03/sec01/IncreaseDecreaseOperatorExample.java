/**
 * 
 */
package ch03.sec01;

/**
 * 
 */
public class IncreaseDecreaseOperatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		
		// 12
		System.out.println("x = " + x);
		
		System.out.println("----------------------");
		y--;
		--y;
		
		// 8
		System.out.println("y = " + y);
		
		System.out.println("----------------------");
		z = x++;
		
		// 12, 13
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("----------------------");
		z = ++x;
		
		// 14, 14
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("----------------------");
		z = ++x + y++;
		
		// 23, 15, 9
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		

	} // main 끝

} // class 끝
