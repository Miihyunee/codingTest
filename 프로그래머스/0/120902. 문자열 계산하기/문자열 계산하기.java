class Solution {
    public int solution(String my_string) {
        String[] num = my_string.split(" ");
        int answer = Integer.parseInt(num[0]);
        for(int i = 1; i<num.length; i++){
            if(i % 2 != 0){
                if(num[i].equals("+")){
                    answer += Integer.parseInt(num[i+1]);
                } else {
                    answer -= Integer.parseInt(num[i+1]);
                }
            }
        }
        return answer;
    }
}