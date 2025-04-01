package thisisjava.ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (MyResource res = new MyResource("A")) {

			String data = res.read1();
			int value = Integer.parseInt(data);
			
			System.out.println("value = " + value);

		} catch (Exception e) {

			System.out.println("예외 처리: " + e.getMessage());

		} // try - catch

		// 사용 불가
//		res.read1();

		System.out.println("\n====================\n"); 									// 개행용

		try (MyResource res = new MyResource("A")) {

			String data = res.read2();
//			NumberFormatException 발생
			int value = Integer.parseInt(data);
			
			System.out.println("value = " + value);

		} catch (Exception e) {

			System.out.println("예외 처리 : " + e.getMessage());

		} // try - catch

		System.out.println("\n====================\n"); 									// 개행용

		// 39 ~ 49행과 53 ~ 65행의 코드는 같은 의미
		try (MyResource res1 = new MyResource("A");
			 MyResource res2 = new MyResource("B")) {
			
			String data1 = res1.read1();
			String data2 = res2.read1();
			System.out.println("data1 = " + data1);
			System.out.println("data2 = " + data2);
			
		} catch (Exception e) {
			
			System.out.println("예외 처리: " + e.getMessage());
			
		}
		
		System.out.println("\n====================\n"); 									// 개행용
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");

		try (res1; res2) {

			String data1 = res1.read1();
			String data2 = res2.read1();
			System.out.println("data1 = " + data1);
			System.out.println("data2 = " + data2);

		} catch (Exception e) {

			System.out.println("예외 처리: " + e.getMessage());

		} // try - catch

	} // main 끝

} // class 끝
