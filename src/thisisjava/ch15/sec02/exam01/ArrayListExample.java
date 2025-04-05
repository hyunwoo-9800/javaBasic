package thisisjava.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 컬렉션 리스트 생성
		ArrayList<Board> list = new ArrayList<>();

		// 객체 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);

		for (int i = 0; i < list.size(); i++) {

			Board b = list.get(i);
			System.out.println(i + "번\t" +
							   b.getSubject() + "\t" +
							   b.getContent() + "\t" +
							   b.getWriter());

		}

		System.out.println("================================");
		System.out.println();

		// 특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(2 + "번\t" +
						   board.getSubject() + "\t" +
						   board.getContent() + "\t" +
						   board.getWriter());

		System.out.println("================================");
		System.out.println();

		// 객체 삭제
		list.remove(2);

		for (int i = 0; i < list.size(); i++) {

			Board b = (Board) list.get(i);
			System.out.println(i + "번\t" +
							   b.getSubject() + "\t" +
							   b.getContent() + "\t" +
							   b.getWriter());

		}

		System.out.println("================================");
		System.out.println();

		list.remove(2);

		for (int i = 0; i < list.size(); i++) {

			Board b = (Board) list.get(i);
			System.out.println(i + "번\t" +
							   b.getSubject() + "\t" +
							   b.getContent() + "\t" +
							   b.getWriter());

		}

		System.out.println("================================");
		System.out.println();

		// 향상된 for문으로 모든 객체를 하나씩 가져오기
		int cnt = 0;
		for (Board b : list) {

			System.out.println(cnt + "번\t" +
							   b.getSubject() + "\t" +
							   b.getContent() + "\t" +
							   b.getWriter());
			cnt++;
		}

		System.out.println("================================");
		System.out.println();

		// 람다식 표현
		AtomicInteger counter = new AtomicInteger(0);
		list.forEach(t -> System.out.println(counter.getAndIncrement() + "번\t" +
											 t.getSubject() + "\t" +
											 t.getContent() + "\t" +
											 t.getWriter()));

	} // main 끝

}// class 끝
