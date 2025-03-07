/**
 * 
 */
package ch05.sec11;

/**
 * 
 */
public class MainStringArrayArgument {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length != 2) {
			
			System.out.println("프로그램 입력 값 확인해 주세요.");
			
			// 프로그램 강제 종료
			System.exit(0);
			
		}
		
		String str1 = args[0];
		String str2 = args[1];
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + result );
		
	} // main 끝

} // class 끝
