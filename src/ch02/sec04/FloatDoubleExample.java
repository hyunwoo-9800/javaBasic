/**
 * 
 */
package ch02.sec04;

/**
 * 
 */
public class FloatDoubleExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정밀도 확인
		// float 소수점 7자리, double 소수점 15자리
		float var1 = 0.1234567890123456789f;
		
		// 근사값으로 17자리까지 출력
		double var2 = 0.1234567890123456789;
		
		// 16자리까지는 잘 나옴 17자리 넘어가면 제대로 안나옴
		double var_float = 0.1234567890123456;
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var_float = " + var_float);
		
		// 10의 거듭제곱
		double var3 = 3e6;
		float var4 = 3e6F;
		
		// e는 지수 -3은 소수점 자릿수
		// 즉, 소수점 3자리로 0.002를 의미
		double var5 = 2e-3;
		
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println("var5 = " + var5);
		
	} // main 끝

} // FloatDoubleExample 끝
