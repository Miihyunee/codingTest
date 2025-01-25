class Solution {
    public String solution(String code) {
        int mode = 0;
        String[] text = code.split("");
        String answer = "";
        for(int i = 0; i<text.length; i++){
            if(!text[i].equals("1")){
                if(i % 2 == 0 && mode == 0){
                    answer += text[i];
                } else if(i % 2 != 0 && mode == 1){
                    answer += text[i];
                }
            } else {
                if(mode == 0){
                    mode = 1;
                } else {
                    mode = 0;
                }
            }
        }
        if(answer.length() == 0){
            answer = "EMPTY";
        }
        return answer;
    }
}