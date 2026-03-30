class Solution {
    public int solution(int num) {
        // 1. 오버플로우를 방지하기 위해 입력값을 long 타입으로 변환 
        long n = num; 
        
        // 2. 횟수를 저장하는 값을 tryNum이라 하고 0으로 초기화
        int tryNum = 0; 
        
        // 입력된 수가 이미 1이라면 while문을 타지 않고 바로 0을 반환합니다.
        while (n != 1) { 
            // 3. tryNum이 500을 넘으면 -1을 early return
            if (tryNum >= 500) {
                return -1;
            }
            
            // 4. 조건문 반복: 짝수면 2로 나누고, 홀수면 3을 곱하고 1을 더함
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            
            // 횟수를 1 증가
            tryNum++;
        }
        
        // 5. 1에 도달했다면 누적된 횟수를 반환
        return tryNum;
    }
}