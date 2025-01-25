class Solution {
    public String[] solution(String[] picture, int k) {
        String[] ans1 = new String[picture.length];
        String[] answer = new String[ans1.length * k];
        for(int i = 0; i<picture.length; i++){
            String text = "";
            String[] code = picture[i].split("");
            for(int j = 0; j<code.length; j++){
                for(int n = 0; n<k; n++){
                    text += code[j];
                }
            }
            ans1[i] = text; 
        }
        int idx = 0;
        for(int i = 0; i<ans1.length; i++){
            for(int n = 0; n<k; n++){
                answer[idx] = ans1[i];
                idx++;
            }
        }
        return answer;
    }
}