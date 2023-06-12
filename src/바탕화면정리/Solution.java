package 바탕화면정리;

class Solution {
    public int[] solution(String[] wallpaper) {
        int firstX = Integer.MAX_VALUE;	// 드래그를 시작해야하는 x지점
        int firstY = Integer.MAX_VALUE; // 드래그를 시작해야하는 y지점
        int lastX = Integer.MIN_VALUE; // 드래그를 끝내야하는 x지점
        int lastY = Integer.MIN_VALUE; // 드래그를 끝내야하는 y지점
        
        for(int i = 0;i<wallpaper.length;i++){
            // 바탕화면의 길이 = 파일의 개수
            for(int j = 0;j<wallpaper[0].length();j++){
                // 파일이 있는 위치를 파악한다.(String의 길이만큼 #을 찾음)
                if(wallpaper[i].charAt(j)=='#'){
                    // 파일을 찾았다. 위치를 담는다
                    // 제일 처음 파일을 찾은 i일때를 찾고..마지막 i일 때를 찾아야하는데....
                    firstX = Math.min(firstX, i); // 찾는 파일위치중 가장 작은 x지점을 firstX에 담는다.
                    firstY = Math.min(firstY, j); // 찾는 파일위치중 가장 작은 y지점을 firstY에 담는다.
                    lastX = Math.max(lastX, i); // 찾는 파일 위치중 가장 큰 x지점을 lastX에 담는다.
                    lastY = Math.max(lastY, j); // 찾는 파일 위치중 가장 큰 y지점을 lastY에 담는다.
                }
            }
        }
        int[] answer = {firstX, firstY, lastX+1, lastY+1}; 
        // 마지막에 찾는 파일의 위치는 해당 위치보다 1칸씩 뒤로 가야 드래그에 해당 파일이 포함된다.
        return answer;
    }
}