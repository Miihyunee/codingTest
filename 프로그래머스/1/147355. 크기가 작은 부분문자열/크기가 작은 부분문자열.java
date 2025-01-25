import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int num = p.length();
        for(int i = 0; i<t.length(); i++){
            String text = "";
            if((i+num) <= t.length()){
                text = t.substring(i, num+i);
                if(Long.parseLong(text) <= Long.parseLong(p)){
                    answer++;
                }
            }
        }
        return answer;
    }
}