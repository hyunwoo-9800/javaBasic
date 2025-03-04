/**
 * 
 */
package practice.p_250304;

/**
 * 
 * 반지름 계산
 * 
 */
public class P_250304_80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pie = 3.141592;
		double twoPizza = (20 * 20 * pie) * 2;
		double onePizza = 30 * 30 * pie;
		
		System.out.println("20cm 피자 2개의 면적은 " + twoPizza);
		System.out.println("30cm 피자 1개의 면적은 " + onePizza);

		boolean result = (twoPizza < onePizza) ? true : false;

		if (result == true) {

			System.out.println("30cm 피자 1개를 주문 하는 게 더 좋아요~~");

		}

		if (result == false) {

			System.out.println("20cm 피자 2개를 주문 하는 게 더 좋아요~~");

		}

	} // main 끝

}
// class 끝
