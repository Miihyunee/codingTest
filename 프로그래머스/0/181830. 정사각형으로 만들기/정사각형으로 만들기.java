class Solution {
    public int[][] solution(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        int len = a;
        if(a < b){
            len = b;
        }
        int[][] answer = new int[len][len];
        if(a != b){
            for(int i = 0; i<len; i++){
                for(int j = 0; j<len; j++){
                    if(i >= a){
                        answer[i][j] = 0;
                    } else if(j >= b){
                        answer[i][j] = 0;
                    } else {
                        answer[i][j] = arr[i][j];
                    }
                }
            }
        } else {
            answer = arr;
        }
        return answer;
    }
}