package 카드뭉치;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int checkCards1Idx = 0;
        int checkCards2Idx = 0;
        // 비교
        // index로 비교
        for(int i = 0;i<goal.length;i++){
            // goal index마다 비교한다.
            if(checkCards1Idx<cards1.length && goal[i].equals(cards1[checkCards1Idx])){
                // checkCards1Idx가 전체 cards1 길이보다 짧을 경우만(카드마지막단어 비교 후 더 이상 비교x)
                // goal에 해당 cards1의 인덱스의 단어가 같다면!!
                // 비교인덱스 증가처리
                checkCards1Idx++;
                continue;
            }
            if(checkCards2Idx<cards2.length && goal[i].equals(cards2[checkCards2Idx])){
                // checkCards12Idx가 전체 cards2 길이보다 짧을 경우만
                // goal에 해당 cards2의 인덱스의 단어가 같다면!!
                // 비교인덱스 증가처리
                checkCards2Idx++;
                continue;
            }
            // goal의 마지막인덱스까지 cards1, cards2 인덱스에 한번이라도 해당하지않는 단어가 있으면
            // 해당블록에서 answer에 "No"를 대입한 후 바로 리턴해준다.(이후로 반복x)
            answer = "No";
            return answer;
        }
        return answer;
    }
}
