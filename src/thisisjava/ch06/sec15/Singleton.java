package thisisjava.ch06.sec15;

// 싱글톤 클래스
public class Singleton {

	// private 정적 필드
	private static Singleton singleton = new Singleton();
	private int count = 0;

	
	// private 생성자
	private Singleton() {

		System.out.println("싱글톤 생성자 카운트");
		
	}

	// 접근 가능한 정적 메서드
	public static Singleton getInstance() {

		System.out.println("getInstance count before = " + singleton.count);
		singleton.count++;
		System.out.println("getInstance count after = " + singleton.count);
		return singleton;

	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count++;
	}

} // class 끝
