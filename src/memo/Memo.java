package memo;

import java.util.*;

public class Memo {
	public static void main(String[] args) {
		String s = "foobar";
		char[] charArray = s.toCharArray(); // 문자열을 char[]로 바꾼다
		Map<Character, Integer> charMap = new HashMap<>(); // 각 문자와 인덱스 정보를 담을 HashMap 생성
		int[] answer = new int[charArray.length]; // 최초 문자열 길이만큼의 정수배열 생성
		for(int i = 0;i<charArray.length;i++) {
			if(charMap.get(charArray[i])==null) {
				// 맵에 해당하는 키가 없다면(최초 발견)
				answer[i] = -1; // 정수배열에 -1 대입
			}else {
				// 아니면(중복데이터) 인덱스 차이에 대한 데이터를 대입해야한다.
				answer[i] = i - charMap.get(charArray[i]); // 기존에 map에 저장했던 index value 를 빼준다.
			}
			charMap.put(charArray[i], i);
			// 인덱스 돌때마다 맵에다가 정보를 넣어줘야한다. 그래야 중복데이터가 있는지 인덱스확인가능
		}
		for(int i = 0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
