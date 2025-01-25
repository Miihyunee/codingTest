class Solution {
    public int solution(int num) {
        int answer = 0;
        int result = num;
        if(result == 1){
            answer = 0;
        } else {
            for(int i = 0; i<500; i++){
                if(result > 1){
                    if(result % 2 == 0){
                        result = result / 2;
                        answer++;
                    } else {
                        result = result * 3 + 1;
                        answer++;
                    }
                }
            }
            if(result != 1){
                answer = -1;
            }
        }
        return answer;
    }
}