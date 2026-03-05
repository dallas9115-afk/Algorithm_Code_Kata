class Solution {
    public int solution(int n) {
        int target = n - 1; // 나머지가 1 = -1한 값이 가장 작은 약수를 찾는 것과 같음
        for (int i = 2; i * i <= target; i++) {
            if (target % i == 0) {
                return i;
            } // 2부터 n-1의 제곱근까지 반복하며 가장 작은 약수를 리턴함
        }
        // 소수일 경우 n-1 자체가 가장 작은 약수(1 제외)
        return target;
    }
}