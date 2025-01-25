class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = s.length() / 2;
        System.out.println(cnt);
        if(s.length() % 2 != 0){
            answer = s.substring(cnt, cnt+1);
        } else {
            answer = s.substring(cnt-1, cnt+1);
        }
        return answer;
    }
}