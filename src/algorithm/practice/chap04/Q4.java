package algorithm.practice.chap04;

import java.util.Scanner;

import algorithm.util.ConsoleInput;

// int형 고정 길이 큐(링 버퍼를 사용하지 않고 구현)의 사용 예
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);				// 입력값 검증용
		IntArrayQueue s = new IntArrayQueue(64);			// 최대 64개 푸시 할 수 있는 머리가 둘인 스택
		
		while (true) {
			
			System.out.println("현재 데이터 개수 : " + s.size() + "/" + s.getCapacity());
			System.out.print("( 1) 인큐    ( 2) 디큐    ( 3) 피크    ( 4) 덤프    ( 0 )종료 : ");
			
			int menu = ci.readIntInRange("\n메뉴 선택 >>", 0, 4);
			
			if (menu == 0) {
				
				break;
				
			}
			
			int n = 0;
			int x = 0;
			
			switch (menu) {
			
			case 1:																		// 인큐
				
				x = ci.readInt("데이터: ");
				
				try {
					
					s.enque(x);
					
				} catch (IntArrayQueue.OverflowIntArrayQueueException e) {
					
					// TODO: handle exception
					System.out.println("큐가 가득 찼습니다.");
					
				}
				
				break;
				
			case 2:																		// 디큐
				
				try {
					
					x = s.deque();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
					
				} catch (IntArrayQueue.OverflowIntArrayQueueException e) {
					
					// TODO: handle exception
					System.out.println("큐가 비어 있습니다.");
					
				}
				
				break;
				
			case 3:																		// 피크
				
				try {
					
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
					
				} catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					
					// TODO: handle exception
					System.out.println("큐가 비어 있습니다.");
					
				}
				
				break;
				
			case 4:																		// 덤프
				
				s.dump();
				
				break;
				
				
			case 5:																		// A에서 검색
				
				x = ci.readInt("검색할 데이터 : ");
				n = s.indexOf(x);
				
				if (0 <= n) {
					
					System.out.println("앞 에서 " + (s.size() - n) + "번째에 있습니다.");
					
				} else {
					
					System.out.println("그 데이터가 없습니다.");
					
				}
				
				break;
				
			case 6:																		// 큐를 비움
				
				s.clear();
				break;
				
			} // switch 종료
			
		} // while 종료
		
	}
	
}
