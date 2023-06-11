package 추억점수;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; 
        // 사진 속 인원 수만큼 배열 생성
        for(int i = 0;i<photo.length;i++){
            for(int j = 0;j<photo[i].length;j++){
                // photo의 열만큼 점수를 합산
                for(int k = 0;k<name.length;k++){
                    // 그리워하는 사람이 사진속에 있다면..!
                    if(photo[i][j].equals(name[k])){
                        answer[i] += yearning[k]; // 점수 저장!!
                    }
                }
            }
        }
        return answer;
    }
}