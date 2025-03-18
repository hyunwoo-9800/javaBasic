/**
 * 
 */
package thisisjava.ch06.sec11.exam01;

/**
 * final 연습
 * 
 */
public class Korean {

	final String nation = "대한민국";
	final String ssn;

	String name = "";

	/**
	 * default 생성자
	 */
	public Korean() {

		this.ssn = "";
		// TODO Auto-generated constructor stub

	}

	public Korean(String ssn, String name) {

		this.ssn = ssn;
		this.name = name;

	}

} // class 끝
