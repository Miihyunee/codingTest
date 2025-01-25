class Solution {
    public String solution(String s) {
        String[] sen = s.split("");
        String answer = "";
        int cnt = 0;
        for(int i = 0; i<sen.length; i++){
            if(sen[i].contains(" ")){
                cnt = 0;
            } else {
                cnt++;
            }
            if(cnt % 2 == 0){
                answer += sen[i].toLowerCase();
            } else {
                answer += sen[i].toUpperCase();
            }
            System.out.println(sen[i]);
            System.out.println("cnt=== " + cnt);
        }
        return answer;
    }
}