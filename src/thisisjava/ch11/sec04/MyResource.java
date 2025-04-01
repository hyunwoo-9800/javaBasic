package thisisjava.ch11.sec04;

// 리소스 닫기
public class MyResource implements AutoCloseable {

	private String name;

	public MyResource(String name) {

		this.name = name;
		System.out.println("[MyResoucre(" + name + ") 열기]");

	}

	public String read1() {

		System.out.println("[MyResoucre(" + name + ") 읽기]");
		return "100";

	}

	public String read2() {

		System.out.println("[MyResoucre(" + name + ") 읽기]");
		return "abc";

	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("[MyResoucre(" + name + ") 닫기]");

	}

} // class 끝
