import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        // 배열을 List로 변환한 뒤, "Kim"이 있는 인덱스를 찾아 문자열에 삽입
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }
}