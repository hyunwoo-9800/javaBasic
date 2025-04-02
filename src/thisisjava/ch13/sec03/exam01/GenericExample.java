package thisisjava.ch13.sec03.exam01;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);

		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);

	} // main 끝

	// 제네릭 메서드
	public static <T> Box<T> boxing(T t) {

		Box<T> box = new Box<T>();
		box.set(t);
		return box;

	}

} // class 끝
