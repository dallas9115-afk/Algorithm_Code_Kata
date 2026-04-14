class Solution {
    public int solution(int[] numbers) {
        // 0부터 9까지의 총합은 무조건 45임.
        int sum = 45; 
        
        // 배열에 있는 숫자들을 모두 뺌.
        for (int num : numbers) {
            sum -= num;
        }
        
        // 남은 값이 곧 '없는 숫자들의 합'이 됨(차집합).
        return sum;
    }
}