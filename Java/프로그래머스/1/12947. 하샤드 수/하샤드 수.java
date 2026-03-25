class Solution {
    public boolean solution(int x) {
        int originalX = x; // 1. 원본 값 백업
        int sum = 0;

        // 2. 자릿수 합 구하기
        while (x > 0) {
            sum += x % 10; // 일의 자리 더하기
            x /= 10;       // 일의 자리 제거
        }

        // 3. 하샤드 수 판별
        return originalX % sum == 0;
    }
}