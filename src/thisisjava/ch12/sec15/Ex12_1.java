package thisisjava.ch12.sec15;

public class Ex12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("Hello");

		// 기존 문자열 뒤에 삽입
		str.append(" World");
		System.out.println(str);
		System.out.println("문자열 길이 = " + str.length() + "\n");

		// 문자열 삭제
		str.delete(0, 6);
		System.out.println(str);
		System.out.println("문자열 길이 = " + str.length() + "\n");

		// 원하는 위치에 문자열 삽입
		str.insert(0, "Hello");
		System.out.println(str);
		System.out.println("문자열 길이 = " + str.length() + "\n");

		// 문자를 반대로 출력
		str.reverse();
		System.out.println(str + "\n");

		str.setLength(0);
		System.out.println("str = " + str + "\n");

	} // main 끝

} // class 끝
