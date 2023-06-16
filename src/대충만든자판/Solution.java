package 대충만든자판;

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> hashMap = new HashMap<>(); // keymap에 들어온 키와 최소눌러야할 키의 회수를 담을 맵 생성
        int[] answer = new int[targets.length]; // 타겟의 길이만큼 최소눌러야할 키의 합을 담은 배열 생성
        for(int i = 0;i<keymap.length;i++){
            // 각 인덱스의 String마다
            for(int j = 0;j<keymap[i].length();j++){
                // 해당인덱스에서 캐릭터로 뜯어내서 맵에 저장
                char inputKey = keymap[i].charAt(j);
                if(!hashMap.containsKey(inputKey) || j<hashMap.get(inputKey)){
                    // 최초 한번만 키값으로 인풋키와, 최소숫자(인덱스 j에 +1)로 저장한다.
                    hashMap.put(inputKey, j+1);
                }
            }
        }
        // 맵에 키와 최소타이핑숫자를 저장 후 연산한다.
        for(int i = 0;i<targets.length;i++){
             int count = 0; // 키값을 찾을때마다 count를 계산해서 담을 변수
            // targets[i] 마다 새로 count를 초기화한다.
            for(int j = 0;j<targets[i].length();j++){
                char findKey = targets[i].charAt(j);
                if(!hashMap.containsKey(findKey)){
                    // 맵에 해당 키가 없으면 count 초기화 및 break
                    count = 0;
                    break;
                }else{
                    // 맵에 해당 키를 찾으면 count 누적 합산
                      count += hashMap.get(findKey);
                }
            }
            answer[i] = (count == 0 ? -1 : count);
            // 한번도 카운트를 안하면 -1로 리턴
        }
        return answer;
    }
}