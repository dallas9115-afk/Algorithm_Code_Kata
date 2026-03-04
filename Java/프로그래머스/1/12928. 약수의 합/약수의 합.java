class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            // n을 i로 나눈 나머지가 0이면 i는 n의 약수
            if (n % i == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}