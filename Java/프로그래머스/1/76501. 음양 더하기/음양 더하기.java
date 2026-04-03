class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0; // 합계를 저장할 변수
        
        // 배열의 길이만큼 반복
        for (int i = 0; i < absolutes.length; i++) {
            // signs[i]가 true면 양수를, false면 음수를 더함
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }
        
        return answer;
    }
}