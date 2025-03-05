/**
 * 
 */
package ch04.sec03;

/**
 * 
 */
public class SwitchValueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade = "B";

		// Java 11이전
		int score1 = 0;
		switch (grade) {

			case "A":
				score1 = 100;
				break;
	
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
	
			default:
				score1 = 60;
				break;

		} // switch 끝

		System.out.println("score1 = " + score1);

		int score2 = switch (grade) {

						case "A" -> 100;
				
						case "B" -> {
				
							int result = 100 - 20;
							yield result;
				
						}
				
						default -> 60;

		}; // switch 끝

		System.out.println("score2 = " + score2);
		
	} // main 끝

} // class 끝
