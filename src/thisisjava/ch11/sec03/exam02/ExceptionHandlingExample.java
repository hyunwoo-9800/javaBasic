package thisisjava.ch11.sec03.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = { "100", "1oo", null, "200"};

		for (int i = 0; i < array.length; i++) {

			try {

				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "] = " + value);

			} catch (ArrayIndexOutOfBoundsException e) {

				// TODO: handle exception\
				System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());

			} catch (NumberFormatException | NullPointerException e) {

				// TODO: handle exception
				System.out.println("데이터 문제 : " + e.getMessage());

			} catch (Exception e) {

				// TODO: handle exception
				System.out.println("일반 에러 : " + e.getMessage());

			} // try - catch 종료

		} // for 종료

	} // main 끝

} // class 끝
