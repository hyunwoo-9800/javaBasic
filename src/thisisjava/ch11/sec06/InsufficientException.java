package thisisjava.ch11.sec06;

// 사용자 정의 예외
public class InsufficientException extends Exception {

	// default 생성자
	public InsufficientException() {
		
	}

	public InsufficientException(String message) {

		super(message);

	}

} // class 끝
