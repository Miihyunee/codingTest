import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        int[] num = new int[arr.length];
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<num.length; i++){
            num[i] = arr[i];
        }
        Arrays.sort(num);
        int min = num[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > min){
                answer.add(arr[i]);
            }
        }
        if(answer.size() == 0){
            answer.add(-1);
        }
        return answer;
    }
}