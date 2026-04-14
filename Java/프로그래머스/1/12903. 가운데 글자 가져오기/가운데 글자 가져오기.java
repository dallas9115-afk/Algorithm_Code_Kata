class Solution {
    public String solution(String s) {
        int length = s.length(); // 문자열의 길이
        int mid = length / 2;    // 중간 인덱스 계산
        
        // 1. 짝수일 경우
        if (length % 2 == 0) {
            // mid-1 부터 mid+1 직전(즉, mid)까지 잘라냄.
            return s.substring(mid - 1, mid + 1); 
        } 
        // 2. 홀수일 경우
        else {
            // mid 부터 mid+1 직전(즉, mid) 한 글자만 잘라냄.
            return s.substring(mid, mid + 1); 
        }
    }
}