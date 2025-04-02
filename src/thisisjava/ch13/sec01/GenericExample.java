package thisisjava.ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);

//		Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 1004;
		int value = box2.content;
		System.out.println(value);

	} // main 끝

} // class 끝
