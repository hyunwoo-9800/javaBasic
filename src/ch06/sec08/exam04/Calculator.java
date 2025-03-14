/**
 * 
 */
package ch06.sec08.exam04;

/**
 * 메서드 오버로딩
 */
public class Calculator {

	// 가로
	int width = 0;
	
	// 세로
	int height = 0;
	
	/**
	 * default 생성자
	 */
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	// 정사각형의 넓이를 구하는 메서드
	String areaRectangle(int width) {

		this.width = width;
		return "정사각형의 넓이는 " + (this.width * this.width) + " 입니다.";

	} // 메서드 종료

	// 직사각형의 넓이를 구하는 메서드
	String areaRectangle(int width, int height) {

		this.width = width;
		this.height = height;
		return "직사각형의 넓이는 " + (this.width * this.height) + " 입니다.";

	} // 메서드 종료

} // class 끝
