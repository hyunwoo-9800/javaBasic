/**
 * 
 */
package thisisjava.ch06.sec07.exam04;

/**
 * 
 */
public class CarExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Car car1 = new Car();

		// 출력
		System.out.println("car1 company = " + car1.company);
		System.out.println();

		// 인스턴스화
		Car car2 = new Car("미국용");

		// 출력
		System.out.println("car2 company = " + car2.company);
		System.out.println("car2 model = " + car2.model);
		System.out.println("car2 color = " + color(car2.color));
		System.out.println();

		// 인스턴스화
		Car car3 = new Car("아시아용", "흰색");

		// 출력
		System.out.println("car3 company = " + car3.company);
		System.out.println("car3 model = " + car3.model);
		System.out.println("car3 color = " + color(car3.color));
		System.out.println();

		// 인스턴스화
		Car car4 = new Car("유럽용", "은색", 350);

		// 출력
		System.out.println("car4 company = " + car4.company);
		System.out.println("car4 model = " + car4.model);
		System.out.println("car4 color = " + color(car4.color));
		System.out.println("car4 maxSpeed = " + car4.maxSpeed);
		System.out.println();

		// 인스턴스화
		Car car5 = new Car("남미용", 300);

		// 출력
		System.out.println("car5 company = " + car5.company);
		System.out.println("car5 model = " + car5.model);
		System.out.println("car5 color = " + color(car5.color));
		System.out.println("car5 maxSpeed = " + car5.maxSpeed);
		System.out.println();

	} // main 끝

	// 색상 반환용 메서드
	public static String color(String color) {

		String tmp = "";

		if (color == null || color == "") {

			tmp = "없어요";

		} else {
			
			tmp = color;
			
		}

		color = tmp;

		return color;

	} // 메서드 종료

} // class 끝
