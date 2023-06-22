package 크기가작은부분문자열;

class Solution {
	public int solution(String t, String p) {
		int answer = 0;
		// 처음에는 Integer 클래스의 parseInt로 문제 제출하였으나
		// 입력되는 String의 최대 길이를 살펴보니 18자리로 되어있어 실패(런타임에러)가 여러차례 존재했다.
		// 문자열을 long타입으로 바꿔서 문제제출 후 통과
		for (int i = 0; i < (t.length() - p.length() + 1); i++) {
			if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {
				// p의 길이만큼 t의 인덱스마다 잘려진 부분문자열을 비교연산을 위해 Integer.parseInt()
				// 처리를 해준 후 비교가 참이면 answer를 카운트한다.
				answer++;
			}
		}
		return answer;
	}
}