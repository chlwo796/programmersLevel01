package 덧칠하기;

class Solution {
	public int solution(int n, int m, int[] section) {
		// int n = 총 벽의 길이
		// int m = 롤러의 길이(한번에색칠할수있는길이)
		// int[] section = 칠해야하는 구역의 인덱스배열
		int answer = 1; // 해당 롤러로 칠할 수 있는 최소방법의 수(최소1번)
		int firstPoint = section[0]; // 최초 색칠을시작하는 섹션의 인덱스
		int lastPoint = section[0] + (m - 1); // 처음 색칠을 시작했을때 끝나는 인덱스(시작점을 포함하므로 m-1 만큼만 더 칠해진다)
		for (int i = 0; i < section.length; i++) {
			if (section[i] >= firstPoint && section[i] <= lastPoint) {
				// firstPoint와 lastPoint 사이에 있는 인덱스값은 칠할수있는 회수의 변함이 없다. 최초1번으로칠해짐
				continue;
			} else {
				// lastPoint 를 넘어가는 index값을 만나게되면 한번 더 칠한다.
				firstPoint = section[i]; // 시작점 초기화
				lastPoint = section[i] + (m - 1); // 칠 끝나는 시점 초기화
				answer++; // 그때마다 한번 더 칠함
			}
		}
		return answer;
	}
}