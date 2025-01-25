import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i = l; i<=r; i++){
            if(String.valueOf(i).matches("[05]+")){
                resultList.add(i);
            }
        }
        if(resultList.isEmpty()){
            resultList.add(-1);
        }
        int[] answer = new int[resultList.size()];
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}