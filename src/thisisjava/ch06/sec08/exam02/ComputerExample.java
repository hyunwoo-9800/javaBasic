/**
 * 
 */
package thisisjava.ch06.sec08.exam02;

/**
 * 
 */
public class ComputerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Computer com = new Computer();
		
		// 매개변수 3개
		int result1 = com.sum(1, 2, 3);
		System.out.println("result1 = " + result1);
		
		// 매개변수 5개
		int result2 = com.sum(1, 2, 3, 4, 5);
		System.out.println("result2 = " + result2);
		
		// 배열 매개변수
		int[] values = { 1, 2, 3, 4, 5 };
		int result3 = com.sum(values);
		System.out.println("result3 = " + result3);
		
		// 인스턴스화 할때 배열전달
		int result4 = com.sum(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result4 = " + result4);
		
		
	} // main 끝

} // class 끝
