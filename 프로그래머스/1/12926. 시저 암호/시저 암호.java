class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            int text = s.charAt(i);
            int code = text + n;
            if(text != 32){
                if(text > 64 && text < 91){
                    if(code > 90){
                        code = code - 26;
                    } else {
                        code = code;
                    }
                } else {
                    if(code > 122){
                        code = code - 26;
                    } else {
                        code = code;
                    }
                }
            } else {
                code = 32;
            }
            char result = (char)code;
            answer += result;
        }
        return answer;
    }
}