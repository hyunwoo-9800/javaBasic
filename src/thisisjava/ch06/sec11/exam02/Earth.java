/**
 * 
 */
package thisisjava.ch06.sec11.exam02;

/**
 * 상수 연습
 */
public class Earth {

	// 상수 선언
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	/**
	 * default 생성자
	 */
	public Earth() {
		// TODO Auto-generated constructor stub
	}

	// 정적블록에서 초기화
	static {

		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;

	}

} // class 끝
