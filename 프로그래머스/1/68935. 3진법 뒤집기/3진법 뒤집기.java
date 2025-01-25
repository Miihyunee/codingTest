class Solution {
    public int solution(int n) {
        String a = Integer.toString(n, 3);
        String[] text = a.split("");
        String result = "";
        for(int i = text.length-1; i>=0; i--){
            result += text[i];
        }
        int answer = Integer.parseInt(result, 3);
        return answer;
    }
}