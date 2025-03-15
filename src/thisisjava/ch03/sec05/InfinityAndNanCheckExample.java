/**
 * 
 */
package thisisjava.ch03.sec05;

/**
 * 
 */
public class InfinityAndNanCheckExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;

//		int y = x / 0;
//		int z = x % 0;
//
//		System.out.println("x = " + x + " y = " + y + " z = " + z);

		double y1 = 0.0;
		double z1 = x / y1;
		double z2 = x % y1;

		System.out.println("Double.isInfinite(z1) = " + Double.isInfinite(z1));
		System.out.println("Double.isInfinite(z1) = " + Double.isNaN(z1));
		System.out.println("Double.isInfinite(z1) = " + Double.isInfinite(z2));
		System.out.println("Double.isInfinite(z1) = " + Double.isNaN(z2));

		if (Double.isInfinite(z1) || Double.isNaN(z1)) {

			System.out.println("분모 값을 확인해 주세요.");

		} else {

			System.out.println(z1 + 1);

		}

	} // main 끝

} // class
