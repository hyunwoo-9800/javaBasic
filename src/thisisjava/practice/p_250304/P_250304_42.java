/**
 * 
 */
package thisisjava.practice.p_250304;

/**
 * 
 * 출력 연습
 * 
 */
public class P_250304_42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte
		byte a1 = 10;
		byte a2;
		a2 = 11;

		System.out.println("바이트형 출력 연습");
		// 10
		System.out.println("a1 = " + a1);

		// 11
		System.out.println("a2 = " + a2);

		// 21
		System.out.println("a1 + a2 = " + (a1 + a2));

		// 11
		System.out.println("a1 + 1 = " + (a1 + 1));

		System.out.print("==============================");
		System.out.println("\n");

		// short
		short s1 = 10;
		byte s2;
		s2 = 11;

		System.out.println("short형 출력 연습");
		// 10
		System.out.println("s1 = " + s1);

		// 11
		System.out.println("s2 = " + s2);

		// 21
		System.out.println("s1 + s2 = " + (s1 + s2));

		// 11
		System.out.println("s1 + 1 = " + (s1 + 1));

		System.out.print("==============================");
		System.out.println("\n");

		// int
		int i1 = 10;
		int i2;
		i2 = 11;

		System.out.println("int형 출력 연습");
		// 10
		System.out.println("i1 = " + i1);

		// 11
		System.out.println("i2 = " + i2);

		// 21
		System.out.println("i1 + i2 = " + (i1 + i2));

		// 11
		System.out.println("i1 + 1 = " + (i1 + 1));

		System.out.print("==============================");
		System.out.println("\n");

		// long
		long l1 = 10L;
		long l2;
		l2 = 11;

		System.out.println("long형 출력 연습");
		// 10
		System.out.println("l1 = " + l1);

		// 11
		System.out.println("l2 = " + l2);

		// 21
		System.out.println("l1 + l2 = " + (l1 + l2));

		// 11
		System.out.println("l1 + 1 = " + (l1 + 1));

		System.out.print("==============================");
		System.out.println("\n");

		// float
		float f1 = 10.23F;
		float f2;
		f2 = 11.f;

		System.out.println("float형 출력 연습");
		// 10.23
		System.out.println("f1 = " + f1);

		// 11.0
		System.out.println("f2 = " + f2);

		// 21.23
		System.out.println("f1 + f2 = " + (f1 + f2));

		// 11.63
		System.out.println("f1 + 1.4f = " + (f1 + 1.4f));

		System.out.print("==============================");
		System.out.println("\n");

		// double
		double d1 = 10.23;
		double d2;
		d2 = 11.94;

		System.out.println("double형 출력 연습");
		// 10.23
		System.out.println("d1 = " + d1);

		// 11.94
		System.out.println("d2 = " + d2);

		// 22.17
		System.out.println("d1 + d2 = " + (d1 + d2));

		// 20.63
		System.out.println("d1 + 10.4 = " + (d1 + 10.4));

		System.out.print("==============================");
		System.out.println("\n");

		// String
		String str1 = "Hello";
		String str2 = "World";
		d2 = 11.94;

		System.out.println("String형 출력 연습");

		// Hello
		System.out.println("str1 = " + str1);

		// Hellowold
		System.out.println(str1 + "world");

		// HelloWorld
		System.out.println(str1 + str2);

		str1 = "new Word";
		String str3 = str1 + str2;

		// new WordWorld
		System.out.println("str3 = " + str3);

	} // main 끝

} // class 끝
