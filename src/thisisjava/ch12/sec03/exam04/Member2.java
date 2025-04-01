package thisisjava.ch12.sec03.exam04;

public class Member2 {

	private final String id;
	private final String name;
	private final int age;

	public Member2(String id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {

		// TODO Auto-generated method stub
		return ("Member2[id = " + id + ", name = " + name + ", age = " + age + "]");

	}

} // class 끝
