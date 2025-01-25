class Solution {
    public int solution(int[] common) {
        int a = common[1] - common[0];
        int b = common[2] - common[1];
        int answer = 0;
        if(a == b){
            answer = common[common.length-1] + a;
        } else {
            for(int i = 1; i<2000; i++){
                if(a * i == b){
                    answer = common[common.length-1] * i;                    
                } else if(a * i == b * -1){
                    answer = common[common.length-1] * i * -1;
                }
            }
        }
        return answer;
    }
}