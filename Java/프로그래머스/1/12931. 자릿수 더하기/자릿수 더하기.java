import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n>0){
            answer += n % 10; // 10으로 나눈 나머지는 일의 자리 숫자
            n /= 10; // n을 10으로 나누면 1의 자리가 사라진 나머지 숫자가 남음
                    // 상기 로직을 반복하면 한 자리 씩 추출되고 더해짐
        }

        return answer;
    }
}