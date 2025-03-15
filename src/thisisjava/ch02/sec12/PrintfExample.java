/**
 * 
 */
package thisisjava.ch02.sec12;

/**
 * 
 */
public class PrintfExample {

	/**
	 * @param args
	 * 
	 * printf 출력용 클래스
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %-6d원\n", value);
		System.out.printf("상품의 가격 : %06d원\n", value);

		double area = 3.1415 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f \n", 10, area);

		String name = "홍길동";
		String job = "도둑";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	} // main 끝

} // class 끝
