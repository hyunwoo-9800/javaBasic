package algorithm.practice.chap04;

// int형 고정 길이 스택
public class IntStack {

	private int[] stk;		// 스택용 배열
	private int capacity;	// 스택 용량
	private int ptr;		// 스택 포인터
	
	// 실행 시 예외(스택이 비어있음)
	@SuppressWarnings("serial")
	public class EmptyInStackException extends RuntimeException {
		
		public EmptyInStackException() {
			
		}
		
	}
	
	// 실행 시 예외(스택이 가득 참)
	@SuppressWarnings("serial")
	public class OverflowInStackException extends RuntimeException {
		
		public OverflowInStackException() {
			
		}
		
	}
	
	// 생성자
	public IntStack(int maxlen) {
		
		ptr = 0;
		capacity = maxlen;
		
		try {
			
			stk = new int[capacity];		// 스택 본체용 배열을 생성
			
		} catch (OutOfMemoryError e) {
			
			// 생성할 수 없음
			capacity = 0;
			
		}
		
	}

	// 스택에 x를 푸시
	public int push(int x) throws OverflowInStackException {
		
		// 스택이 가득 참
		if (capacity <= ptr) {
			
			throw new OverflowInStackException();
			
		}
		
		return stk[ptr++] = x;
		
	}
	
	// 스택에서 데이터를 꺼냄
	public int pop() throws EmptyInStackException {
		
		// 스택이 비어있음
		if (ptr <= 0) {
			
			throw new EmptyInStackException();
			
		}
		
		return stk[--ptr];
		
	}
	
	// 스택에서 가장 위에 있는 데이터를 확인
	public int peek() throws EmptyInStackException {
		
		// 스택이 비어있음
		if (ptr <= 0) {
			
			throw new EmptyInStackException();
			
		}
		
		return stk[ptr - 1];
		
	}
	
	// 스택을 비움
	public void clear() {
		
		ptr = 0;
		
	}
	
	// 스택에서 x를 찾아 인덱스를 반환(없으면 -1 반환)
	public int indexOf(int x) {
		
		// 꼭대기부터 선형 검색
		for (int i = ptr - 1; 0 <= i; i--) {
			
			if (stk[i] == x) {
				
				return i;	// 검색 성공
				
			}
			
		}
		
		return -1;			// 검색 실패
		
	}
	
	// 스택의 용량을 반환
	public int getCapacity() {
		
		return capacity;
		
	}
	
	// 스택에 쌓여있는 데이터 개수를 반환
	public int size() {
		
		return ptr;
		
	}
	
	// 스택이 비어있는지 확인
	public boolean isEmpty() {
		
		return ptr <= 0;
		
	}
	
	// 스택이 가득 찼는지 확인
	public boolean isFull() {
		
		return capacity <= ptr;
		
	}
	
	// 스택 안의 모든 데이터를 아래에서 위 순서로 출력
	public void dump() {
		
		if (ptr <= 0) {
			
			System.out.println("스택이 비어있습니다.");
			
		} else {
			
			for (int i = 0; i < ptr; i++) {
				
				System.out.print(stk[i] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	// 검색 시 해당하는 인덱스를 반환하기 위함
	public int get(int index) {
		
	    if (index < 0 || ptr <= index ) {
	    	
	    	throw new EmptyInStackException();
	    	
	    }
	    	
	    return stk[index];
	}

}
