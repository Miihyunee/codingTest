class Solution {
    public String solution(String s) {
        String[] text = s.split("");
        String answer = "";
        int cnt = 0;
        for(int i = 0; i<text.length; i++){
            if(text[i].contains(" ")){
                cnt = 0;
            } else {
                cnt++;
            }
            if(cnt == 1){
                text[i] = text[i].toUpperCase();
            } else{
                text[i] = text[i].toLowerCase();
            }
            answer += text[i];
        }
        return answer;
    }
}