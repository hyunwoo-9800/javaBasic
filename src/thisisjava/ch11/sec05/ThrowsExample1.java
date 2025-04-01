package thisisjava.ch11.sec05;

public class ThrowsExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {

			findClass();

		} catch (ClassNotFoundException e) {

			// TODO: handle exception
			System.out.println("예외 처리 : " + e.toString());

		} // try - catch

		findClass();

	} // main 끝

	// 메서드
	public static void findClass() throws ClassNotFoundException {

		Class.forName("java.lang.String2");

	}

} // class 끝
