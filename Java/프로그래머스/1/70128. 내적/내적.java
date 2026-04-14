class Solution {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        
        // 두 배열의 길이가 같으므로 a.length 사용
        for (int i = 0; i < a.length; i++) {
            // 같은 인덱스의 값끼리 곱해서 sum에 누적.
            sum += a[i] * b[i]; 
        }
        
        return sum;
    }
}