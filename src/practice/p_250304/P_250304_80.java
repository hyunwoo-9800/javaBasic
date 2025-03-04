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

		// 파이 값
		double pie = 3.141592;
		
		// 반지름 20cm인 피자 2개의 면적 
		double twoPizza = (20 * 20 * pie) * 2;
		
		// 반지름 30cm인 피자 1개의 면적
		double onePizza = 30 * 30 * pie;
		
		// 각 피자의 면적 출력
		System.out.println("20cm 피자 2개의 면적은 " + twoPizza);
		System.out.println("30cm 피자 1개의 면적은 " + onePizza);

		// 피자 2개의 면적 < 피자 1개의 면적 일 경우 true
		boolean result = (twoPizza < onePizza) ? true : false;

		// 피자 2개가 피자 1개보다 양이 작을 때
		if (result == true) {

			System.out.println("30cm 피자 1개를 주문 하는 게 더 좋아요~~");

		}

		// 피자 1개가 피자 2개보다 양이 작을 때
		if (result == false) {

			System.out.println("20cm 피자 2개를 주문 하는 게 더 좋아요~~");

		}

	} // main 끝

}
// class 끝
