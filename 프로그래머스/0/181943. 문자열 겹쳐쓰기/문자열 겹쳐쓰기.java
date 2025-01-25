class Solution {
    public String solution(String my_string, String overwrite_string, int s) {     
        String a = my_string.substring(0, s) + overwrite_string;
        String b = my_string.substring(a.length());
        String answer = a + b;
        return answer;
    }
}