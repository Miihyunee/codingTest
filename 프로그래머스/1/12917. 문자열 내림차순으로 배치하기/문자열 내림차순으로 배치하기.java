import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] text = s.split("");
        Arrays.sort(text, Collections.reverseOrder());
        for(int i = 0; i<text.length; i++){ 
            answer += text[i];
        }
        return answer;
    }
}