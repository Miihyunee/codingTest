class Solution {
    boolean solution(String s) {
        String[] text = s.split("");
        int open = 0;
        int close = 0;
        boolean answer = true;
        for(int i =0; i<text.length; i++){
            if(open >= close){
                if(text[i].equals("(")){
                    open++;
                } else {
                    close++;
                }
            } else if(open < close){
                answer = false;
            }
        }
        if(open != close){
            answer = false;
        }
        return answer;
    }
}