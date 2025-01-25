class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i<quiz.length; i++){
            String[] code = quiz[i].split(" ");
            for(int j = 0; j<code.length; j++){
                int a = Integer.parseInt(code[0]);
                int b = Integer.parseInt(code[2]);
                int sum = Integer.parseInt(code[4]);
                if(code[1].equals("+")){
                   if(a + b == sum){
                       answer[i] = "O";
                   } else {
                       answer[i] = "X";
                   }
                } else {
                    if(a - b == sum){
                       answer[i] = "O";
                   } else {
                       answer[i] = "X";
                   }
                }
            }
        }
        return answer;
    }
}