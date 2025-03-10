/**
 * 
 */
package ch06.sec07;

/**
 * 
 */
public class Korean {

	String nation = "대한민국";
	String name = "";
	String ssn = "";
	
	/**
	 * default 생성자
	 */
	public Korean() {
		// TODO Auto-generated constructor stub
	}
	
	// 생성자
	public Korean(String name, String ssn) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.ssn = ssn;
		
	}
	
	// 생성자 오버로딩
	public Korean(String name) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		
	}

} // class 끝
