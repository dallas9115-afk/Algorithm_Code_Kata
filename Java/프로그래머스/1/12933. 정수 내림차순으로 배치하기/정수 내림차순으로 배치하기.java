import java.util.*;

public class Solution {
    public long solution(long n) {
        // 1. 숫자를 담을 ArrayList 생성
        List<Long> digits = new ArrayList<>();
        
        // 2. 10의 나머지(%)와 나누기(/)를 이용해 자릿수 분해
        while (n > 0) {
            digits.add(n % 10); // 마지막 자리 추출
            n /= 10;            // 마지막 자리 제거
        }
        
        // 3. 내림차순으로 정렬
        Collections.sort(digits, Collections.reverseOrder());
        
        // 4. 리스트의 숫자를 다시 하나의 숫자로 조합
        long answer = 0;
        for (long digit : digits) {
            answer = (answer * 10) + digit;
        }
        
        return answer;
    }
}