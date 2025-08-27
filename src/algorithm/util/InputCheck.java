package algorithm.util;

import java.util.Optional;
import java.util.regex.Pattern;

// 입력 값 검증 클래스
public final class InputCheck {

	// 생성자
	private InputCheck() {

	}

	// 검증 패턴
	private static final Pattern INT_RE = Pattern.compile("^[+-]?\\d+$");				// 정수(부호 + 숫자)
	private static final Pattern DOUBLE_RE = Pattern.compile("^[+-]?\\d+(\\.\\d+)?$");	// 실수(정수 또는 소수점 포함, 지수 제외)
	private static final Pattern NONBLANK = Pattern.compile(".*\\S.*");					// 공백이 아닌 문자열
	private static final Pattern KOR_ENG = Pattern.compile("^[a-zA-Z가-힣]+$");			// 한글, 영문만 허용
	
	// null or 공백 체크
	public static boolean isNonBlank(String s) {
		
		return s != null && NONBLANK.matcher(s).matches();
		
	}
	
	// 정수 검증
	public static boolean isInt(String s) {
		
		// null일 경우
		if (s == null) {
			
			return false;
			
		}
		
		s = s.trim();	// 공백 제거
		
		// 정수 검사
		if (!INT_RE.matcher(s).matches()) {
			
			return false;
			
		}
		
		// 파싱
		try {
			
			Integer.parseInt(s);
			return true;
			
		} catch (NumberFormatException e) {
			
			// TODO: handle exception
			return false;			// 오버, 언더 플로방지
			
		}
		
	} // isInt 종료
	
	// 안전하게 파싱하기 위함
	public static Optional<Integer> parseInt(String s) {
		
		return isInt(s) ? Optional.of(Integer.parseInt(s.trim())) : Optional.empty();
		
	}
	
	// 실수 검증
	public static boolean isDouble(String s) {
		
		// null일 경우
		if (s == null) {
			
			return false;
			
		}
		
		s = s.trim();	// 공백 제거
		
		// 실수 검사
		if (!DOUBLE_RE.matcher(s).matches()) {
			
			return false;
			
		}
		
		// 파싱
		try {
			
			double v = Double.parseDouble(s);
			return !Double.isNaN(v) && !Double.isInfinite(v);	// NaN, Infinity 거르기
			
		} catch (NumberFormatException e) {
			
			// TODO: handle exception
			return false;			// 오버, 언더 플로방지
			
		}
		
	} // isDouble 종료
	
	// 안전하게 파싱하기 위함
	public static Optional<Double> parseDouble(String s) {
		
		return isDouble(s) ? Optional.of(Double.parseDouble(s.trim())) : Optional.empty();
		
	}
	
	// 문자열 규칙(한글, 영문만)
	public static boolean isKorEngAlpha(String s) {
		
		return s != null && KOR_ENG.matcher(s).matches();
		
	}
	
	// 정수 범위 체크
	public static boolean isRanage(int v, int min, int max) {
		
		return min <= v && v <= max;
		
	}
	
	// 실수 범위 체크
	public static boolean isRanage(double v, double min, double max) {
		
		return min <= v && v <= max;
		
	}
	
	// 배열 파싱(한 줄 입력을 토큰으로 쪼개어 전부 숫자여야 성공)
	public static Optional<int[]> parseIntArray(String line, String delimRegex) {
		
		// 빈 줄, 공백 일 경우
		if (!isNonBlank(line)) {
			
			return Optional.empty();
			
		}
		
		String[] tokens = line.trim().split(delimRegex);	// 구분자 기준으로 토큰 분리
		int[] arr = new int[tokens.length];					// 결과를 저장할 배열
		
		// 각 토큰에 대해 정수형일 경우에만 파싱
		for (int i = 0; i < tokens.length; i++) {
			
			var v = parseInt(tokens[i]);
			
			if (v.isEmpty()) {
				
				return Optional.empty();
				
			}
			
		}
		
		return Optional.of(arr);
		
	} // parseIntArray 종료
	
	// 배열 파싱(한 줄 입력을 토큰으로 쪼개어 전부 숫자여야 성공)
	public static Optional<double[]> parseDoubleArray(String line, String delimRegex) {
		
		// 빈 줄, 공백 일 경우
		if (!isNonBlank(line)) {
			
			return Optional.empty();
			
		}
		
		String[] tokens = line.trim().split(delimRegex);	// 구분자 기준으로 토큰 분리
		double[] arr = new double[tokens.length];			// 결과를 저장할 배열
		
		// 각 토큰에 대해 실수형일 경우에만 파싱
		for (int i = 0; i < tokens.length; i++) {
			
			var v = parseDouble(tokens[i]);
			
			if (v.isEmpty()) {
				
				return Optional.empty();
				
			}
			
		}
		
		return Optional.of(arr);
		
	} // parseIntArray 종료

}
