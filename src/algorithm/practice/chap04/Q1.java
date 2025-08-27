package algorithm.practice.chap04;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// int형 고정 길이 스택의 사용 예
public class Q1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);			// 최대 64개를 푸시 할 수 있는 스택
		ConsoleInput ci = new ConsoleInput(sc);
		
		while (true) {
			
			System.out.println();				// 메뉴 구분을 위한 빈 행
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) 푸시    (2) 팝    (3) 피크    (4) 덤프    (5) 검색    (6) 데이터 갯수    (7) 스택이 비어있니?    (8) 스택이 꽉찼니?    (0) 종료");
			
			int menu = ci.readIntInRange("\n메뉴 선택 >>", 0, 8);
			
			if (menu == 0) {
				
				break;
				
			}
			
			int x;
			
			switch (menu) {
			
			case 1:								// 푸시
				
				x = ci.readInt("데이터: ");
				
				try {
					
					s.push(x);
					
				} catch (IntStack.OverflowInStackException e) {
					
					// TODO: handle exception
					System.out.println("스택이 가득 찼습니다.");
					
				}
				
				break;
				
			case 2:								// 팝
				
				try {
					
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
					
				} catch (IntStack.EmptyInStackException e) {
					
					// TODO: handle exception
					System.out.println("스택이 비어 있습니다.");
					
				}
				
				break;
				
			case 3:								// 피크
				
				try {
					
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
					
				} catch (IntStack.EmptyInStackException e) {
					
					// TODO: handle exception
					System.out.println("스택이 비어 있습니다.");
					
				}
				
				break;

			case 4:								// 덤프
				
				s.dump();
				
				break;
				
			case 5:								// 검색
				
				int target = ci.readInt("검색할 값을 입력해주세요.");
				int idx = s.indexOf(target);
						
				if (idx == -1) {
					
					System.out.println("해당 값이 존재하지 않습니다.");
					
				} else {
					
					System.out.println("해당 값은 s[" + idx + "]에 있습니다.");
					System.out.println("s[" + idx + "] = " + s.get(idx));
					
				}
				
				break;
				
			case 6:								// 스택에 쌓여있는 데이터 개수
				
				System.out.println("현재 스택에 쌓여있는 데이터 개수는 " + s.size() + "개 입니다.");
				
				break;
				
			case 7:								// 스택이 비어있는지 확인
				
				if (s.isEmpty()) {
					
					System.out.println("스택이 비어있습니다.");
					
				} else {
					
					System.out.println("스택이 비어있지 않습니다.");
					
				}
				
				break;
				
			case 8:								// 스택이 가득 찼는지 확인
				
				if (s.isFull()) {
					
					System.out.println("스택이 가득 차 있습니다.");
					
				} else {

					System.out.println("스택이 가득 차 있지 않습니다.");
					
				}
				
				break;
				
			} // switch 종료
			
		} // while 종료
		
	}

}
