package algorithm.practice.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import algorithm.util.ConsoleInput;
import lombok.Data;

// 내림차순된 시력 중 특정 시력 검색 
public class Q7 {
	// 신체 검사 데이터 정의
	@Data
	static class PhyscData {

		private String name; // 이름
		private int height; // 키
		private double vision; // 시력

		// 생성자
		public PhyscData(String name, int height, double vision) {
			// TODO Auto-generated constructor stub

			this.name = name;
			this.height = height;
			this.vision = vision;

		}

		// 문자열로 만들어 반환하는 메서드
		public String toString() {

			return name + " " + height + " " + vision;

		}

		// 시력의 내림차순으로 정렬
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

		private static class VisionOrderComparator implements Comparator<PhyscData> {

			@Override
			public int compare(PhyscData o1, PhyscData o2) {

				// TODO Auto-generated method stub
				return (o1.vision < o2.vision) ? 1 : (o2.vision < o1.vision) ? -1 : 0;
			}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);

		// 시력의 내림차순으로 정렬
		PhyscData[] x = {
				
				new PhyscData("박준서", 175, 2.0),
				new PhyscData("유서범", 171, 1.5),
				new PhyscData("장경오", 174, 1.2),
				new PhyscData("황지안", 169, 0.8),
				new PhyscData("김찬우", 173, 0.7),
				new PhyscData("이수연", 168, 0.4),
				new PhyscData("강민하", 162, 0.3),
				
		};
		
		
		double vision = ci.readDouble("시력이 몇인 사람을 찾고 있나요?: ");
		
		int idx = Arrays.binarySearch(
				
				x, 									// 배열 x에서
				new PhyscData("", 0, vision),		// 키가 height인 요소를
				PhyscData.VISION_ORDER	   			// VISION_ORDER에 의해 검색
				
				);
		
		if (idx < 0) {
			
			System.out.println("그 값의 요소가 없습니다.");
			
		} else {
			
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
			System.out.println("전체 데이터:" + Arrays.toString(x));
			System.out.println("찾은 데이터: " + x[idx]);
			
		}

	}
}
