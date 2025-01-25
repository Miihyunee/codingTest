class Solution {
    public String solution(int[] food) {
        String code = "";
        for(int i  = 1; i<food.length; i++){
            if(food[i] / 2 > 0){
                int a = food[i] / 2;
                for(int j = 0; j<a; j++){
                    code += String.valueOf(i);
                }
            }
        }
        String[] codeS = code.split("");
        String p = "";
        for(int i = codeS.length-1; i>=0; i--){
            p += codeS[i];
        }
        String answer = code + "0" + p;
        return answer;
    }
}