class Solution {
    public int[] solution(long n) {
        String[] number = String.valueOf(n).split("");
        int[] answer = new int[number.length];
        int idx = 0;
        for(int i = number.length -1; i>=0; i--){
            answer[idx] = Integer.parseInt(number[i]);
            idx++;
        }
        return answer;
    }
}