import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 1. 스트림 생성 -> 필터링 -> 정렬 -> 배열 변환
        int[] answer = Arrays.stream(arr)
                             .filter(factor -> factor % divisor == 0)
                             .sorted()
                             .toArray();
          
        // 2. 결과가 비어있다면 -1 담은 배열 리턴
        return (answer.length == 0) ? new int[]{-1} : answer;
    }
}