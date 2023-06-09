package 달리기경주;

import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
    	// 달리기경주
        String[] answer = new String[players.length];
        HashMap<String, Integer> playerMap = new HashMap<>();
        HashMap<Integer, String> rankMap = new HashMap<>();
        
        // 맵 초기화
        for(int i = 0;i<players.length;i++){
            playerMap.put(players[i], i);
            rankMap.put(i,players[i]);
        }
        
        for(int i = 0;i<callings.length;i++){
        	// 해설자가 이름을 불렀다면, 앞선 선수를 추월했다는 뜻
            // 추월한 유저 순위
            // 추월한 유저 이름
            int currentRank = playerMap.get(callings[i]);
            String player = rankMap.get(currentRank);
           
            // 앞서달리던 유저
            String frontPlayer = rankMap.get(currentRank-1);
            
            // 순서 바꿔치기
            playerMap.put(player, currentRank-1);
            playerMap.put(frontPlayer, currentRank);
            
            rankMap.put(currentRank-1, player);
            rankMap.put(currentRank, frontPlayer);
        }
        
        for(int i = 0;i<players.length;i++){
            answer[i] = rankMap.get(i);
        }
        return answer;
    }
}