/**
 * 
 */
package ch05.sec05;

/**
 * 
 */
public class EqualsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 선언
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		// 두 변수의 참조가 같은지 확인
		if (strVar1 == strVar2) {

			System.out.println("strVar1과 strVar2는 참조가 같다.");

		} else {

			System.out.println("strVar1과 strVar2는 참조가 다르다.");
			
		}

		// 두 변수의 문자열이 같은지 확인
		if (strVar1.equals(strVar2)) {

			System.out.println("strVar1과 strVar2는 문자열이 같다.");

		}
		
		// 문자열 객체 생성
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		// 객체의 참조가 같은지 확인
		if (strVar3 == strVar4) {

			System.out.println("strVar3과 strVar4는 참조가 같다.");

		} else {

			System.out.println("strVar3과 strVar4는 참조가 다르다.");
			
		}

		// 객체의 문자열이 같은지 확인
		if (strVar3.equals(strVar4)) {

			System.out.println("strVar3과 strVar4는 문자열이 같다.");

		}

		// 빈 문자열 선언
		String hobby = "";
		
		// 공백이 선언되는지 확인하기 위함
		if (hobby.equals("")) {

			System.out.println("hobby변수가 참조하는 String 객체는 빈 문자열");

		}

	} // main 끝

} // class 끝
