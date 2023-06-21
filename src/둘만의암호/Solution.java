package 둘만의암호;

class Solution {
	public String solution(String s, String skip, int index) {
		String answer = "";
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			// s의 길이만큼 검사시작, 매번 index만큼 뒤로 돌린다.
			for (int j = 0; j < index; j++) {
				// index 만큼 뒤로 넘기는 작업 수행
				// 작업수행중 skip에 있는 알파뱃을 만나면 제외하고 건너뛴다.
				// 아스키코드 활용하여 +1씩 index 계속처리해준다.(알파벳을 바꾼다.)
				charArray[i]++;
				if (charArray[i] > 122) {
					// 알파벳을 1씩 index만큼 계속증가시키는 동안 122(z)가 넘어가는 순간
					// 아스키코드 z = 122, 해당 알파벳에 -26연산처리를 해주면 z->a
					charArray[i] -= 26;
				}
				while (skip.contains(String.valueOf(charArray[i]))) {
					// charArray[i]의 문자가 skip에 포함되어있는경우 한번더 ++
					// 이 조건으로 넘겨진 문자가 또 skip 문자열에 있을경우도 생각해봐야함 if->while
					// 넘겨진 문자를 계속 비교하는 조건을 생각을 못하였다.
					charArray[i]++;
					if (charArray[i] > 122) {
						charArray[i] -= 26;
					}
				}
			}
		}
		answer = String.valueOf(charArray);
		return answer;
	}
}