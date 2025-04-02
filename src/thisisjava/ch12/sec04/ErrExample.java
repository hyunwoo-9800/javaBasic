package thisisjava.ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int value = Integer.parseInt("1oo");
			System.out.println("value = " + value);

		} catch (NumberFormatException e) {
			// TODO: handle exception

			System.err.println("[에러 내용]");
			System.err.println(e.getMessage());

		}

	} // main 끝

} // class 끝
