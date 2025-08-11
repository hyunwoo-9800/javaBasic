package algorithm.chap03;

import java.util.Scanner;

// 선형 검색 알고리즘(보초법)
public class SeqSearchSen {

	// 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
	static int seqSearch(int[] a, int n, int key) {

		int i = 0;

		a[n] = key;			// 보초를 추가
		
		while (true) {

			// 검색 성공 시
			if(a[i] == key) {
				
				break;
				
			}
			
			i++;

		} // while 종료
		
		return i == n ? -1 : i;

	} // 메서드 종료

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num + 1 ];						// 요솟수가 num + 1(입력 값 + 1)인 배열

		for(int i = 0; i < num; i++) {
			
			System.out.print("X[" + i + "]: ");
			x[i] = Integer.parseInt(sc.nextLine());
			
		}
		
		System.out.print("검색할 값: ");
		int key = Integer.parseInt(sc.nextLine());
		int idx = seqSearch(x, num, key);			// 배열 x에서 값이 key인 요소를 검색
		
		if (idx == -1) {
			
			System.out.println("그 값의 요소가 없습니다.");
			
		} else {
			
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
			System.out.print("x[" + idx + "] = " + x[idx]);
			
		}
		
		sc.close();
		
	}

}
