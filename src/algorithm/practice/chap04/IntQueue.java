package algorithm.practice.chap04;

// int형 고정 길이 큐
public class IntQueue {

	private int[] que;		// 큐용 배열
	private int capacity;	// 큐의 용량
	private int front;		// 맨 앞의 요소 커서
	private int rear;		// 맨 뒤의 요소 커서
	private int num;		// 현재 데이터 개수
	
	// 실행 시 예외(큐가 비어있음)
	@SuppressWarnings("serial")
	public class EmptyIntQueueException extends RuntimeException {
		
		public EmptyIntQueueException() {
			
		}
		
	}
	
	// 실행 시 예외(큐가 가득 참)
	@SuppressWarnings("serial")
	public class OverflowIntQueueException extends RuntimeException {
		
		public OverflowIntQueueException() {
			
		}
		
	}
	
	// 생성자
	public IntQueue(int maxlen) {
		
		num = front = rear = 0;
		capacity = maxlen;
		
		try {
			
			que = new int[capacity];		// 큐 본체용 배열을 생성
			
		} catch (OutOfMemoryError e) {
			
			// 생성할 수 없음
			capacity = 0;
			
		}
		
	}

	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException {
		
		// 큐가 가득 참
		if (capacity <= num) {
			
			throw new OverflowIntQueueException();
			
		}
		
		que[rear++] = x;
		num++;
		
		if (rear == capacity) {
			
			rear = 0;
			
		}
		
		return x;
		
	}
	
	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException {
		
		// 큐가 비어있음
		if (num <= 0) {
			
			throw new EmptyIntQueueException();
			
		}
		
		int x = que[front++];
		num--;
		
		if (front == capacity) {
			
			front = 0;
			
		}
		
		return x;
		
	}
	
	// 큐에서 가장 위에 있는 데이터를 확인
	public int peek() throws EmptyIntQueueException {
		
		// 큐가 비어있음
		if (num <= 0) {
			
			throw new EmptyIntQueueException();
			
		}
		
		return que[num - 1];
		
	}
	
	// 큐를 비움
	public void clear() {
		
		num = front = rear = 0;
		
	}
	
	// 큐에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환합니다.
	public int indexOf(int x) {
		
		for(int i = 0; i < num; i++) {
			
			int idx = (i + front) % capacity;
			
			if (que[idx] == x) {
				
				return idx;		// 검색 성공
				
			}
			
		}
		
		return -1;				// 검색 실패
		
	}
	
	
	// 큐에서 x를 검색하여 맨앞에서 몇 번째인가(발견하지 못하면 0)를 반환합니다
	public int search(int x) {
		
		for (int i = 0; i < num; i++) {
			
			if (que[(i + front) % capacity] == x) {
				
				return i + 1;	// 검색 성공
				
			}
			
		}
		
		return 0;			// 검색 실패
		
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
				
				System.out.print(que[(i + front) % capacity] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	// 검색 시 해당하는 인덱스를 반환하기 위함
	public int get(int index) {
		
	    if (index < 0 || num <= index ) {
	    	
	    	throw new EmptyIntQueueException();
	    	
	    }
	    	
	    return que[index];
	}

}
