/**
 * 
 */
package thisisjava.practice.p_250311.exam01;

/**
 * 
 */
public class Phone {

	// 브랜드
	String brand = "";

	// 시리즈
	int series = 0;

	// 색상
	String color = "검은색";

	/**
	 * default 생성자
	 */
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 선언
	public Phone(String brand, int series, String color) {

		// 초기화
		this.brand = brand;
		this.series = series;
		this.color = color;

	}

} // class 끝
