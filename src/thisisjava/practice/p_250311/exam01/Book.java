/**
 * 
 */
package thisisjava.practice.p_250311.exam01;

/**
 * 
 */
public class Book {

	// 제목
	String title = "";

	// 시리즈
	int series = 0;

	// 페이지
	int page = 0;

	/**
	 * default 생성자
	 */
	public Book() {

		// TODO Auto-generated constructor stub
		this("제목없음", 1, 100);

	}

	// 이것이 자바다
	public Book(String title) {
		
		this(title, 1, 100);

	}

	// 신데렐라
	public Book(String title, int page) {

		this(title, 1, page);

	}

	// 노인과 바다
	public Book(int series, String title) {

		this(title, series, 100);

	}

	// 생성자
	public Book(String title, int series, int page) {

		// 초기화
		this.title = title;
		this.series = series;
		this.page = page;

	}

} // class 끝
