/**
 * 
 */
package practice.p_250304;

/**
 * 
 * 값 변경
 * 
 */
public class P_250304_61 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 6;
		int c = 7;
		
		// 오른 쪽의 값을 왼쪽에 대입 하므로 b에 c의 값이 대입되고
		// c의 값이 된 b의 값이 a에 대입 되므로 전부 c값으로 변경된다.
		a = b = c;
		
		System.out.println("a = " + a + ", " + "b = " + b + ", " + "c = " + c);


	} // main 끝

} // class 끝
