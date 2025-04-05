package thisisjava.ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 컬렉션 객체 생성
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		// 시작 시간과 끝 시간을 저장할 변수
		long startTime;
		long endTime;
		
		// ArrayList 저장 시간 측정
		startTime = System.nanoTime();
		
		for(int i =0 ; i < 10000; i++) {
			
			list1.add(0, String.valueOf(i));
			
		}
		
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간 : " , (endTime - startTime));
		
		// LinkedList 저장 시간 측정
		startTime = System.nanoTime();
		
		for(int i =0 ; i < 10000; i++) {
			
			list2.add(0, String.valueOf(i));
			
		}
		
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간 : " , (endTime - startTime));

	} // main 끝

} // class 끝
