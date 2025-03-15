/**
 * 
 */
package thisisjava.ch02.sec08;

/**
 * 
 */
public class CastingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 강제 타입 변환
		
		// 10 출력
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println("var2 = " + var2);
		
		// 300 출력
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println("var4 = " + var4);
		
		// 'A' 출력
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println("var6 = " + var6);
		
		// 3 출력
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println("var8 = " + var8);
		
		// byte의 범위가 -128 ~ 127인데 그 범위를 넘어가는 값(300)을
		// 강제 변환 할 때 범위가 넘어가서 이상한 값이 출력됨
		int i = 300;
		byte b = (byte) i;
		System.out.println("b = " + b);

	} // main 끝

} // CastingExample 끝
