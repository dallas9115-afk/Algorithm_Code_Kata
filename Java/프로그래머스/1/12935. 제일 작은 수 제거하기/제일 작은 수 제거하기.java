class Solution {
    public int[] solution(int[] arr) {
        // 1. Early Return
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        
        // 2. 최솟값 찾기
        int min = arr[0]; // 첫 번째 원소를 임시 최솟값으로 설정
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // 3. 최솟값을 제외한 새 배열 만들기 (길이는 기존 배열 - 1)
        int[] answer = new int[arr.length - 1];
        int index = 0; // 새 배열(answer)에 값을 넣을 때 사용할 인덱스
        
        // 4. 데이터 복사
        for (int num : arr) {
            // 현재 숫자가 최솟값과 같다면 새 배열에 넣지 않고 건너뜁니다.
            if (num == min) {
                continue; 
            }
            // 최솟값이 아니라면 새 배열에 차례대로 담습니다.
            answer[index++] = num;
        }
        
        return answer;
    }
}