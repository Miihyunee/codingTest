class Solution {
    public int solution(int left, int right) {
        int idx = 0;
        int[] count = new int[(right-left+1)];
        for(int i = left; i<=right; i++){
            int cnt = 0;
           for(int j = 1; j<=right; j++){
               if(i%j == 0){
                   cnt++;
               }
           }
           count[idx] = cnt;
            idx++;
        }
        int answer = 0;
        for(int i = 0; i<count.length; i++){
            if(count[i] % 2 == 0){
                answer += left;
            } else {
                answer -= left;
            }
            left++;
        }
        return answer;
    }
}