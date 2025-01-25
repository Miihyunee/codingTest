import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int s = sides[0];
        int l = sides[1];
        int answer = 0;
        for(int i = 0; i<s+l; i++){
            if(l < s+i && i <= l){
                answer++;
            } else if(i < s+l && i > l){
                answer++;
            }
        }
        return answer;
    }
}