import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[][] num = new int[rank.length][rank.length];
        int idx = 0;
        for(int i = 0; i<attendance.length; i++){
            if(attendance[i] == true){
                num[i][0] = rank[i];
                num[i][1] = i;
            } else {
                num[i][0] = 999;
                num[i][1] = 999;
            }
        }
       
        Arrays.sort(num, (o1, o2) -> {
            return o1[0] - o2[0]; // num[0]을 기준으로 오름차순 정렬
        });
        
        answer = (num[0][1]*10000) + (num[1][1]*100) + num[2][1];
        
        return answer;
    }
}