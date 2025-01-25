class Solution {
    public int[] solution(String s) {
        String[] text = s.split("");
        int[] answer = new int[s.length()];
        for(int i = 0; i<text.length; i++){
            if(i == 0){
                answer[i] = -1;
            } else {
                for(int j = i-1; j>=0; j--){
                    if(text[i].equals(text[j])){
                        answer[i] = i-j;
                        break;
                    } else {
                        answer[i] = -1;
                    }
                }
            }
        }
        return answer;
    }
}