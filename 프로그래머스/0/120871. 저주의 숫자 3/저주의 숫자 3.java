import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<=500; i++){
            if(i % 3 != 0 && !String.valueOf(i).contains("3")){
                numbers.add(i);
            }
        }
        int answer = numbers.get(n-1);
        return answer;
    }
}