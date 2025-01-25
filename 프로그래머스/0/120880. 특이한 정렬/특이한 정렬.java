import java.math.*;
import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[][] rank = new int[numlist.length][2];
        int[] answer = new int[numlist.length];
        for(int i = 0; i<numlist.length; i++){
            rank[i][0] = numlist[i];
            rank[i][1] = Math.abs(numlist[i]-n);
        }
        Arrays.sort(rank, (o1, o2) -> {
            if (o1[1] != o2[1]) {
                return o1[1] - o2[1];
            }
            return o2[0] - o1[0];
        });
        for(int i = 0; i<rank.length; i++){
            answer[i] = rank[i][0];
        }
        return answer;
    }
}