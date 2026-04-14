class Solution {
    public String solution(String phone_number) {
        // 1. 문자열을 문자 배열(char array)로 변환.
        char[] chars = phone_number.toCharArray();
        
        // 2. 뒷 4자리를 제외한 앞부분까지만 반복.
        for (int i = 0; i < chars.length - 4; i++) {
            chars[i] = '*'; // 해당 위치의 문자를 별표로 덮어씀.
        }
        
        // 3. 변경된 문자 배열을 다시 String으로 만들어 반환.
        return new String(chars);
    }
}