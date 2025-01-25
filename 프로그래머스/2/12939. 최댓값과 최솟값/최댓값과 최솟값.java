import java.util.*;

class Solution {
    public String solution(String s) {
        String[] text = s.split(" ");
        int[] num = new int[text.length];
        String answer = "";
        for(int i = 0; i<text.length; i++){
            num[i] = Integer.parseInt(text[i]);
        }
        Arrays.sort(num);
        answer = num[0] + " " + num[num.length-1];
        return answer;
    }
}