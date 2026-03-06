class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // 결과값의 크기가 크므로 long 배열 사용
        
        for (int i = 0; i < n; i++) {
            // (i + 1)을 곱해줄 때 x를 long으로 형변환하여 계산(정수 범위 고려)
            answer[i] = (long)x * (i + 1);
        }
        
        return answer;
    }
}