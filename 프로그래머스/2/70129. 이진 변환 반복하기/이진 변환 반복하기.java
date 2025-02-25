class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zero = 0;
        int count = 0;
        while(true){
            String[] text = s.split("");
            if(text.length == 1){
                answer[0] = count;
                answer[1] = zero;
                break;
            } else {
                s = "";
                for(int i = 0; i<text.length; i++){
                    if(text[i].equals("0")){
                        zero++;
                    } else {
                       s += text[i]; 
                    }
                }
                s = Integer.toBinaryString(s.length());
                count++;
            }
        }
        return answer;
    }
}