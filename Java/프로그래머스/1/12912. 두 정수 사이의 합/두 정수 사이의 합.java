class Solution {
    public long solution(int a, int b) {
        // 1. 데이터 타입 확장 및 항의 개수(n) 계산
        long numCount = Math.abs((long)a - b) + 1;
        
        // 2. 가우스의 등차수열 합 공식 적용 (첫항 + 끝항) * 항의개수 / 2
        // 한 쪽이 long이므로 결과값은 자동으로 long으로 계산됨
        return numCount * (a + b) / 2;
    }
}