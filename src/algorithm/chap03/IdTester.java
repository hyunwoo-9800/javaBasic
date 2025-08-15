package algorithm.chap03;

import lombok.Data;

// 아이디를 부여하는 클래스
@Data
class Id {
	
	private static int cnt = 0;		// 아이디를 몇 개 부여했는지 저장(클래스 변수)
	private int id;					// 아이디(인스턴스 변수)
	
	// 생성자
	public Id() {
		
		id = ++cnt;
		
	}
	
	public static int getCnt() {
		
		return cnt;
		
	}
	
}

public class IdTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Id a = new Id();	// 아이디 1
		Id b = new Id();	// 아이디 2
		
		System.out.println("a의 아이디: " + a.getId());
		System.out.println("b의 아이디: " + b.getId());
		
		System.out.println("부여한 아이디의 개수: " + Id.getCnt());

	}

}
