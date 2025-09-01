package algorithm.practice.chap04;

// int형 고정 길이 큐(링 버퍼를 사용하지 않고 구현)
public class IntArrayQueue {

	private int[] que;		// 큐의 본체
	private int capacity;	// 큐의 용량
	private int num;		// 현재 데이터 개수
	
	// 실행 시 예외(큐가 비어있음)
	@SuppressWarnings("serial")
	public class EmptyIntArrayQueueException extends RuntimeException {
		
		public EmptyIntArrayQueueException() {
			
		}
		
	}
	
	// 실행 시 예외(큐가 가득 참)
	@SuppressWarnings("serial")
	public class OverflowIntArrayQueueException extends RuntimeException {
		
		public OverflowIntArrayQueueException() {
			
		}
		
	}
	
	// 생성자
	public IntArrayQueue(int maxlen) {
		
		num = 0;
		capacity = maxlen;
		
		try {
			
			que = new int[capacity];		// 큐 본체용 배열을 생성
			
		} catch (OutOfMemoryError e) {
			
			// 생성할 수 없음
			capacity = 0;
			
		}
		
	}

	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntArrayQueueException {
		
		// 큐가 가득 참
		if (capacity <= num) {
			
			throw new OverflowIntArrayQueueException();
			
		}
		
		que[num++] = x;
		
		return x;
		
	}
	
	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntArrayQueueException {
		
		// 큐가 비어있음
		if (num <= 0) {
			
			throw new EmptyIntArrayQueueException();
			
		}
		
		int x = que[0];
		
		for (int i = 0; i < num - 1; i++) {
			
			que[i] = que[i + 1];
			
		}
		
		num--;
		
		return x;
		
	}
	
	// 큐에서 가장 위에 있는 데이터를 확인
	public int peek() throws EmptyIntArrayQueueException {
		
		// 큐가 비어있음
		if (num <= 0) {
			
			throw new EmptyIntArrayQueueException();
			
		}
		
		return que[num - 1];
		
	}
	
	// 큐를 비움
	public void clear() {
		
		num = 0;
		
	}
	
	// 큐에서 x를 찾아 인덱스를 반환(없으면 -1 반환)
	public int indexOf(int x) {
		
		// 꼭대기부터 선형 검색
		for (int i = 0; i < num; i--) {
			
			if (que[i] == x) {
				
				return i;	// 검색 성공
				
			}
			
		}
		
		return -1;			// 검색 실패
		
	}
	
	// 큐의 용량을 반환
	public int getCapacity() {
		
		return capacity;
		
	}
	
	// 스택에 쌓여있는 데이터 개수를 반환
	public int size() {
		
		return num;
		
	}
	
	// 큐가 비어있는지 확인
	public boolean isEmpty() {
		
		return num <= 0;
		
	}
	
	// 큐가 가득 찼는지 확인
	public boolean isFull() {
		
		return capacity <= num;
		
	}
	
	// 큐의 모든 데이터를 맨 앞에서 맨 끝 순서로 출력
	public void dump() {
		
		if (num <= 0) {
			
			System.out.println("큐가 비어있습니다.");
			
		} else {
			
			for (int i = 0; i < num; i++) {
				
				System.out.print(que[i] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	// 검색 시 해당하는 인덱스를 반환하기 위함
	public int get(int index) {
		
	    if (index < 0 || num <= index ) {
	    	
	    	throw new EmptyIntArrayQueueException();
	    	
	    }
	    	
	    return que[index];
	}

}
