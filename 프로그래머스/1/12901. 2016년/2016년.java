class Solution {
    public String solution(int a, int b) {
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String answer = "";
        int cnt = 0;
        for(int i = 0; i<a; i++){
            cnt += month[i];
        }
        cnt = cnt + b;
        if(cnt%7 == 1){
            answer = "FRI";
        } else if(cnt%7 == 2){
            answer = "SAT";
        } else if(cnt%7 == 3){
            answer = "SUN";
        } else if(cnt%7 == 4){
            answer = "MON";
        } else if(cnt%7 == 5){
            answer = "TUE";
        } else if(cnt%7 == 6){
            answer = "WED";
        } else {
            answer = "THU";
        }
        return answer;
    }
}