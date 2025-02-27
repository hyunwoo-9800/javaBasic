/**
 * 
 */
package ch02.sec06;

/**
 * 
 */
public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "홍길동";
		String job = "프로그래머";
		System.out.println("name = " + name);
		System.out.println("job = " + job);
		
		System.out.println("=========================");

		// 문자 포함
		String str = "나는 \'자바를\' 배웁니다.";
		System.out.println(str);

		System.out.println("=========================");
		
		// 탭 넣기
		str = "번호\t이름\t직업";
		System.out.println(str);

		System.out.println("=========================");
		
		// 개행
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.			?");
		
		System.out.println("\n=========================");
		
		System.out.println("나는");
		System.out.println("자바를");
		System.out.println("배웁니다.");
		
		System.out.println("=========================");	
			
	} // main 끝

} // StringExample 끝
