package algorithm.practice.chap04;

// 머리가 둘인 int형 고정 길이 스택
public class DoubleHeadIntStack {

	private int[] stk; // 스택의 본체
	private int capacity; // 스택 용량(A B의 합계)
	private int ptrA; // 스택 포인터 A
	private int ptrB; // 스택 포인터 B

	public enum AorB {

		StackA, StackB

	}

	// 실행 시 예외 : 스택이 비어 있음
	@SuppressWarnings("serial")
	public class EmptyDoubleHeadIntStackException extends RuntimeException {

		public EmptyDoubleHeadIntStackException() {

		}

	}

	// 실행 시 예외 : 스택이 가득 참
	@SuppressWarnings("serial")
	public class OverflowDoubleHeadIntStackException extends RuntimeException {

		public OverflowDoubleHeadIntStackException() {

		}

	}

	// 생성자
	public DoubleHeadIntStack(int maxlen) {
		
		ptrA = 0;
		ptrB = maxlen - 1;
		capacity = maxlen;
		
		try {
			
			stk = new int[capacity]; // 스택 본체용 배열을 생성
			
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			
			capacity = 0;
			
		}
		
	}
	
	// 스택에 x를 푸시
	public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException {
		
		// 스택이 가득 찼을 때
		if (ptrB + 1 <= ptrA) {
			
			throw new OverflowDoubleHeadIntStackException();
			
		}
		
		switch (sw) {
		
		case StackA:
			
			stk[ptrA++] = x;
			break;

		case StackB:
			
			stk[ptrB--] = x;
			break;
			
		}
		
		return x;
		
	} // push 종료
	
	// 스택에서 데이터를 팝
	public int pop(AorB sw) throws EmptyDoubleHeadIntStackException {
		
		int x = 0;
		
		switch (sw) {
		
		case StackA:
			
			// 스택 A가 비어 있음
			if (ptrA <= 0) {
				
				throw new EmptyDoubleHeadIntStackException();
				
			}
			
			x = stk[--ptrA];
			break;

		case StackB:
			
			// 스택 B가 비어 있음
			if (capacity - 1 <= ptrB) {
				
				throw new EmptyDoubleHeadIntStackException();
				
			}
			
			x = stk[++ptrB];
			break;
			
		}
		
		return x;
		
	} // pop 종료
	
	// 스택에서 데이터를 피크
	public int peek(AorB sw) throws EmptyDoubleHeadIntStackException {
		
		int x = 0;
		
		switch (sw) {
		
		case StackA:
			
			// 스택 A가 비어 있음
			if (ptrA <= 0) {
				
				throw new EmptyDoubleHeadIntStackException();
				
			}
			
			x = stk[ptrA - 1];
			break;

		case StackB:
			
			// 스택 B가 비어 있음
			if (capacity - 1 <= ptrB) {
				
				throw new EmptyDoubleHeadIntStackException();
				
			}
			
			x = stk[ptrB + 1];
			break;
			
		}
		
		return x;
		
	} // peek 종료
	
	// 스택에서 x를 검색하여 인덱스를 반환
	public int indexOf(AorB sw, int x){
		
		switch (sw) {
		
		case StackA:
			
			// 위에서 부터 선형검색
			for (int i = ptrA - 1; 0 <= i; i--) {
				
				if (stk[i] == x) {
					
					return i;
					
				}
				
			}
			
			break;

		case StackB:
			
			// 위에서 부터 선형검색
			for (int i = ptrB + 1; i < capacity; i++) {
				
				if (stk[i] == x) {
					
					return i;
					
				}
				
			}
			
			break;
			
		}
		
		return -1;	// 검색 실패
		
	} // indexOf 종료
	
	// 스택을 비움
	public void clear(AorB sw) {
		
		switch (sw) {
		
		case StackA:
			
			ptrA = 0;
			break;

		case StackB:
			
			ptrB = capacity - 1;
			break;
			
		}
		
	} // clear 종료
	
	// 스택의 용량을 반환(A와 B의 합계)
	public int getCapacity() {
		
		return capacity;
		
	}
	
	// 스택에 쌓여있는 데이터수를 반환
	public int size(AorB sw) {
		
		switch (sw) {
		
		case StackA:
			
			return ptrA;
			
		case StackB:
			
			return capacity - ptrB - 1;

		}
		
		return 0;
		
	} // size 종료
	
	// 스택이 비어있는지 확인
	public boolean isEmpty(AorB sw) {
		
		switch (sw) {
		
		case StackA:
			
			return ptrA <= 0;
			
		case StackB:
			
			return capacity - 1 <= ptrB;

		}
		
		return true;
		
	} // isEmpty 종료
	
	// 스택이 가득 차있는지 확인
	public boolean isFull() {
		
		return ptrB + 1 <= ptrA;
		
	} // isFull 종료
	
	// 스택의 모든 데이터를 아래에서 위 순서로 출력
	public void dump(AorB sw) {
		
		switch (sw) {
		
		case StackA:
			
			if (ptrA <= 0) {
				
				System.out.println("스택이 비어 있습니다.");
				
			} else {
				
				for (int i = 0; i < ptrA; i++) {
					
					System.out.print(stk[i] + " ");
					
				}
				
				System.out.println();
				
			}
			
			break;
			
		case StackB:
			
			if (capacity - 1 <= ptrB) {
				
				System.out.println("스택이 비어 있습니다.");
				
			} else {
				
				for (int i = capacity - 1; ptrB < i; i--) {
					
					System.out.print(stk[i] + " ");
					
				}
				
				System.out.println();
				
			}
			
			break;

		}
		
	} // dump 종료

}
