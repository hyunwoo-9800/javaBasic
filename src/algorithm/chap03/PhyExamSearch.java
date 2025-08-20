package algorithm.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import algorithm.util.InputCheck;
import lombok.Data;

// 신체검사 데이터 배열에서 이진 검색
public class PhyExamSearch {

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

		// 키의 오름차순으로 정렬
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhyscData> {

			@Override
			public int compare(PhyscData o1, PhyscData o2) {

				// TODO Auto-generated method stub
				return (o2.height < o1.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
			}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		InputCheck ic = new InputCheck();

		// 키의 오름차순으로 정렬
		PhyscData[] x = {

				new PhyscData("강민하", 162, 0.3),
				new PhyscData("이수연", 168, 0.4),
				new PhyscData("황지안", 169, 0.8),
				new PhyscData("유서범", 171, 1.5),
				new PhyscData("김찬우", 173, 0.7),
				new PhyscData("장경오", 174, 1.2),
				new PhyscData("박준서", 175, 2.0),

		};
		
		
		int height = ic.getValidInt("키가 몇 cm인 사람을 찾고 있나요?: ", sc);
		
		int idx = Arrays.binarySearch(
				
				x, 									// 배열 x에서
				new PhyscData("", height, 0.0),		// 키가 height인 요소를
				PhyscData.HEIGHT_ORDER				// HEIGHT_ORDER에 의해 검색
				
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
