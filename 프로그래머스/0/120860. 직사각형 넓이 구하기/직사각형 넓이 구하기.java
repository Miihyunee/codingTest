import java.math.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = dots[0][0];
        int y =dots[0][1];
        int h = 0;
        int w = 0;
        for(int i = 0; i<dots.length; i++){
            if(Math.abs(x-dots[i][0]) > 0) {
                h = Math.abs(x-dots[i][0]);
            }
            if(Math.abs(y-dots[i][1]) > 0){
                w = Math.abs(y-dots[i][1]);
            }
        }
        answer = h * w;
        return answer;
    }
}