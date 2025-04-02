package thisisjava.ch12.sec15;

public class Ex12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형 타입 선언
		// 생성자를 통한 선언은 JDK 1.9부터 사용하지 않는 것을 권장
		Integer num01 = new Integer(10);
		Integer num02 = Integer.valueOf(10);

		// 실수형 타입 선언
		Double doubleNum01 = Double.valueOf(30.11);

		// 문자형 타입 선언
		Character ch = Character.valueOf('A');

		System.out.println("정수형1 : " + num01);
		System.out.println("정수형2 : " + num02);
		System.out.println("실수형 : " + doubleNum01);
		System.out.println("문자형 : " + ch);

		System.out.println("num01 == num02 : " + (num01 == num02));
		System.out.println("num01.equals(num02) : " + num01.equals(num02));

		String intStr = "70";
		String doubleStr = "60.5";

		int myScore = Integer.parseInt(intStr);
		double cutLineScore = Double.parseDouble(doubleStr);

		if (cutLineScore <= myScore) {

			System.out.println("합격입니다.");

		} else {

			System.out.println("불합격입니다.");

		}

	} // main

} // class 끝
