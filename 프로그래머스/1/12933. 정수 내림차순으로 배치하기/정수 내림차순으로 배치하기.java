import java.util.*;

class Solution {
    public long solution(long n) {
        String[] num = String.valueOf(n).split("");
        Arrays.sort(num, Collections.reverseOrder());
        String answer = "";
        for(int i = 0; i<num.length; i++){
            answer += num[i];
        }
        return Long.parseLong(answer);
    }
}