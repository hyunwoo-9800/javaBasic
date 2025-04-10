package thisisjava.javaTest.roulette;

import lombok.Data;

// 룰렛 게임 클래스
@Data
public class Roulette {

	private String deviceId; 			// 기기아이디
	private String branchName; 			// 지점명
	private int totalPoint; 			// 총합 포인트
	private int successesCnt; 			// 성공횟수
	private int failureCnt; 			// 실패횟수
	private int remainCnt; 				// 잔여 시도 횟수
	private int revenue; 				// 매출액

	public Roulette() {
		// TODO Auto-generated constructor stub
	}
	
	// 생성자
	public Roulette(String deviceId, String branchName) {

		this.deviceId = deviceId;
		this.branchName = branchName;

		this.successesCnt = 0;
		this.failureCnt = 0;
		this.remainCnt = 0;
		this.revenue = 0;

	}

}
