/**
 * 
 */
package thisisjava.ch03.sec11;

/**
 * 
 */
public class ConditionalOperationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' :'C');
		
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
	} // main 끝

} // class 끝
