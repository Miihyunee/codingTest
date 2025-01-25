class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] result = String.valueOf(x).split("");
        int sum = 0;
        for(int i =0; i<result.length; i++){
            sum += Integer.parseInt(result[i]);
        }
        if(x % sum == 0){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}