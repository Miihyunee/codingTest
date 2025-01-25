import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;
        int[] answer = new int[queries.length];
        for(int i = 0; i<queries.length; i++){
            list.clear();
            for(int j = queries[i][0]; j<=queries[i][1]; j++){
                if(arr[j] > queries[i][2]){
                    list.add(arr[j]);
                }
            }
            if(list.isEmpty()){
                cnt = -1;
            } else {
                Collections.sort(list);
                cnt = list.get(0);
            }
            answer[i] = cnt;
        }
        return answer;
    }
}