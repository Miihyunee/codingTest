public class Solution {
    public int solution(int n) {
        String[] numbers = String.valueOf(n).split("");
        int answer = 0;
        for(int i = 0; i<numbers.length; i++){
            answer += Integer.parseInt(numbers[i]);
        }
        return answer;
    }
}