class Solution {
    public int[] solution(long n) {
        // 1. 숫자의 길이를 파악해 배열 크기 지정
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        
        int i = 0;
        // 2. 10으로 나눈 나머지를 배열에 순서대로 담기
        while (n > 0) {
            answer[i] = (int)(n % 10); // 나머지는 항상 0~9이므로 int로 형변환
            n /= 10; // 다음 자릿수로 이동
            i++;
        }
        
        return answer;
    }
}