class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        String[] result = s.toLowerCase().split("");
        for(int i = 0; i<result.length; i++){
            if(result[i].equals("p")){
                p++;
            }
            if(result[i].equals("y")){
                y++;
            }
        }
        if(p == y){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}