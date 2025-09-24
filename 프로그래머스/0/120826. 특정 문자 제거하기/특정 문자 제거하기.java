class Solution {
    public String solution(String my_string, String letter) {
        // letter를 빈 문자열로 바꿔주면 제거한 것과 같음
        String answer = my_string.replace(letter, "");
        return answer;
    }
}