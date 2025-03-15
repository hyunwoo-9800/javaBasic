/**
 * 
 */
package thisisjava.ch05.sec05;
/**
 * 
 */
public class ReplaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 선언 및 대체
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);

	} // main 끝

} // class 끝
