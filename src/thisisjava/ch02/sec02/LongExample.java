/**
 * 
 */
package thisisjava.ch02.sec02;


/**
 * 
 */
public class LongExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long var1 = 10;
		long var2 = 20L;
		
		// 뒤에 L or l이 없어서 int로 취급해서 에러
		//long var3 = 10000000000000;
		
		long var4 = 10000000000000L;
		
		System.out.println("var 1 = " + var1);
		System.out.println("var 2 = " + var2);
		//System.out.println("var 3 = " + var3);
		System.out.println("var 4 = " + var4);
	

	} // main 끝

} // LongExample 끝
