package thisisjava.ch12.sec03.exam01;

public class Member {

	public String id;

	public Member(String id) {

		this.id = id;

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub

		int hashCode = id.hashCode();
		System.out.println();
		System.out.println("hashCode = " + id.hashCode());
		return hashCode;

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		if (obj instanceof Member target) {

			if (id.equals(target.id)) {

				return true;

			}

		}

		return false;

	}

} // class 끝
