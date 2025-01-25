class Solution {
    public String solution(String my_string) {
        String[] text = my_string.split("");
        String answer = "";
        for(int i = 0; i<text.length; i++){
            if(!answer.contains(text[i])){
                answer += text[i];   
            }
        }
        return answer;
    }
}